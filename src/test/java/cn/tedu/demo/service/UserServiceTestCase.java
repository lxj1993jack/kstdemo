package cn.tedu.demo.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.demo.entity.User;
import cn.tedu.demo.service.ex.ServiceException;
import cn.tedu.demo.service.impl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Test
	public void reg() {
		User user = new User();
		user.setUsername("qwe2");
		user.setPassword("qwe");
		try {
			userServiceImpl.reg(user);
			System.out.println("注册成功");
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}






















