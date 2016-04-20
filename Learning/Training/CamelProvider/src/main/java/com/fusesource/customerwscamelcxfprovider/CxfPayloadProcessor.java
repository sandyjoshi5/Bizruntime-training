package com.fusesource.customerwscamelcxfprovider;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.cxf.binding.soap.SoapHeader;

import org.w3c.dom.Document;

public class CxfPayloadProcessor implements Processor
{
	private static final Logger log = LoggerFactory.getLogger(CxfPayloadProcessor.class);
	
	public void process(Exchange exchange) throws Exception{
			Document xml = exchange.getIn().getBody(Document.class);
			List<Element> 	elements = new ArrayList<Element>();
			elements.add(xml.getDocumentElement());
			exchange.getOut().setBody(new CxfPayload<SoapHeader>(null,elements));
	}

}
