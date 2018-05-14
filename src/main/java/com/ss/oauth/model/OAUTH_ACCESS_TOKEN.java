package com.ss.oauth.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OAUTH_ACCESS_TOKEN" )
public class OAUTH_ACCESS_TOKEN implements Serializable
{

  

    private static final long serialVersionUID = 6932043549174320654L;
   
    @Id
    @Column(name="TOKEN_ID")
    private String TOKEN_ID;
    

    @Column(name="AUTHENTICATION_ID")
    private String AUTHENTICATION_ID;
    @Column(name="TOKEN")
    private byte[] TOKEN;
    

    @Column(name="USER_NAME")
    private String USER_NAME;
    @Column(name="CLIENT_ID")
    private String CLIENT_ID;
    @Column(name="AUTHENTICATION")
    private byte[] AUTHENTICATION;
    @Column(name="REFRESH_TOKEN")
    private String REFRESH_TOKEN;
	public String getTOKEN_ID() {
		return TOKEN_ID;
	}
	public void setTOKEN_ID(String tOKEN_ID) {
		TOKEN_ID = tOKEN_ID;
	}
	public String getAUTHENTICATION_ID() {
		return AUTHENTICATION_ID;
	}
	public void setAUTHENTICATION_ID(String aUTHENTICATION_ID) {
		AUTHENTICATION_ID = aUTHENTICATION_ID;
	}
	
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getCLIENT_ID() {
		return CLIENT_ID;
	}
	public void setCLIENT_ID(String cLIENT_ID) {
		CLIENT_ID = cLIENT_ID;
	}
	
	public String getREFRESH_TOKEN() {
		return REFRESH_TOKEN;
	}
	public void setREFRESH_TOKEN(String rEFRESH_TOKEN) {
		REFRESH_TOKEN = rEFRESH_TOKEN;
	}
	public byte[] getTOKEN() {
		return TOKEN;
	}
	public void setTOKEN(byte[] tOKEN) {
		TOKEN = tOKEN;
	}
	public byte[] getAUTHENTICATION() {
		return AUTHENTICATION;
	}
	public void setAUTHENTICATION(byte[] aUTHENTICATION) {
		AUTHENTICATION = aUTHENTICATION;
	}
    

}
