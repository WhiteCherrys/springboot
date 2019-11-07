package com.example.test.service;

import com.example.test.model.UserBean;

public interface UserService {
    UserBean loginIn(String name, String password);
}
