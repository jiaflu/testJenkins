package com.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello jenkins!";
    }

    @RequestMapping("/hook")
    @ResponseBody
    public String hook() {
        return "test hook...alalallal!";
    }

}
