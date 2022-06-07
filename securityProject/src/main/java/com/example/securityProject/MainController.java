package com.example.securityProject;

import java.io.File;
import java.security.PublicKey;

import org.apache.commons.logging.Log;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	
	@PostMapping("/CreateMessage")
	public String form(@ModelAttribute Message mess) {
		System.out.println(mess.message);
		return "HomeScreen";
	}
}
