package cn.tedu.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.demo.entity.User;
import cn.tedu.demo.service.impl.UserServiceImpl;
import cn.tedu.demo.util.ResponseResult;

/**
 * 处理用户数据的控制器
 */
@RestController
@RequestMapping("users")
public class UserController extends BaseController{
	
	@Autowired
	UserServiceImpl userserviceImpl;
	
	@PostMapping("reg")
	public ResponseResult<Void> reg(User user){
		userserviceImpl.reg(user);
		return new ResponseResult<>(SUCCESS);
	}
	
	@PostMapping("login")
	public ResponseResult<User> login(String username,String password,HttpSession session){
		User result = userserviceImpl.login(username, password);
		session.setAttribute("username", result.getUsername());
		return new ResponseResult<>(SUCCESS,result);
	}
	
}

























