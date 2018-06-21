package com.spring.core;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

		Person persoObj = (Person)context.getBean("personBean");

		    System.out.println("Person Details=ID===>"+persoObj.getId());
		    System.out.println("Person Details=Name===>"+persoObj.getName());
		    System.out.println("Person Details=Address=State==>"+persoObj.getAddress().getState());
		    System.out.println("Person Details=Address=Districtv==>"+persoObj.getAddress().getDistrict());
		    ScopeExample obj1 = (ScopeExample) context.getBean("singletonscopeEx");
		    System.out.println("*********SINGLETON SCOPE************");
		    obj1.setMessage("Message from object A");
		    obj1.setDate(new Date());
		    System.out.println("Your Message : " + obj1.getMessage());
		    System.out.println("Date : " + obj1.getDate().toString());

		          ScopeExample objB = (ScopeExample) context.getBean("singletonscopeEx");
		          System.out.println("Your Message : " + objB.getMessage());
		          System.out.println("Date : " + objB.getDate().toString());
		          System.out.println("********************************");

		          ScopeExample objC = (ScopeExample) context.getBean("prototypescopeEx");
		          System.out.println("*********PROTOTYPE SCOPE************");
		          objC.setMessage("Message from object C");
		          objC.setDate(new Date());
		          System.out.println("Your Message : " + objC.getMessage());
		          System.out.println("Date : " + objC.getDate().toString());

		          ScopeExample objD = (ScopeExample) context.getBean("prototypescopeEx");
		          System.out.println("Your Message : " + objD.getMessage());
		          System.out.println("Your Date : " + objD.getDate());

		                System.out.println("********************************"); 
	}

}
