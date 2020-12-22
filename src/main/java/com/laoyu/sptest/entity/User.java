package com.laoyu.sptest.entity;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
