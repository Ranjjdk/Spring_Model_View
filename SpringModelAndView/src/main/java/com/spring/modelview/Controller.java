package com.spring.modelview;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	
//	@Autowired
//	private StudentService studentService;

	@ModelAttribute
	public void commonAttribute(Model model) {
     
		System.out.println("common");
		model.addAttribute("header", "Welcome this Login page");
		model.addAttribute("desc", "hi programmer");
	}

	@RequestMapping("/login")
	public ModelAndView help1() {
           System.out.println("help1");
		ModelAndView mv = new ModelAndView();

		mv.setViewName("login");

		return mv;
	}

	@PostMapping("/process")
	public String login(@ModelAttribute Student student, Model model) {
		System.out.println("login");
		    //this.studentService.createStudent(student);
		return "success";
	}

}
