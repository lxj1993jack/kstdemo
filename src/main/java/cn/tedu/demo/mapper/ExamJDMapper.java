package cn.tedu.demo.mapper;

import java.util.List;

import cn.tedu.demo.entity.ExamJD;

/**
 * 处理简答题的持久层接口
 */
public interface ExamJDMapper {
	/**
	 * 查找所有题目
	 * @return 装有简答题的list集合
	 */
	List<ExamJD> listAll();
	
	/**
	 * 通过阶段类型查找
	 * @param type 阶段类型
	 * @return 装有简答题的list集合
	 */
	List<ExamJD> listByType(Integer type);
}
