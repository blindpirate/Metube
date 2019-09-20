package com.reborn.metube.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author Reborn
 */
public interface BaseService<T, ID extends Serializable> {
    public T insert(T entity);

    public T selectByPrimaryKey(ID id);

    int delete(T entity);

    int deleteByPrimaryKey(ID id);

    int updateByPrimaryKey(T entity);

    int updateByPrimaryKeySelective(T entity);

    public List<T> selectAll();


    public T selectOne(T query);

    public List<T> select(T query);
}