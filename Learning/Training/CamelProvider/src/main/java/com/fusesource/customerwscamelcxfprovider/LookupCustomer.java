package com.fusesource.customerwscamelcxfprovider;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LookupCustomer implements Processor
{
	public void process(Exchange exch)  throws Exception
	{
		String id = exch.getIn().getHeader("CustomerId", String.class);
		
		exch.getIn().setHeader("firstName", "Sandeep");
		exch.getIn().setHeader("Lastname", "Joshi");
		exch.getIn().setHeader("phoneNumber", "9738060480");
		exch.getIn().setHeader("id", id);	
	}

}
