package cn.tedu.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.tedu.demo.entity.ExamXZ;
import cn.tedu.demo.mapper.ExamXZMapper;
import cn.tedu.demo.service.IExamXZService;

/**
 * 处理简答题的业务层实现类
 */
@Service
public class ExamXZServiceImpl implements IExamXZService{
	
	@Autowired
	ExamXZMapper examXZMapper;
	
	/**
	 * 生成随机题目的算法
	 * @param result 查询到的题目
	 * @param num 题目个数
	 * @return 随机生成的题目
	 */
	public List<ExamXZ> getList(List<ExamXZ> result, Integer num){
		if(result.size()<num) {
			num = result.size();
		}
		List<ExamXZ> list = new ArrayList<ExamXZ>();
		for(int i=0;i<num;i++) {
			int index = (int)(Math.random()*result.size());
			ExamXZ examJD = result.get(index);
			if(list.contains(examJD)) {
				i--;
				continue;
			}
			list.add(examJD);
		}
		list = sort(list);
		return list;
	}
	
	/**
	 * 将单选题与多选题排序
	 * @param listz 查找到的集合
	 * @return 排序后的集合
	 */
	public List<ExamXZ> sort(List<ExamXZ> listz) {
		List<ExamXZ> list1 = new ArrayList<ExamXZ>();
		List<ExamXZ> list2 = new ArrayList<ExamXZ>();
		List<ExamXZ> rlist = new ArrayList<ExamXZ>();
		for (ExamXZ e : listz) {
			if (e.getType1() == 1) {
				list1.add(e);
			} else {
				list2.add(e);
			}
			}
		rlist.addAll(list1);
		rlist.addAll(list2);
		return rlist;
	}

	@Override
	public List<ExamXZ> listAll(Integer num) {
		List<ExamXZ> result = examXZMapper.listAll();
		return getList(result, num);
	}

	@Override
	public List<ExamXZ> listByType(Integer type, Integer num) {
		List<ExamXZ> result = examXZMapper.listByType(type);
		return getList(result, num);
	}
	
	
	
}
































