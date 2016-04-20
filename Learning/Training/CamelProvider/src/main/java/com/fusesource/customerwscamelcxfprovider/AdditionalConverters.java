package com.fusesource.customerwscamelcxfprovider;


import java.io.ByteArrayInputStream;
import javax.xml.transform.sax.SAXSource;
import org.apache.camel.Converter;
import org.xml.sax.InputSource;

@Converter
public class AdditionalConverters {
	
	@Converter
	public static SAXSource toSaxSource(String xml){
		return new SAXSource(new InputSource(new ByteArrayInputStream(xml.getBytes())));
	}
}
