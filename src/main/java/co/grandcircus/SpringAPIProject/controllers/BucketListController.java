package co.grandcircus.SpringAPIProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import co.grandcircus.SpringAPIProject.pojos.BucketList;
import co.grandcircus.SpringAPIProject.repos.BucketListRepo;

@Controller
public class BucketListController {

	@Autowired
	BucketListRepo b;
	
	@RequestMapping("add-event")
	public ModelAndView addPerson(BucketList bDetails) {
		b.save(bDetails);
		
		return new ModelAndView("bucketlist");
	}
	
	@RequestMapping("remove-event")
	public ModelAndView remove(int id) {
		b.deleteById(id);
		return new ModelAndView("bucketlist");
}
}
