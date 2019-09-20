package com.reborn.metube.serviceImpl;

import com.reborn.metube.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: BaseServiceImpl.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/9/14 00:14
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Service("baseService")
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
    @Autowired
    private BaseMapper<T> baseMapper;

    public BaseServiceImpl() {
    }

    @Override
    public T insert(T entity) {
        this.baseMapper.insert(entity);
        return entity;
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return this.baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(T entity) {
        return this.baseMapper.delete(entity);
    }

    @Override
    public int deleteByPrimaryKey(ID id) {
        return this.baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(T entity) {
        return this.baseMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(T entity) {
        return this.baseMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public T selectOne(T query) {
        return this.baseMapper.selectOne(query);
    }

    @Override
    public List<T> select(T query) {
        return this.baseMapper.select(query);
    }

    @Override
    public List<T> selectAll() {
        return this.baseMapper.selectAll();
    }
}