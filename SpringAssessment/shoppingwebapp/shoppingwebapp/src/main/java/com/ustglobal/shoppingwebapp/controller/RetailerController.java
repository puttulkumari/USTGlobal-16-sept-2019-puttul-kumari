package com.ustglobal.shoppingwebapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.shoppingwebapp.dto.RetailerBean;
import com.ustglobal.shoppingwebapp.service.RetailerService;
@Controller
public class RetailerController {

	@Autowired
	private RetailerService service ;    //no need create object of service

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}            


	@PostMapping("/login")
	public String login(int id, String password,HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Id or Password");
			return "login";
		}
		else {
			HttpSession session = request.getSession();                    
			session.setAttribute("bean", bean);
			return "home";

		}        
	}




	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}                //end of registerPage***************************************************************





	@PostMapping("/register")
	public String register(RetailerBean bean, ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg"," You are Registered and ID is "+check);

		}
		else {
			map.addAttribute("msg","Email is repeated");
		}

		return "login";

	}                                       //end of register()**********************




	@GetMapping("/home")
	public String home(ModelMap map,
			@SessionAttribute(name="bean" ,required=false)RetailerBean bean)      
	{
		if(bean==null) {
			map.addAttribute("msg","Login First!!");
			return "login";

		}
		else {
			return "home";
		}
	}                                       



	@PostMapping("/home")
	public String home() {
		return "home";
	}                                          //end of home()***********************************************



	@GetMapping("/search")
	public String search(@RequestParam("id") int id,             
			ModelMap map) {

		RetailerBean bean = service.searchRetailer(id);
		if(bean==null) {
			map.addAttribute("msg","DATA NOT FOUND");
		}
		else {
			map.addAttribute("bean",bean);
		}
		return "home";
	}                                             //end of search()********************************************

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}                                                //end of logout********************************************


	@GetMapping("/delete")
	public String deleteProfile(HttpSession session)
	{
		RetailerBean bean= (RetailerBean)session.getAttribute("bean");
		try {
			service.deleteRetailer(bean.getId());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";

	}                                                        //end of delete profile*************************



	@GetMapping("/changepassword")
	public String changepassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null)
		{
			return "changepassword";

		}
		else {
			return "login";
		}

	}

	@PostMapping("/changepassword")
	public String changepassword(String password, String confirmpassword,
			@SessionAttribute(name="bean")RetailerBean bean, ModelMap map)
	{
		if(password.equals(confirmpassword))
		{
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg","Password Changed");
		}
		else {
			map.addAttribute("msg","Password is not Matching");

		}
		return "home";
	}                                                  //change password**************************

	@GetMapping("/updateprofile")
	public String updateProfile(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null)
		{
			return "updateprofile";
		}
		else {
			return "login";
		}	          
	}

	@PostMapping("/updateprofile")
	public String updateProfile( String name,String password,String gender,
			@SessionAttribute(name="bean")RetailerBean bean, ModelMap map) {

		RetailerBean bean2=new RetailerBean();
		bean2.setId(bean.getId());
		bean2.setName(name);
		bean2.setPassword(password);
		boolean check = service.updateRetailer(bean2);
		if(check) {
			map.addAttribute("msg", ""+check+" your id is updated");
			return "home";
		}
		else {
			map.addAttribute("msg","Not updated..Give correct input");
			return "login";
		}



	}    

}


