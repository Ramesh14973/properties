/**
 * 
 */
package com.properties.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
@PropertySource("classpath:/conf/operators/maxis/maxis.properties")
public class maxissysprop {
	
	@Value("${lip4maxis}")
	private String lip4maxis;
	
	@Value("${httptimeout}")
	private int httptimeout;
	
	@Value("${totalhttpconn}")
	private int totalhttpconn;

	//User ID
	@Value("${userid}")
	private String userid;
	
	@Value("${password}")
	private String password;
	
	@Value("${offnet}")
	private boolean offnet;

	@Value("${checkoperator}")
	private boolean checkoperator;

	@Value("${splchar}")
	private String splchar;

	// Local IP
	@Value("${lip4telco}")
	private String lip4telco;

	//priceTaG
	@Value("${pricetag}")
    private String pricetag;
	
	@Value("${replaceptag}")
	private String replaceptag;
	
	@Value("${unicpricetag}")
	private String unicpricetag;
	
	@Value("${replaceunicptag}")
	private String replaceunicptag;

	public String getLip4maxis() {
		return lip4maxis;
	}

	public void setLip4maxis(String lip4maxis) {
		this.lip4maxis = lip4maxis;
	}

	public int getHttptimeout() {
		return httptimeout;
	}

	public void setHttptimeout(int httptimeout) {
		this.httptimeout = httptimeout;
	}

	public int getTotalhttpconn() {
		return totalhttpconn;
	}

	public void setTotalhttpconn(int totalhttpconn) {
		this.totalhttpconn = totalhttpconn;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isOffnet() {
		return offnet;
	}

	public void setOffnet(boolean offnet) {
		this.offnet = offnet;
	}

	public boolean isCheckoperator() {
		return checkoperator;
	}

	public void setCheckoperator(boolean checkoperator) {
		this.checkoperator = checkoperator;
	}

	public String getSplchar() {
		return splchar;
	}

	public void setSplchar(String splchar) {
		this.splchar = splchar;
	}

	public String getLip4telco() {
		return lip4telco;
	}

	public void setLip4telco(String lip4telco) {
		this.lip4telco = lip4telco;
	}

	public String getPricetag() {
		return pricetag;
	}

	public void setPricetag(String pricetag) {
		this.pricetag = pricetag;
	}

	public String getReplaceptag() {
		return replaceptag;
	}

	public void setReplaceptag(String replaceptag) {
		this.replaceptag = replaceptag;
	}

	public String getUnicpricetag() {
		return unicpricetag;
	}

	public void setUnicpricetag(String unicpricetag) {
		this.unicpricetag = unicpricetag;
	}

	public String getReplaceunicptag() {
		return replaceunicptag;
	}

	public void setReplaceunicptag(String replaceunicptag) {
		this.replaceunicptag = replaceunicptag;
	}

		
	
} // End of maxissysprop
