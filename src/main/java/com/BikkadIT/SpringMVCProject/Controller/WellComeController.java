package com.BikkadIT.SpringMVCProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WellComeController {

	public WellComeController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Wellcome Controller class Constructor");
	}
	
	@GetMapping("/wellcomeMsg")
	public ModelAndView WellcomeMsg() {
		
		String msg="Wellcome To BikkadIT";
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("MESSAGE", msg);
		mv.setViewName("wellcome");
		
		return mv;
		
		
	}
}
