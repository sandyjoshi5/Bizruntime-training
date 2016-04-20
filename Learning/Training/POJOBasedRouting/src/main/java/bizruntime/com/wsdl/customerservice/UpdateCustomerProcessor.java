package bizruntime.com.wsdl.customerservice;

import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class UpdateCustomerProcessor implements Processor{

	private final Logger LOG = Logger.getLogger("UpdateCustomerProcessor");
	@Override
	public void process(Exchange exchange) throws Exception {
		
		LOG.info("Update Customer");
		
	}

}
