package com.example.test.controller;

import com.example.test.model.UserBean;
import com.example.test.service.UserService;
import com.example.test.util.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;


    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String name, String password, HttpServletRequest request, Map<String,Object> map) {
        UserBean userBean = userService.loginIn(name, password);
        if (userBean != null) {
            request.getSession().setAttribute(ConstantUtils.USER_SESSION_KEY,name);
            //设置session登录时效
            request.getSession().setMaxInactiveInterval(5*60);
            return "redirect:menu.html";
        } else {
            map.put("ERROR_MESSAGE","用户名或者密码错误");
            return "login";
        }
    }

}