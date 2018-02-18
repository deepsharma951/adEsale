package com.org.abde.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.abde.listing.flipkart.model.ListingFlipkart;
import com.org.abde.listing.flipkart.service.ListingService;
import com.org.abde.service.UserService;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired	
	UserService userService;
	
	@Autowired
	ListingService listingService;
	
@RequestMapping(path="/login",method=(RequestMethod.GET))
	 public String login(){
	
		return "login";
	}

@RequestMapping(path="/register",method=(RequestMethod.GET))
public String register(){

	return "register";
}

@RequestMapping(path="/",method=(RequestMethod.GET))
public String home(){
userService.multiply(2, 4);
System.out.println("here in controllers");
	return "index";
}
@RequestMapping(path="/listing",method=(RequestMethod.GET))
public String listing(){
	List<ListingFlipkart> listing=listingService.listAllListing();
	for (ListingFlipkart listingFlipkart : listing) {
		System.out.println(listingFlipkart.getErrors());
	}
	
	//System.out.println(listing.getErrorCode()+"  "+listing.getErrors());
System.out.println("here in controllers");
	return "index";
}

}
