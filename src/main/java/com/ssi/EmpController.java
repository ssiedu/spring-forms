package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmpController {

	
	@RequestMapping("saveemp")
	public ModelAndView saveEmpData(@ModelAttribute("emp") Emp emp){
		ModelAndView mv=new ModelAndView("result.jsp");
		return mv;
	}
	
	@RequestMapping("newemp")
	public ModelAndView showEmpEntryForm(){
		ModelAndView mv=new ModelAndView("entryform.jsp");
		Emp emp=new Emp();
		emp.setEcode("E111");
		emp.setEname("AAA");
		emp.setSal(50000);
		mv.addObject("empobj", emp);
		
		List<String> cityList=new ArrayList<String>();
		cityList.add("Agra");
		cityList.add("Bhopal");
		cityList.add("Chennai");
		cityList.add("Delhi");
		cityList.add("Mumbai");
		cityList.add("Pune");
		
		mv.addObject("cities", cityList);
		
		
		return mv;
		
	}
}
