/**
 * 
 */
package com.properties.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.properties.component.celcomprop;
import com.properties.component.maxissysprop;

/**
 * 
*/
@RestController
//@RequestMapping("/getproperty")
public class operatorcontroller {
	private static final Logger logger = LogManager.getLogger(operatorcontroller.class);

	  @Autowired
	  private maxissysprop maxissysprop;
	  
	  @Autowired
	  private celcomprop celprop;
	  

	//@PathVariable String Lip4maxis
	@GetMapping("/getLip4maxis")
	public String getLip4maxis() {
		
		info("Maxis IP  ----> : "+ maxissysprop.getLip4maxis());
		
		info("Maxis IP changed in source  ----> : "+ maxissysprop.getLip4telco());
		
		return maxissysprop.getLip4maxis();
	} // End of getLip4maxis
	
	
	@GetMapping("/getLip4celcom")
	public String getLip4telco() {
		
		return celprop.getLip4telco();
		
	} // End of getLib4celcom
	
	private void info(String strPrint) {logger.info(strPrint);}
} // End of propertycontroller
