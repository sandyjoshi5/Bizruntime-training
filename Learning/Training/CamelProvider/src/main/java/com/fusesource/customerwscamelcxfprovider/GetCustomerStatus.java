package com.fusesource.customerwscamelcxfprovider;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class GetCustomerStatus implements Processor
{
	public void process(Exchange exchange) throws Exception
	{
		String id = exchange.getIn().getHeader("CustomerId",String.class);
		
		exchange.getIn().setHeader("status", "Away");
		exchange.getIn().setHeader("statusMessage", "Going to office");
	}
}
