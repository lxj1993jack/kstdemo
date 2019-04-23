package cn.tedu.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.tedu.demo.entity.ExamJD;
import cn.tedu.demo.mapper.ExamJDMapper;
import cn.tedu.demo.service.IExamJDService;

/**
 * 处理简答题的业务层实现类
 */
@Service
public class ExamJDServiceImpl implements IExamJDService{
	
	@Autowired
	ExamJDMapper examJDMapper;
	
	/**
	 * 生成随机题目的算法
	 * @param result 查询到的题目
	 * @param num 题目个数
	 * @return 随机生成的题目
	 */
	public List<ExamJD> getList(List<ExamJD> result, Integer num){
		List<ExamJD> list = new ArrayList<ExamJD>();
		if(result.size()<num) {
			num = result.size();
		}
		for(int i=0;i<num;i++) {
			int index = (int)(Math.random()*result.size());
			ExamJD examJD = result.get(index);
			if(list.contains(examJD)) {
				i--;
				continue;
			}
			list.add(examJD);
		}
		return list;
	}
	
	@Override
	public List<ExamJD> listAll(Integer num) {
		List<ExamJD> result = examJDMapper.listAll();
		return getList(result, num);
	}

	@Override
	public List<ExamJD> listByType(Integer type, Integer num) {
		List<ExamJD> result = examJDMapper.listByType(type);
		return getList(result, num);
	}

	

}
































