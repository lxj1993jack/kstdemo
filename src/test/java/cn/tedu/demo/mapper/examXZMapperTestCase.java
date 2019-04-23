package cn.tedu.demo.mapper;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import cn.tedu.demo.entity.ExamXZ;


@RunWith(SpringRunner.class)
@SpringBootTest
public class examXZMapperTestCase {

	@Autowired
	ExamXZMapper examXZMapper;
	
	@Test
	public void listByType() {
		List<ExamXZ> result = examXZMapper.listByType(1);
		System.out.println(result);
	}
	
	

}






















