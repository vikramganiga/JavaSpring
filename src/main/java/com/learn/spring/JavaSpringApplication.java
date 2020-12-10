package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.config.Coach;

@SpringBootApplication
public class JavaSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavaSpringApplication.class, args);
		
		/** 
		 * Example for XML based configuration.
		 * 
		 * 1. Dependency injection
		 * 
		 */
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = classPathXmlApplicationContext.getBean("myGolfCoach", Coach.class);
				
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		coach = classPathXmlApplicationContext.getBean("myCricketCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		
		classPathXmlApplicationContext.close();
		
	}

}
