package cn.tedu.demo.service;

import java.util.List;

import cn.tedu.demo.entity.ExamJD;

/**
 * 处理简答题的业务层实现接口
 */
public interface IExamJDService {
	
	/**
	 * 从题库中选择规定数量的题
	 * @param num 获取的题目数量
	 * @return 装有简答题的list
	 */
	List<ExamJD> listAll(Integer num);
	
	/**
	 * 从题库中选择规定数量规定类型的题
	 * @param type 规定的类型
	 * @param num 规定的数量
	 * @return 装有简答题的list
	 */
	List<ExamJD> listByType(Integer type ,Integer num);
	
}
