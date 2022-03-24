package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.domain.SysUser;

public class UserDaoImpl implements UserDao {

    @Override
    public void dosome(SysUser user){
        System.out.println("调用dosome方法");
    }
}
