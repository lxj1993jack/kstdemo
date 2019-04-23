package cn.tedu.demo.service;

import cn.tedu.demo.entity.User;
import cn.tedu.demo.service.ex.InsertException;
import cn.tedu.demo.service.ex.PasswordNotMatchException;
import cn.tedu.demo.service.ex.UserNotFoundException;
import cn.tedu.demo.service.ex.UsernameDuplicateException;

/**
 * 处理用户数据的业务层实现接口
 */
public interface IUserService {
	
	/**
	 * 用户注册
	 * @param user 用户数据
	 * @throws UsernameDuplicateException
	 * @throws InsertException
	 */
	void reg(User user) throws UsernameDuplicateException,InsertException;
	
	/**
	 * 用户登录 
	 * @param username 用户名
	 * @param password 密码
	 * @return 登录的用户数据
	 * @throws UserNotFoundException
	 * @throws PasswordNotMatchException
	 */
	User login(String username,String password) throws UserNotFoundException,PasswordNotMatchException;
	
}
