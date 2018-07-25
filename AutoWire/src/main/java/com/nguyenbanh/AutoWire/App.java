package com.nguyenbanh.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	
    	Customer customer = (Customer)context.getBean("customer");
    	
    	customer.getPerson().print();
    	
    	
    }
}
