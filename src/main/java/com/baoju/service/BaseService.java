package com.baoju.service;

import java.util.List;

public interface BaseService<T> {
    
	T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
