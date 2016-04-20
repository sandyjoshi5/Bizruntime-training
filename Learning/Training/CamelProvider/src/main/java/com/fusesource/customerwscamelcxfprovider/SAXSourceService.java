package com.fusesource.customerwscamelcxfprovider;

import javax.xml.transform.sax.SAXSource;
import javax.xml.ws.Provider;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;
import javax.xml.ws.Service.Mode;

@WebServiceProvider
@ServiceMode(Mode.PAYLOAD)
public class SAXSourceService implements Provider<SAXSource>
{
	public SAXSource invoke(SAXSource t)
	{
		throw new UnsupportedOperationException("Not supported yet");
	}
}
