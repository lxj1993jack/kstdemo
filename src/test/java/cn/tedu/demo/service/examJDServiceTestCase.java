package cn.tedu.demo.service;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.demo.entity.ExamJD;
import cn.tedu.demo.service.impl.ExamJDServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class examJDServiceTestCase {

	@Autowired
	ExamJDServiceImpl jsImpl;
	
	@Test
	public void listByType() {
		List<ExamJD> result = jsImpl.listAll(3);
		System.out.println(result.toString());
	}

}






















