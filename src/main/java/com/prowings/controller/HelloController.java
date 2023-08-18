package com.prowings.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView handleRequest(@RequestParam("name") String name, @RequestParam("address") String address) throws Exception {

		Map<String, String> map = new HashMap();
		
		map.put("name", name);
		map.put("address", address);
		
		ModelAndView mv = new ModelAndView("welcome", map);
//		mv.setViewName("welcome");
//		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/helloworld")
	public String helloworld()
	{
		return "helloworld!!";
	}

}