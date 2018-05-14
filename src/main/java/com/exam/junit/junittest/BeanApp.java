package com.exam.junit.junittest;

import java.util.List;

public class BeanApp {
	
	private String appid;
	private String appname;
	private String appsecret;
	private String description;
	private List<String> approles;
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public String getAppsecret() {
		return appsecret;
	}
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getApproles() {
		return approles;
	}
	public void setApproles(List<String> approles) {
		this.approles = approles;
	}
	
	

}
