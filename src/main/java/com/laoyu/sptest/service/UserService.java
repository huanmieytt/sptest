package com.laoyu.sptest.service;

import com.laoyu.sptest.dao.UserDao;
import com.laoyu.sptest.entity.User;
import com.laoyu.sptest.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private Mapper mapper;
    public String getUserById(int id){

        return mapper.getUserById(id).toString();
    }
}
