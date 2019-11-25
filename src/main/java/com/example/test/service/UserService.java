package com.example.test.service;

import com.example.test.model.UserBean;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service

public interface UserService {

    UserBean loginIn(String name, String password);
}
