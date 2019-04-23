package cn.tedu.demo.controller.ex;

/**
 * 选择异常的基类
 */
public class ExamException extends RuntimeException{

	private static final long serialVersionUID = 4160884587519986550L;

	public ExamException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ExamException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExamException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExamException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
