package com.spencer.springdemo;

import com.spencer.springdemo.core.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        System.out.println("is coach and alphaCoach pointing to the same POJO? " + (coach == alphaCoach));

        // close the context
        context.close();
    }
}
