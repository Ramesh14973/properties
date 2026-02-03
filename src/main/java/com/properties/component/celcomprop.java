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
@PropertySource("classpath:/conf/operators/celcom/celcom.properties")
public class celcomprop {

//69669
//69669.userid=iSentric
	@Value("${69669.userid}")
	private String userid;

	//69669.password=29696
	@Value("${69669.password}")
	private String password;
	
    //69669.cpid=iSentric
	@Value("${69669.cpid}")
	private String cpid;

//#69970
//69970.userid=iSentric
//69970.password=29696
//69970.cpid=iSentric

// #priceTaG
	@Value("${pricetag}")
	private String pricetag;
	
	@Value("${replaceptag}")
	private String replaceptag;
	
	@Value("${unicpricetag}")
    private String unicpricetag;
	
	@Value("${replaceunicptag}")
	private String replaceunicptag;

	//Local IP
	@Value("${lip4telco}")
	private String lip4telco;

	// Text Message datacode
	@Value("${A}")
	private String typeA;
	
	@Value("${LA}")
	private String typeLA;
	
	//#Unicode
	@Value("${U}")
	private String U;

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

	public String getCpid() {
		return cpid;
	}

	public void setCpid(String cpid) {
		this.cpid = cpid;
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

	public String getLip4telco() {
		return lip4telco;
	}

	public void setLip4telco(String lip4telco) {
		this.lip4telco = lip4telco;
	}

	public String getTypeA() {
		return typeA;
	}

	public void setTypeA(String typeA) {
		this.typeA = typeA;
	}

	public String getTypeLA() {
		return typeLA;
	}

	public void setTypeLA(String typeLA) {
		this.typeLA = typeLA;
	}

	public String getU() {
		return U;
	}

	public void setU(String u) {
		U = u;
	}

	
	
	
} // End of celcomprop
