package com.bizruntime.DeadLetter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class Test2 implements Processor
{
   Logger log =  Logger.getLogger(Test2.class);
   
   @Override
   public void process(Exchange ex) throws Exception{
	
	   String str = ex.getIn().getBody(String.class);
	   log.info("message body :"+str+"TEST2");
	   ex.getOut().setBody(str+"My number is 3");
   }
}
