package com.baoju.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baoju.entity.Country;
import com.baoju.service.CountryService;


@Service("countryService")
public class CountryServiceImpl extends BaseServiceImpl<Country> implements CountryService {

	public List<Country> selectByCountry(Country country, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> getAllCountry() {
		return CountryMapper.getAllCountry();
	}
}
  
