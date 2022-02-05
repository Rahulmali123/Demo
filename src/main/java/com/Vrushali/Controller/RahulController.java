package com.Vrushali.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Vrushali.dao.StudentRepo;
import com.Vrushali.model.Rahul;

@Controller
public class RahulController 
{
	@Autowired
	StudentRepo studentRepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "rahul.jsp";
		
	}
	
	@RequestMapping("/addrahul")
	public ModelAndView addstudent(Rahul rahul)
	{
		System.out.println("In Controller.addStudent()!!");
		studentRepo.save(rahul);
		System.out.println(rahul);
		ModelAndView mv=new ModelAndView(); 
		mv.addObject("rahul", rahul);
		mv.setViewName("rahul.jsp");
		return mv;
	}
}
