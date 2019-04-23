package cn.tedu.demo.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import cn.tedu.demo.entity.User;
import cn.tedu.demo.mapper.UserMapper;
import cn.tedu.demo.service.IUserService;
import cn.tedu.demo.service.ex.InsertException;
import cn.tedu.demo.service.ex.PasswordNotMatchException;
import cn.tedu.demo.service.ex.UserNotFoundException;
import cn.tedu.demo.service.ex.UsernameDuplicateException;

/**
 * 处理用户数据的业务层实现类
 */
@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	UserMapper userMapper;
	
	public String getMd5Password(String salt,String password) {
		String pwd = salt+password+salt;
		for(int i=0;i<5;i++) {
			pwd = DigestUtils.md5DigestAsHex(pwd.getBytes());
		}
		return pwd;
	}

	@Override
	public void reg(User user) throws UsernameDuplicateException, InsertException {
		User result = userMapper.findByUsername(user.getUsername());
		if(result!=null) {
			throw new UsernameDuplicateException("该用户名已被使用");
		}
		String salt = UUID.randomUUID().toString();
		String md5Password = getMd5Password(salt, user.getPassword());
		user.setSalt(salt);
		user.setPassword(md5Password);
		Integer rows = userMapper.insert(user);
		if(rows!=1) {
			throw new InsertException("添加失败");
		}
	}

	@Override
	public User login(String username, String password) throws UserNotFoundException, PasswordNotMatchException {
		User result = userMapper.findByUsername(username);
		if(result==null) {
			throw new UserNotFoundException("该用户名不存在");
		}
		String salt = result.getSalt();
		String md5Password = getMd5Password(salt, password);
		if(!md5Password.equals(result.getPassword())) {
			throw new PasswordNotMatchException("密码错误");
		}
		return result;
	}
	
}


































