package com.learn.spring.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.learn.spring.db.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Long>{
	
}
