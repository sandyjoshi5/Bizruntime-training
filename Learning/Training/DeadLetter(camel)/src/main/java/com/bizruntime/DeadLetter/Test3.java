package com.bizruntime.DeadLetter;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class Test3 {

	Logger log = Logger.getLogger(Test3.class);
	
		public void process(Exchange ex) throws Exception{
	
			String str = ex.getIn().getBody(String.class);
			log.info("message 3 body :"+str+"TEST3");
		 
		
	}	
}
