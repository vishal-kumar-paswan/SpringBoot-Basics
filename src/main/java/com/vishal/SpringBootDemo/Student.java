package com.vishal.SpringBootDemo;
import org.springframework.stereotype.Component;

// Using @Component annotation to tell the Spring framework we want this class's object
// This adds the class object into the Spring container from where we can access
// it just by creating a ApplicationContext instance.
// This is how basically the concept of Dependency Injection is working
@Component
public class Student {
    public void getStudent1Name() {
        System.out.println("Name: Vishal");
    }

    public void getStudent2Name() {
        System.out.println("Name: Kumar");
    }
}
