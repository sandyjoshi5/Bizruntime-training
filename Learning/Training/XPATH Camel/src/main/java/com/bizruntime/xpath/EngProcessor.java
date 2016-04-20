package com.bizruntime.xpath;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class EngProcessor implements Processor {

	public void process(Exchange arg0) throws Exception {

		System.out.println("inside the Engineering Processor");
	}

}
