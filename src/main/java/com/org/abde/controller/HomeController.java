package com.org.abde.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.abde.beans.User;
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

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String save(Model model) {
		logger.info("Returning custSave.jsp page");
		model.addAttribute("user", new  User());
		return "register";
	}

	@RequestMapping(path = "/save.do", method = RequestMethod.POST)
	public String register(@Valid User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			logger.info("Returning login.jsp page");
			return "register";
		}
		logger.info("Returning home.jsp page");
		model.addAttribute("user", user);
		
		return "home";
	}

	@RequestMapping(path = "/register", method = (RequestMethod.GET))
	public String register() {

		return "register";
	}

	@RequestMapping(path = "/", method = (RequestMethod.GET))
	public String home() {
		userService.multiply(2, 4);
		System.out.println("here in controllers");
		return "index";
	}

	@RequestMapping(path = "/listing", method = (RequestMethod.GET))
	public String listing() {
		List<ListingFlipkart> listing = listingService.listAllListing();
		for (ListingFlipkart listingFlipkart : listing) {
			System.out.println("listingFlipkart" + listingFlipkart);
			System.out.println("details" + listingFlipkart.getListing_status());
			System.out.println(listingFlipkart.getActual_stock_count());
		}

		// System.out.println(listing.getErrorCode()+" "+listing.getErrors());
		System.out.println("here in controllers");
		return "index";
	}

}
