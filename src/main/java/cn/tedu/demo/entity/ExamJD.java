package cn.tedu.demo.entity;

import java.io.Serializable;
/**
 * 简答题的实体类
 */
public class ExamJD implements Serializable{

	private static final long serialVersionUID = 6466433770980119268L;
	
	private Integer id;
	private String title;
	private String answer;
	private Integer type;
	
	public ExamJD() {
		super();
	}

	public ExamJD(Integer id, String title, String answer, Integer type) {
		super();
		this.id = id;
		this.title = title;
		this.answer = answer;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ExamJD [id=" + id + ", title=" + title + ", answer=" + answer + ", type=" + type + "]";
	}
	
	
}
