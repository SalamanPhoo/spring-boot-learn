package com.pho.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pho.bean.User;
import com.pho.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        LambdaQueryWrapper<User> userWrapper = new QueryWrapper<User>().lambda();
        List<User> list = userMapper.selectList(userWrapper);
        for (User user:list) {
            System.out.println(user.toString());
        }
        return list;
    }
}
