package cn.tedu.demo.mapper;

import cn.tedu.demo.entity.User;

/**
 * 处理用户数据的持久层接口
 */
public interface UserMapper {
	
	/**
	 * 插入用户
	 * @param user 用户数据
	 * @return 生效行数
	 */
	Integer insert(User user);
	
	/**
	 * 通过用户名查找用户数据
	 * @param username 用户名
	 * @return 查找到的用户数据 无则返回null
	 */
	User findByUsername(String username);
	
}
