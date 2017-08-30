package com.wlgg.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wlgg.dao.IUserDao;
import com.wlgg.entity.User;
import com.wlgg.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}