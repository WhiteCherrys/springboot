package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class IndexController {

    @Controller
    public class HelloController {
        @ResponseBody
        @RequestMapping("/index")
        public String sayHello(){
            return "index";
        }
    }
}
