package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	/***
	 * 主键删除对象
	 * @param id
     * @return
     */
	public int deleteByPrimaryKey(Integer id) {
		return this.userDao.deleteByPrimaryKey(id);
	}


	/**
	 * 插入对象
	 * @param record
	 * @return
     */
	public int insert(User record) {
		return this.userDao.insert(record);
	}

	/**
	 * 判断各字段是否为空
	 * @param record
     * @return
     */
	public int insertSelective(User record) {
		return this.userDao.insertSelective(record);
	}

	/**
	 * 更新对象
	 * @param record
     * @return
     */
	public int updateByPrimaryKeySelective(User record) {
		return this.userDao.updateByPrimaryKeySelective(record);
	}

	/**
	 * 根据主键更新对象
	 * @param record
     * @return
     */
	public int updateByPrimaryKey(User record) {
		return this.userDao.updateByPrimaryKey(record);
	}

	public List<User> findByUserName(String userName) {
		return this.userDao.findByUserName(userName);
	}

	public User findByNameAndPassword(String userName, String password) {
		return userDao.findByNameAndPassword(userName,password);
	}

}
