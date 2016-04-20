package com.biz.CamelExample;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class Test2 implements Processor{

	static Logger log= Logger.getLogger(Test1.class);

	@Override
	public void process(Exchange ex) throws Exception {
		String str= ex.getIn().getBody(String.class);
		log.info("Message :"+str);
		ex.getOut().setBody(str);
		int i=10/0;
		log.info(i);
		
	}

}
