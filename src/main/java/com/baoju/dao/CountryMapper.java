package com.baoju.dao;

import java.util.List;

import com.baoju.entity.Country;
import com.baoju.util.MyMapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CountryMapper extends MyMapper<Country> {
	public List<Country> getAllCountry();
}