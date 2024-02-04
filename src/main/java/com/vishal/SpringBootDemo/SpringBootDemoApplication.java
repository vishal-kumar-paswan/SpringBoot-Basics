package com.vishal.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		// First we are creating a context of the ApplicationContext
		// Using context gives us the access to the Spring container
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		// Then we are using that instance to get the bean of Student class,
		// Since the annotation of @Component is used for the Student class, Spring will detect it and create an object
		// for us to use.
		Student student1 = context.getBean(Student.class);
		student1.getStudent1Name();

		// We can create multiple objects like this!
		Student student2 = context.getBean(Student.class);
		student2.getStudent2Name();
	}
}
