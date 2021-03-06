package com.spencer.springdemo;

import com.spencer.springdemo.core.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyfortune());

        // close the bean
        context.close();
    }
}
