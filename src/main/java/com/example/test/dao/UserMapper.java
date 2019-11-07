package com.example.test.dao;

import com.example.test.model.UserBean;

public interface UserMapper {
    UserBean getInfo(String name, String sex);
}
