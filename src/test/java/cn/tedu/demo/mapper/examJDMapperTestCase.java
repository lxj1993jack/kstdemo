package cn.tedu.demo.mapper;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import cn.tedu.demo.entity.ExamJD;


@RunWith(SpringRunner.class)
@SpringBootTest
public class examJDMapperTestCase {

	@Autowired
	ExamJDMapper examJDMapper;
	
	@Test
	public void listByType() {
		List<ExamJD> result = examJDMapper.listByType(2);
		System.out.println(result);
	}

}






















