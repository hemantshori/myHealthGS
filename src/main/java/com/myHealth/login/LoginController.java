package com.myHealth.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private Nurse nurse;
	@Autowired
	private Patient patient;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handlePatientDetails(@RequestParam String name,
			@RequestParam String password, ModelMap model) {


	
		if (!loginService.validateUser(name, password)) {
	
			model.put("errorMessage", "you have provided incorrect credentials");
			
			return "login";
		}
		
		model.put("msg", name);

		return "patientDetails";
	}
	
	@RequestMapping(value = "/patientDetails", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String firstName, 
			@RequestParam String lastName
			) {
  model.put("firstName", firstName);
		
		return "welcome";
	}
	
	
}
