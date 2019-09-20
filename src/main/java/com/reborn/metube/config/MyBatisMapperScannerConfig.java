package com.reborn.metube.config;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: MyBatisMapperScannerConfig.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/9/18 22:30
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * 通用mapper与分页插件的一些配置
 */
@Configuration
public class MyBatisMapperScannerConfig {

    /**
     * 使用通用Mapper之前需要初始化的一些信息
     * 使用通用Mapper插件时请勿使用热加载,否则报错,插件作者后续应该会修复
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {

        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.reborn.metube.mapper");

        Properties properties = new Properties();
        properties.setProperty("mappers", BaseMapper.class.getName());
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");

        mapperScannerConfigurer.setProperties(properties);

        return mapperScannerConfigurer;
    }

    /**
     * 配置mybatis的分页插件pageHelper
     */
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        //设置为true时，会将RowBounds第一个参数offset当成pageNum页码使用
        properties.setProperty("offsetAsPageNum","true");
        //置为true时，使用RowBounds分页会进行count查询
        properties.setProperty("rowBoundsWithCount","true");
        //合理化查询,启用合理化时，
        //如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页
        //未开启时如果pageNum<1或pageNum>pages会返回空数据
        properties.setProperty("reasonable","true");
        //配置mysql数据库的方言
        properties.setProperty("dialect","mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}