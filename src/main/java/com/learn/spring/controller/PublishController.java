package com.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.spring.db.repo.PublisherRepo;

@Controller
public class PublishController {
	
	private final PublisherRepo publisherRepo;
	
	public PublishController(PublisherRepo publisherRepo){
		this.publisherRepo = publisherRepo;
	}

	@RequestMapping("/publisher")
	public String getBooks(Model model){
		model.addAttribute("publisher", publisherRepo.findAll());
		
		return "publisher/list";
	}
}
