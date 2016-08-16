package com.cn.hnust.service;

import com.cn.hnust.pojo.User;

import java.util.List;

public interface IUserService {

	public User getUserById(int userId);

	public int deleteByPrimaryKey(Integer id);

	public int insert(User record);

	public int insertSelective(User record);

	public int updateByPrimaryKeySelective(User record);

	public int updateByPrimaryKey(User record);

	public List<User> findByUserName(String userName);

	User findByNameAndPassword(String userName,String password);
}
