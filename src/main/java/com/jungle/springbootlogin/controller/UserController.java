package com.jungle.springbootlogin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jungle
 * @since 2020-10-19
 */
@RestController
@RequestMapping("/springbootlogin/user")
public class UserController {

    @GetMapping
    public String test() {
        return "123";
    }
}

