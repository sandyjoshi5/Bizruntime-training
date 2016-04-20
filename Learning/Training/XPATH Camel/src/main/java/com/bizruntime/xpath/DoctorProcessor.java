package com.bizruntime.xpath;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.file.GenericFile;

public class DoctorProcessor implements Processor {

	public void process(Exchange arg0) throws Exception {
		
		System.out.println("inside doctor");
		
		GenericFile genericFile = (GenericFile) arg0.getIn().getBody();   
		
		
		System.out.println("  -----------   "+genericFile);
	}

}
