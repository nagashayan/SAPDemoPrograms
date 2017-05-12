package com.demo.sap;

public class HelloBean {

	private String name;
	public HelloBean(){
		setName("naga");
	}
	
	public void setName(String tname){
		name = tname;
	}
	
	public String getName(){
		return name;
	}
	
}
