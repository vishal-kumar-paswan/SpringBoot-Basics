package com.vishal.SpringBootDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Using @Component annotation to tell the Spring framework we want this class's object
// This adds the class object into the Spring container from where we can access
// it just by creating a ApplicationContext instance.
// This is how basically the concept of Dependency Injection is working
@Component
public class Student {

    // When your class is dependent on other class's instance, we use the @Autowired annotation
    // to tell the Spring framework that it need to create the instance of the other class instead of we define it
    @Autowired
    Marks marks;
    public void getStudent1Name() {
        System.out.println("Name: Vishal");
        marks.getStudent1Marks();
    }

    public void getStudent2Name() {
        System.out.println("Name: Kumar");
        marks.getStudent2Marks();
    }
}
