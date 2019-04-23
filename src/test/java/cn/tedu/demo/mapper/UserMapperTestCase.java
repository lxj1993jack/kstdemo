package cn.tedu.demo.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import cn.tedu.demo.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {

	@Autowired
	UserMapper userMapper;
	
	@Test
	public void insert() {
		User user = new User();
		user.setUsername("qwe1");
		user.setPassword("qwe");
		user.setSalt("qwe");
		Integer row1 = userMapper.insert(user);
		System.out.println(row1);
	}

}






















