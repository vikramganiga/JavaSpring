package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.autowire.config.DependedClass;
import com.annotation.autowire.qualifier.JuiceCenter;
import com.annotation.config.TestSpringComponent;
import com.java.config.AppConfig;
import com.java.config.AppleO;
import com.java.config.PineApple;
import com.learn.spring.propfileload.Customer;
import com.learn.spring.propfileload.LoadPropConfig;
import com.xml.config.Coach;
import com.xml.config.PrototypeBean;

@SpringBootApplication
public class JavaSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavaSpringApplication.class, args);
		
		/*  XML based bean configuration and  Dependency injection */
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = classPathXmlApplicationContext.getBean("myGolfCoach", Coach.class);
				
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		coach = classPathXmlApplicationContext.getBean("myGolfCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		coach = classPathXmlApplicationContext.getBean("myCricketCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		PrototypeBean prototypeBean = classPathXmlApplicationContext.getBean("MyProtoTypeBean",PrototypeBean.class);
		prototypeBean.getType();
		
		/* Annotation based component scan, context configuration */
		
		TestSpringComponent  testSpringComponent = classPathXmlApplicationContext.getBean("testSpringComponent",TestSpringComponent.class);
		testSpringComponent.getMessage();
		
		/* Autowired  */
		
		DependedClass dependedClass = classPathXmlApplicationContext.getBean("dependedClass", DependedClass.class);	
		dependedClass.getWiredMessage();
		dependedClass.getMessage();
		
		/* Autowired with Qualified */
		
		JuiceCenter juiceCenter = classPathXmlApplicationContext.getBean("juiceCenter", JuiceCenter.class);
		juiceCenter.getJuice();
		
		classPathXmlApplicationContext.close();
		
		/* Java annotation context configuration */
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		AppleO appleO= appContext.getBean("appleO",AppleO.class);
		appleO.getName();
		
		
		PineApple pineApple = appContext.getBean("getPineApple", PineApple.class);
		pineApple.getName();
		
		appContext.close();
		
		/* Java annotation context with property file */
		
		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(LoadPropConfig.class);
		Customer customer = applicationContext.getBean("customer", Customer.class);
		System.out.println(" Customer Email" +customer.getEmail());
		System.out.println(" Customer Name "+ customer.getName());
		
		applicationContext.close();
	}

}
