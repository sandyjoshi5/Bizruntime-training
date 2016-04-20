package com.bizruntime.PiplineDemo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class Test1 implements Processor
{
	Logger log = Logger.getLogger(Test1.class);
	@Override
	public void process(Exchange ex) throws Exception{
		String str = ex.getIn().getBody(String.class);
		log.info("Exchange trpe:" +ex.getPattern());
		log.info("message body :" +str);
		ex.getOut().setBody(str.toUpperCase());
	}

}
