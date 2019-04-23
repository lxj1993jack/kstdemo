package cn.tedu.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ExceptionHandler;

import cn.tedu.demo.controller.ex.ExamException;
import cn.tedu.demo.controller.ex.ExamNoAllDoExcepion;
import cn.tedu.demo.service.ex.InsertException;
import cn.tedu.demo.service.ex.PasswordNotMatchException;
import cn.tedu.demo.service.ex.ServiceException;
import cn.tedu.demo.service.ex.UserNotFoundException;
import cn.tedu.demo.service.ex.UsernameDuplicateException;
import cn.tedu.demo.util.ResponseResult;

/**
 * 控制器的基类
 */
public class BaseController {
	/**
	 * 响应结果时用于表示操作成功
	 */
	protected static final int SUCCESS = 200;
	
	/**
	 * 从Session获取uid
	 * @param session HttpSession
	 * @return uid
	 */
	protected final Integer getUidFromSession(HttpSession session) {
		return Integer.valueOf(session.getAttribute("uid").toString());
	}
	
	@ExceptionHandler({ServiceException.class,ExamException.class})
	public ResponseResult<Void> handlerException(Throwable e){
		ResponseResult<Void> rr = new ResponseResult<>();
		rr.setMessage(e.getMessage());
		if(e instanceof UsernameDuplicateException) {
			//400-用户名重复异常
			rr.setState(400);
		}else if(e instanceof UserNotFoundException) {
			//401-用户数据未找到异常
			rr.setState(401);
		}else if(e instanceof PasswordNotMatchException) {
			//402-密码不匹配异常
			rr.setState(402);
		}else if(e instanceof InsertException) {
			//500-插入数据异常
			rr.setState(500);
		}else if(e instanceof ExamNoAllDoExcepion) {
			//600-没做完题异常
			rr.setState(600);
		}
		return rr;
	}
	
}








































