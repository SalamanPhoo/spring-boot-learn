package com.pho.controller;

import com.pho.bean.User;
import com.pho.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("ls")
    public List<User> showList() {
        List<User> list = userService.getUserList();
        return list;
    }
}
