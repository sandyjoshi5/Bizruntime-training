package com.bizruntime.camel;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;			
import org.apache.cxf.frontend.ClientFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bizruntime.cxf.Calculation;

public class ClientProcessor implements Processor{

	private final Logger LOG = Logger.getLogger("ClientProcessor");
	@Override
	public void process(Exchange exchange) throws Exception {
		
		LOG.info("Message Processing");
		
		List<Object> body = exchange.getIn().getBody(List.class);
		Iterator it = body.iterator();
		int [] arr = new int[2];
		int i = 0;
		int sum = 0;
		while(it.hasNext()) {
			arr[i] = (int) it.next();
			sum += arr[i++]; 
		}
		
		LOG.info("Sum: " + sum);
		exchange.getOut().setBody(sum);
		
		/*JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		ClientFactoryBean clientBean = factory.getClientFactoryBean();
		clientBean.setAddress("http://localhost:8080/DemoCxf/services/CalculationPort");
		clientBean.setServiceClass(Calculation.class);
		Object client = factory.create();
		
		int response = 0;
		try {

			response = ((Calculation) client).addition(10, 20);
			LOG.info("Addition:- " + response);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		exchange.getOut().setBody(response);*/
		
		
	}
	
	

}
