package com.demo.sap;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloEJB
 */
@Stateless
@LocalBean
public class HelloEJB {

    public String hello(){
    	return "hello from Bean";
    }

}
