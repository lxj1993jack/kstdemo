package cn.tedu.demo.mapper;
/**
 * 处理选择题的持久层接口
 */

import java.util.List;

import cn.tedu.demo.entity.ExamXZ;

public interface ExamXZMapper {
	
	/**
	 * 查找全部选择题
	 * @return
	 */
	List<ExamXZ> listAll();
	
	/**
	 * 通过阶段类型查找选择题
	 * @param type 阶段类型
	 * @return 查找到的题目集合
	 */
	List<ExamXZ> listByType(Integer type);
	
}
