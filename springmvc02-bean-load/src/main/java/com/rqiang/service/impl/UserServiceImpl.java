package com.rqiang.service.impl;

import com.rqiang.domain.User;
import com.rqiang.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        System.out.println("user service ...");
    }
}
