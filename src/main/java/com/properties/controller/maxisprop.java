/**
 * 
 */
package com.properties.controller;


import org.springframework.beans.factory.annotation.Autowired;
import com.properties.component.maxissysprop;

/**
 *  https://mkyong.com/spring/spring-propertysources-example/#properties-files
 
//@PropertySource("classpath:conf/operators/maxis/maxissys.properties")
@PropertySources({
    @PropertySource("classpath:/conf/operators/maxis/maxis.properties"),
    @PropertySource("classpath:conf/operators/celcom/celcom.properties")
})
*/
public class maxisprop {
	

	  @Autowired
	  private maxissysprop maxisprop;


} // End of maxisprop
