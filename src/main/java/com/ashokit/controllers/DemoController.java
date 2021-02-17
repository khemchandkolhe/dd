package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping(value = {"/","/index","/home"},method = RequestMethod.GET)
	public ModelAndView index()
	{
		ModelAndView mav=new ModelAndView();
		
		
		mav.addObject("msg","welcome to spring Boot programming!!!!!");
		
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping(value = {"/home1"},method = RequestMethod.GET)
	public ModelAndView home()
	{
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg1","welcome to project Batch!!!!!");
		
		
		mav.setViewName("index1");
		return mav;
		
	}
	
}
