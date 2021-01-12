package com.training.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        //try beans2.xml file
        //ApplicationContext context= new ClassPathXmlApplicationContext("beans2.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println("------------------");
        System.out.println("Student Name : "+student.getName());
        System.out.println("Student Age : "+student.getAge());
        System.out.println("Student Phone : "+student.getNumber());
    	System.out.println("------------------");
    	student.schoolInfo();
    }
}
