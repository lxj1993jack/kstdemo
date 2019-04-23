package cn.tedu.demo.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.tedu.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.tedu.demo.controller.ex.ExamNoAllDoExcepion;
import cn.tedu.demo.entity.ExamXZ;
import cn.tedu.demo.service.impl.ExamXZServiceImpl;
import cn.tedu.demo.util.ResponseResult;


/**
 * 处理测试题的控制器
 */
@RestController
@RequestMapping("examXZ")
public class ExamXZController extends BaseController{
	
	List<ExamXZ> list;
	@Autowired
	ExamXZServiceImpl examXZImpl;
	
	@PostMapping("exam_xz")
	public ResponseResult<Void> examXZ(Integer type,Integer num,HttpSession session){
		List<ExamXZ> data = new ArrayList<>();
		if(type==0) {
			data = examXZImpl.listAll(num);
		}else {
			data = examXZImpl.listByType(type, num);
		}
		list = data;
		return new ResponseResult<>(SUCCESS);
	}
	
	@GetMapping("xz_num")
	public ResponseResult<List<ExamXZ>> xzNum(){
		return new ResponseResult<List<ExamXZ>>(SUCCESS,list);
	}
	
	@PostMapping("xz_result")
	public ResponseResult<ResultVO> xz_result(HttpServletRequest request, HttpSession session){
		StringBuilder builder = new StringBuilder();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			String[] str = request.getParameterValues(i + "");
			if(str==null) {
				throw new ExamNoAllDoExcepion("还有题目未做完");
			}
			if(list.get(i).getType1()==1) {
				if(str[0].equals(list.get(i).getAnsid())) {
					result.add(1);
				}else {
					result.add(2);
				}
			}else {
				for(String s:str) {
					builder.append(s);
				}
				if(builder.toString().equals(list.get(i).getAnsid())) {
					result.add(1);
				}else {
					result.add(2);
				}
			}
		}
		ResultVO xzResult = new ResultVO(result,list);
		return new ResponseResult<>(SUCCESS,xzResult);
	}
	
}
























