package com.reborn.metube.service;

import com.reborn.metube.User;

public interface UserService extends BaseService<User, Integer> {
    void say();
}