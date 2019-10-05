package com.reborn.metube.mapper;

import com.reborn.metube.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Reborn
 */
public interface UserMapper extends Mapper<User> {

    List<User> selectAllUsers();
}