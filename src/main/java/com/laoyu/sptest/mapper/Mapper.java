package com.laoyu.sptest.mapper;

import com.laoyu.sptest.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface Mapper {

    public User getUserById(int id);
}
