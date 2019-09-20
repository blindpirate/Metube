package com.reborn.metube.controller;

import com.reborn.metube.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: UserController.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/9/14 00:04
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@RestController
@RequestMapping("/users")
public class UserController extends BaseController<User, Integer> {

    @RequestMapping("/say")
    public String say() {
        return "asd";
    }
}