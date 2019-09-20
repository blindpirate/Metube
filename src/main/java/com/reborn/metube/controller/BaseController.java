package com.reborn.metube.controller;

import com.reborn.metube.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: BaseController.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/9/13 23:35
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@RestController
public class BaseController<T, ID extends Serializable> {

    @Autowired
    private BaseService<T, ID> baseService;

    public T insert(T entity) {
        return baseService.insert(entity);
    }

    public T selectByPrimaryKey(ID id) {
        return baseService.selectByPrimaryKey(id);
    }

    public int delete(T entity) {
        return baseService.delete(entity);
    }

    public int deleteByPrimaryKey(ID id) {
        return baseService.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKey(T entity) {
        return baseService.updateByPrimaryKey(entity);
    }

    public int updateByPrimaryKeySelective(T entity) {
        return baseService.updateByPrimaryKeySelective(entity);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<T> selectAll() {
        return baseService.selectAll();
    }

    public T selectOne(T query) {
        return baseService.selectOne(query);
    }

    public List<T> select(T query) {
        return baseService.select(query);
    }
}