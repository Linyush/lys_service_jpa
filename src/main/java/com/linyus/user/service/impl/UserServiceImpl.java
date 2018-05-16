package com.linyus.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.linyus.domain.user.UserDO;
import com.linyus.user.dao.UserDao;
import com.linyus.user.service.UserService;

/**
 * create by eason on 2018年5月16日
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(UserDO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserDO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserDO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserDO findOne(UserDO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDO> findAll(UserDO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserDO> findPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
