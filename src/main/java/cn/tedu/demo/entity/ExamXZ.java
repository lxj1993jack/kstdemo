package cn.tedu.demo.entity;

import java.io.Serializable;

/**
 * 选择题的实体类
 */
public class ExamXZ implements Serializable{

	private static final long serialVersionUID = 7650353797186522754L;
	
	private Integer id;
	private String title;
	private String a;
	private String b;
	private String c;
	private String d;
	private String ansid;
	private String answer;
	private Integer type;
	private Integer type1;
	
	public ExamXZ() {
		super();
	}

	public ExamXZ(Integer id, String title, String a, String b, String c, String d, String ansid, String answer,
			Integer type, Integer type1) {
		super();
		this.id = id;
		this.title = title;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.ansid = ansid;
		this.answer = answer;
		this.type = type;
		this.type1 = type1;
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

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getAnsid() {
		return ansid;
	}

	public void setAnsid(String ansid) {
		this.ansid = ansid;
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

	public Integer getType1() {
		return type1;
	}

	public void setType1(Integer type1) {
		this.type1 = type1;
	}

	@Override
	public String toString() {
		return "ExamXZ [id=" + id + ", title=" + title + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", ansid="
				+ ansid + ", answer=" + answer + ", type=" + type + ", type1=" + type1 + "]";
	}
	
	
}
