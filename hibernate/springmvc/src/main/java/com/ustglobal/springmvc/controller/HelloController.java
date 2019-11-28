package com.ustglobal.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@RequestMapping(path="/hello")
	public String hello(@RequestParam("name") String name,
			@RequestParam("id") int id,
			ModelMap map)
	{
		map.addAttribute("msg","Hello World");
		map.addAttribute("name",name);
		map.addAttribute("id",id);
		return "index";
	}

	@RequestMapping(path="/hi/{name}/{id}")
	public String hi(@PathVariable("name") String name,
			@PathVariable("id") int id,HttpServletRequest request)
	{
		request.setAttribute("msg","Hello java World");
		request.setAttribute("name",name);
		request.setAttribute("id",id);
		return "index";
	}
	
	@RequestMapping(path="/form")
	public String formpage() {
		return "form";
	}
	
	@RequestMapping(path="/form", method=RequestMethod.POST)
	public String form(Employee employee,ModelMap map)
	{
		map.addAttribute("id",employee.getId());
		map.addAttribute("name",employee.getName());
		map.addAttribute("password",employee.getPassword());
		map.addAttribute("gender",employee.getGender());
		return "formoutput";
	}

}
