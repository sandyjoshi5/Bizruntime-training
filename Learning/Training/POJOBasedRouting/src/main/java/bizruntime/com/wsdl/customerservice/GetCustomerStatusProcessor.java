package bizruntime.com.wsdl.customerservice;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class GetCustomerStatusProcessor implements Processor{

	private final Logger log = Logger.getLogger("GetCustomerStatusProcessor");
	@Override
	public void process(Exchange exchange) throws Exception {
		
		Object[] args = exchange.getIn().getBody(Object[].class);
		String id = (String) args[0];
		Holder status = (Holder) args[1];
		Holder statusMsg = (Holder) args[2];
		log.debug("Getting status for customer '" + id + "'");
		// This is where you'd actually do the work! Setting
		// the holder values to constants for the sake of brevity.
		//
		status.value = "Offline";
		statusMsg.value = "Going to sleep now!";
		exchange.getOut().setBody(new Object[] {status , statusMsg});	
	}

}
