package com.example.demo.cl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
	private static final Logger LOG = LoggerFactory.getLogger(AccountController.class);
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String getRegistrationForm(Model model) {
		model.addAttribute("account", new AccountForm());
		return "users/registrationForm";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String postRegistrationForm(AccountForm form) {
		LOG.info("Created registration: {}", form);
		return "redirect:/users/registration_ok.html";
	}
	@RequestMapping("/hello")
	public class HelloController {
	   @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	   }
	}
}
