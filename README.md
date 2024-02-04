## SpringBoot Basics

Suppose we have a class Called `Student`. If we want to access any of it's member functions or data members, we first have to create it's instance to access them as they are non-static.
<br/>
<br/>
In SpringBoot, we are more concerned about the business login than creating instances, so we leave it on SpringBoot to handle. In SpringBoot we have a concept of `Container` where we store all the objects and access them whenever needed.
We can access them by creating a `ApplicationContext` context. But in order to let SpringBoot to create a class's instance, we need to tell Spring that we need a particular class instance by simply using the `@Component` annotation. Instances of classes created are referred to as `Bean` in SpringBoot and we access them by using the `getBean()` method.
<br/>
<br/>
If one of your class is dependent on the other class's instance, then we use the `@Autowired` annotation to let SpringBoot handle the instances as we cannot directly handle them from the `context`.