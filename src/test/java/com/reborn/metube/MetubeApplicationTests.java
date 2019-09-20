package com.reborn.metube;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.reborn.metube.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetubeApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        PageHelper.startPage(1, 2);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return;
    }
}
