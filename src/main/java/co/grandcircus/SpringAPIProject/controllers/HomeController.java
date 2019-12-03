package co.grandcircus.SpringAPIProject.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Value("${ticketmaster.key}")
	String ticketmasterKey;

	@RequestMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("index");
	}
}
