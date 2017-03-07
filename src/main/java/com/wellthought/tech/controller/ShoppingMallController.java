package com.wellthought.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class ShoppingMallController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	 public ModelAndView homePageHandler() throws Exception {  
		ModelAndView home = new ModelAndView();
		home.setViewName("Home");
	        return home;
	    }  
}
