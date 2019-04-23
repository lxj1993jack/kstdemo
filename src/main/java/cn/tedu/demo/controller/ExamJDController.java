package cn.tedu.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.tedu.demo.entity.ExamJD;
import cn.tedu.demo.service.impl.ExamJDServiceImpl;
import cn.tedu.demo.util.ResponseResult;

/**
 * 处理测试题的控制器
 */

@RestController
@RequestMapping("examJD")
public class ExamJDController extends BaseController{
	
	@Autowired
	ExamJDServiceImpl examJDImpl;
	
	@PostMapping("exam_jd")
	public ResponseResult<Void> examJd(Integer type,Integer num,HttpSession session){
		List<ExamJD> data = new ArrayList<>();
		if(type==0) {
			data = examJDImpl.listAll(num);
		}else {
			data = examJDImpl.listByType(type, num);
		}
		session.setAttribute("list", data);
		return new ResponseResult<>(SUCCESS);
	}
	
	@GetMapping("jd_num")
	public ResponseResult<List<ExamJD>> jdNum(HttpSession session){
		@SuppressWarnings("unchecked")
		List<ExamJD> data = (List<ExamJD>)session.getAttribute("list");
		return new ResponseResult<List<ExamJD>>(SUCCESS,data);
	}
	
}
























