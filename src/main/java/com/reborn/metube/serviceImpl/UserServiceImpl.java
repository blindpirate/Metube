package com.reborn.metube.serviceImpl;

import com.reborn.metube.User;
import com.reborn.metube.mapper.UserMapper;
import com.reborn.metube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: UserServiceImpl.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/9/14 00:16
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void say() {

    }
}