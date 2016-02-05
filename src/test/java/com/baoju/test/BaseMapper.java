package com.baoju.test;


import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * MyBatis CRUD基接口
 * @author ALLEN.HU
 *
 * @param <T> 处理的POJO对象
 */
public interface BaseMapper<T extends MyBatisPojo> {
	
	/**
	 * 基于泛型的SELECT的返回类型,无法达到运行时改变对象签名
	 * 目前无解 
	 * @param obj
	 * @return
	 */
	public List<T> select(T obj);
	
	public List<T> selectByPage(T obj);
	
	//@SelectProvider(type = SelectTemplate.class,method = "count")
	//public int count(T obj);
	
	/**
	 * Insert语句从CUDTemplate类中生成
	 * @param obj
	 */
	@InsertProvider(type = CUDTemplate.class,method = "insert")
	public void insert(T obj);
	
	/**
	 * Update语句从CUDTemplate类中生成
	 * @param obj
	 */
	@UpdateProvider(type = CUDTemplate.class,method = "update")
	public void update(T obj);
	
	/**
	 * Delete语句从CUDTemplate类中生成
	 * @param obj
	 */
	@DeleteProvider(type = CUDTemplate.class,method = "delete")
	public void delete(T obj);

}
