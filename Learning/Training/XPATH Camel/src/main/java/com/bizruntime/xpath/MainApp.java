package com.bizruntime.xpath; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	 public static void main(final String[] args) throws Exception {
		 new ClassPathXmlApplicationContext("camel-context.xml");
		 Thread.sleep(4000);
		 }

}