package com.demo.sapejbbusiness;

import javax.ejb.Remote;

@Remote
public interface Hello {

	public String sayHello();
	
}
