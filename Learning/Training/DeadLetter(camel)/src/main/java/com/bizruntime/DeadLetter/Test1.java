package com.bizruntime.DeadLetter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class Test1 implements Processor
{
  Logger log = Logger.getLogger(Test1.class);
  
  @Override
  public void process(Exchange ex) throws Exception
  {
	  String str = ex.getIn().getBody(String.class);
	  log.info(" Message body :"+ str +"Test1");
	  ex.getOut().setBody(str.toUpperCase());
  }
}
