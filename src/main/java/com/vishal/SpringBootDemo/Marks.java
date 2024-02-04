package com.vishal.SpringBootDemo;
import org.springframework.stereotype.Component;


// Even if we are autowiring, we must add the @Component annotation to tell
// Spring that we need the instance of the class in the container!

@Component
public class Marks {
    public void getStudent1Marks() {
        System.out.println("Marks: 50");
    }
    public void getStudent2Marks() {
        System.out.println("Marks: 60");
    }
}
