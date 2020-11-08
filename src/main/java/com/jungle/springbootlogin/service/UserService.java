package com.jungle.springbootlogin.service;

import com.jungle.springbootlogin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jungle
 * @since 2020-10-19
 */
public interface UserService extends IService<User> {

    int register(User user);

    User login(User user);
}
