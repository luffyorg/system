package cn.yznu.rzgskhgl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("welcome" )
	public String index(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		return "login";
	}
}
