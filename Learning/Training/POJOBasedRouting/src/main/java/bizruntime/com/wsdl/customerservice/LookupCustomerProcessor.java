package bizruntime.com.wsdl.customerservice;

import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LookupCustomerProcessor implements Processor{

	private final Logger LOG = Logger.getLogger("LookupCustomerProcessor");
	@Override
	public void process(Exchange exchange) throws Exception {
		
		LOG.info("Lookup Customer");
		
	}

}
