package com.pho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@Controller
public class HelloController {

    @RequestMapping("success")
    public String success(){
        return  "success";
    }
}
