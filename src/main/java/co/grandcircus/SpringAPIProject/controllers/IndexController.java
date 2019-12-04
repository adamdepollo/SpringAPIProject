package co.grandcircus.SpringAPIProject.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.SpringAPIProject.pojos.BucketList;
import co.grandcircus.SpringAPIProject.pojos.Event;
import co.grandcircus.SpringAPIProject.pojos.User;
import co.grandcircus.SpringAPIProject.repos.BucketListRepo;
import co.grandcircus.SpringAPIProject.repos.UserRepo;

@Controller
public class IndexController {
	
	@Autowired 
	UserRepo ur;
	
	@Autowired 
	BucketListRepo br;
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("index");
	}
	
	@PostMapping("login")
	public ModelAndView login(String username) {
		User u;
		if (ur.findByUsername(username) == null) {
			u = new User();
			u.setUsername(username);
			BucketList bl = new BucketList(u, new ArrayList<Event>());
			u.setBl(bl);
			ur.save(u);
		} else {
			u = ur.findByUsername(username);
		}
		return new ModelAndView("search", "user", u);
	}
}
