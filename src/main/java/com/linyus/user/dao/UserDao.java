package com.linyus.user.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.linyus.domain.user.UserDO;

/**
 * create by eason on 2018年5月16日
 */
public interface UserDao extends JpaRepository<UserDO, Serializable>, JpaSpecificationExecutor<UserDO> {

}