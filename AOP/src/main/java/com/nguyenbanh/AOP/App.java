package com.nguyenbanh.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	CustomerService a = (CustomerService)context.getBean("customer");
    	
    	a.printName();
    	
    	a.printURL();
    	
    	try{
    		a.printThrowException();
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    	
    	
    	
    	
    	
    }
}
