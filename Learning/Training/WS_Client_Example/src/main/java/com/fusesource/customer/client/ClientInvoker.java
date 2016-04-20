package com.fusesource.customer.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import com.bizruntime.wsdl.customerservice.Customer;
import com.bizruntime.wsdl.customerservice.CustomerService;
 
public class ClientInvoker implements Runnable {

  private static final Logger log
          = LoggerFactory.getLogger(ClientInvoker.class);

  private boolean shutdownInProgress = false;
  private Thread t;

   
  private CustomerService customerService;

  public void run() {
    while (! shutdownInProgress) {
      try {
        Thread.sleep(2000);
	   
        Customer response = customerService.lookupCustomer("1234");
        log.info("Got back " + response.getFirstName() + " "
                + response.getLastName()
                + ", ph:" + response.getPhoneNumber() );
            
      } catch (InterruptedException ex) {
        log.warn("Unexpected InterruptedException. " + ex);
      } 
    }
  }

  public void init() {
    log.info("Starting  client invoker thread.");
    t = new Thread(this, "Customer web service invoker thread.");
    t.start();
  }

  public void destroy() {
    log.info("Signaling client invoker thread to shutdown...");
    shutdownInProgress = true;

    try {
      t.join();
    } catch (InterruptedException ex) {
    
    }

    log.info("Thread stopped!");
  }

  public void setCustomerService(CustomerService customerService) {
    this.customerService = customerService;
  }

}
