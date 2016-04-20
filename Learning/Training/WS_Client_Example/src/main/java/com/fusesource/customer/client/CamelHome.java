package com.fusesource.customer.client;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelHome {

	Logger log = Logger.getLogger(CamelHome.class);
	public void mainTest() throws Exception{
		System.setProperty("port1", "9000");
		ApplicationContext apContext = new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
		CamelContext context = SpringCamelContext.springCamelContext(apContext,false);
		try{
			log.info("Start camel context....");
			context.start();
		}
		finally{
			log.info("Stop camel context.....");
			context.stop();
		}
	}
	
	public static void main(String[] args) throws Exception {
		CamelHome ch = new CamelHome();
		ch.mainTest();

	}

}
