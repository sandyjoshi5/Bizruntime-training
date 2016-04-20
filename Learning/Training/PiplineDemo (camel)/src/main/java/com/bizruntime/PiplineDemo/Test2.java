package com.bizruntime.PiplineDemo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class Test2 implements Processor
	{
			Logger log =  Logger.getLogger(Test2.class);
		@Override
		public void process(Exchange ex) throws Exception{
		log.info("Exchange type :" +ex.getPattern());
		String str = ex.getIn().getBody(String.class);
		log.info("message 2 body :" +str);
		ex.getOut().setBody(str+ "My num is 3");		
		
	}
}
