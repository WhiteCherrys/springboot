package com.example.test.dao;

import com.example.test.model.UserBean;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    UserBean getInfo(String name, String password);
}
