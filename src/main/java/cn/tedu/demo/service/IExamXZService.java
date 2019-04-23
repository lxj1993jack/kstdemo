package cn.tedu.demo.service;

import java.util.List;
import cn.tedu.demo.entity.ExamXZ;

/**
 * 处理选择的业务层实现接口
 */
public interface IExamXZService {
	
	/**
	 * 从题库中选择规定数量的题
	 * @param num 获取的题目数量
	 * @return 装有选择的list
	 */
	List<ExamXZ> listAll(Integer num);
	
	/**
	 * 从题库中选择规定数量规定类型的题
	 * @param type 规定的类型
	 * @param num 规定的数量
	 * @return 装有选择的list
	 */
	List<ExamXZ> listByType(Integer type ,Integer num);
	
}
