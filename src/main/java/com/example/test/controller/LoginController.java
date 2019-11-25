package com.example.test.controller;

import com.example.test.model.UserBean;
import com.example.test.service.UserService;
import com.example.test.util.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show() {
        return "login";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String name, String password) {
        UserBean userBean = userService.loginIn(name, password);
        if (userBean != null) {
            //request.getSession().setAttribute(ConstantUtils.USER_SESSION_KEY,name);
            return "menu";
        } else {
            return "error";
        }
    }
    /*public String login(String name, String password, HttpServletRequest request) {
        UserBean userBean = userService.loginIn(name, password);
        if (userBean != null) {
            request.getSession().setAttribute(ConstantUtils.USER_SESSION_KEY,name);
            return "upload.html";
        } else {
            return "error";
        }
    }*/
}