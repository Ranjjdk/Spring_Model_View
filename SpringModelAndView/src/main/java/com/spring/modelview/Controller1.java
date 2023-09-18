package com.spring.modelview;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller1 {
	@RequestMapping("/show")
	public ModelAndView he() {
		
		System.out.print("show method");

	ModelAndView mv=new ModelAndView();
	mv.addObject("name", "Bulksms");
	LocalDateTime datetime=LocalDateTime.now();

	mv.setViewName("help");
	return mv;
	}

}
