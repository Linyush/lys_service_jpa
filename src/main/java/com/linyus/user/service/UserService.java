package com.linyus.user.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.linyus.domain.user.UserDO;

/**
 * create by eason on 2018年5月16日
 */
public interface UserService {

	void save(UserDO user);

	void update(UserDO user);

	void delete(UserDO user);

	UserDO findOne(UserDO user);

	List<UserDO> findAll(UserDO user);

	Page<UserDO> findPage(int page, int size);
}
