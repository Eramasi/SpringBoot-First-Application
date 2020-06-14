package com.app.SpringBootFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/welcome")
	public ModelAndView DisplayMesg()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome to SpringBoot");
		mav.setViewName("welcome");
		
		return mav;
		
	}

}
