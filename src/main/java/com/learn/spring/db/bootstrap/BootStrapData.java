package com.learn.spring.db.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.spring.db.Publisher;
import com.learn.spring.db.repo.PublisherRepo;


@Component
public class BootStrapData implements CommandLineRunner {
	
	private PublisherRepo publisherRepo;
	
	public BootStrapData(PublisherRepo publisherRepo){
		this.publisherRepo = publisherRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Publisher publisher = new Publisher("Gottigere", "Bangalore", "Kar", "560083");
		publisherRepo.save(publisher);
		
		publisher = new Publisher("Kembathalli", "Bangalore", "Kar", "560083");
		publisherRepo.save(publisher);
		
		System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + publisherRepo.count());
	}

}
