package com.fusesource.customerwscamelcxfpayload;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
public class LookupCustomer implements Processor
{
	 
    public void process(Exchange exchng) throws Exception {
        String id = exchng.getIn().getHeader("customerId", String.class);
       System.out.println(id);
        // Maybe do some kind of lookup here!
        //

        exchng.getIn().setHeader("firstName", "sandeep");
        exchng.getIn().setHeader("lastName", "joshi");
        exchng.getIn().setHeader("phoneNumber", "9738060480");
        exchng.getIn().setHeader("id", id);

    }
}
