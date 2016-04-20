package com.bizruntime.RecipientList;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelRecipientListExampleUsingSpring {
@SuppressWarnings("deprecation")
public static final void main(String[] args) throws Exception
{
	ApplicationContext appContext = new ClassPathXmlApplicationContext("camel-context.xml");
	CamelContext camelContext = SpringCamelContext.springCamelContext(appContext,false);
	try{
		ProducerTemplate template = camelContext.createProducerTemplate();
		camelContext.start();
		System.out.println("____----____----____");
		Employee  sam = new Employee("sandeep");
		sam.setNew(true);
		sam.setMessage("Joined");
		
		template.sendBody("direct start", sam);
		System.out.println("____----____----____");
		
		Employee john = new Employee("John");
		john.setOnLeave(true);
		john.setMessage("on Leave");
		template.sendBody("direct : start", john);
		
		System.out.println("____----____----____");
		
		Employee roy = new Employee("Roy");
		roy.setPromoted(true);
		roy.setMessage("Promoted");
		template.sendBody("direct : start", roy);
		
				
		System.out.println("____----____----____");
		
		Employee ram = new Employee("Ram");
		ram.setResigining(true);
		ram.setMessage("Resigning");
		template.sendBody("direct : start", ram);
		
		
		System.out.println("____----____----____");
		
	}finally{
		camelContext.stop();		
	}
	
}

}
