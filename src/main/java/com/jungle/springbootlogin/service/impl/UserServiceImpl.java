package com.jungle.springbootlogin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jungle.springbootlogin.entity.User;
import com.jungle.springbootlogin.mapper.UserMapper;
import com.jungle.springbootlogin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jungle
 * @since 2020-10-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

    @Override
    public User login(User user) {
        User one = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getName, user.getName()).eq(User::getPassword, user.getPassword()));
        return one;
    }
}
