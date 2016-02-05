package com.baoju.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baoju.entity.Country;
import com.baoju.service.CountryService;

@RequestMapping("/userAction")
@Controller("userAction")
public class UserAction {

	// @Resource
	// private UserService userService;
	// @Resource
	// private TestService testService;
	@Resource
	private CountryService countryService;

	@RequestMapping("/showUser/{id}")
	// 访问路径userAction/showUser/1.do
	public String showUser(@PathVariable Integer id, Map<String, Object> map) {
		System.out.println(id);
		/*
		 * User user = userService.selectByPrimaryKey(1); System.out.println(user); map.put("user", user); userService.print();
		 */
		List<Country> allCountry = countryService.getAllCountry();
		countryService.delete(id);
		// testService.test(test);
		// testService.getById(2);
		return "index";
	}

}
