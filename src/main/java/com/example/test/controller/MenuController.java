package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {


    @RequestMapping(value = "/forwardUpload", method = RequestMethod.POST)
    public String forwardUpload() {
        return "upload";
    }
    @RequestMapping(value = "/forwardDownload", method = RequestMethod.POST)
    public String forwardDownload() {
        return "download";
    }
    @RequestMapping(value = "/forwardMenu", method = RequestMethod.POST)
    public String forwardMenu() {
        return "menu";
    }
    @RequestMapping(value = "/forwardCrud", method = RequestMethod.POST)
    public String forwardCrud() {
        return "dashboard";
    }
}
