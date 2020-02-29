package com.example.test.controller;

import com.example.test.model.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Map<String,Object> map){
        map.put("ds","fsd");
        UserBean user=new UserBean();
        user.setId(1);
        user.setName("zhangsan");
        map.put("user",user);
        map.put("list", Arrays.asList("fds","fsd"));
        return "test";
    }
}
