package cn.tedu.demo.vo;

import cn.tedu.demo.entity.ExamXZ;

import java.util.List;

/**
 * 用于返回选择结果的实体类
 */
public class ResultVO {
	private List<Integer> result;
	private List<ExamXZ> list;
	
	public ResultVO() {
		super();
	}

	public ResultVO(List<Integer> result, List<ExamXZ> list) {
		super();
		this.result = result;
		this.list = list;
	}

	public List<Integer> getResult() {
		return result;
	}

	public void setResult(List<Integer> result) {
		this.result = result;
	}

	public List<ExamXZ> getList() {
		return list;
	}

	public void setList(List<ExamXZ> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ResultVO [result=" + result + ", list=" + list + "]";
	}
	
}






































