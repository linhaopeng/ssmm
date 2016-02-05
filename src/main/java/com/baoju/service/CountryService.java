package com.baoju.service;

import java.util.List;

import com.baoju.entity.Country;


public interface CountryService extends BaseService<Country> {

   /**
    * 根据条件分页查询
    *
    * @param country
    * @param page
    * @param rows
    * @return
    */
   List<Country> selectByCountry(Country country, int page, int rows);

}