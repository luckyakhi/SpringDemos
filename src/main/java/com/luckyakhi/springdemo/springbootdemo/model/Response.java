package com.luckyakhi.springdemo.springbootdemo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
	private String status;

	public String getStatus() {
		return status;
	}

	public   void setStatus(String status) {
		this.status = status;
	}
	
}
