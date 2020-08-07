package com.utility;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Apiutility {
	
public RequestSpecification requestdetails() throws IOException {
		
		RequestSpecification request=new RequestSpecBuilder().
	    	setBaseUri(getConfigvalues("baseuri")).
			setContentType(ContentType.JSON).build();
	  	return request;		
	}
public  static String getConfigvalues(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\siva__0kz400j\\eclipse-workspace\\HybridPHPAPIProject\\src\\test\\resources\\properties\\config.properties");
         prop.load(fis);	
        return prop.getProperty(key);
     }
}