package com.Stepdefinition;

import java.io.IOException;
import static org.junit.Assert.*;


import com.Data.SetValues_Pojo_Delete;
import com.Data.SetValues_Pojo_Post;
import com.Data.SetValues_Pojo_Put;
import com.Data.payloadsdetails;
import com.utility.APIResources;
import com.utility.Apiutility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Reusable_Post extends Apiutility {
	
	RequestSpecification re;
	Response response;
    

@Given("the user has API method details")
public void the_user_has_api_method_details() throws IOException {
	
	
	re=RestAssured.given().spec(requestdetails());


    
}

@When("the user use {string} and {string} method")
public void the_user_use_and_method(String resource, String method) {
	APIResources postresource=APIResources.valueOf(resource);
	if (method.equalsIgnoreCase("post")) {
		
	SetValues_Pojo_Post	 p=new SetValues_Pojo_Post();
		response=re.body(p.setvalues()).when().post(postresource.getResource());
		
	}else if (method.equalsIgnoreCase("PUT"))
	{
		
		SetValues_Pojo_Put	 p=new SetValues_Pojo_Put();
		response=re.body(p.putvalues()).when().put(postresource.getResource());	
	}else if(method.equalsIgnoreCase("delete")){
		
		SetValues_Pojo_Delete	 p=new SetValues_Pojo_Delete();
		response=re.body(p.deletevalues()).when().delete(postresource.getResource());	
		
		
	}else if(method.equalsIgnoreCase("get")) {
		response=re.when().get(postresource.getResource());		
	}
   else if(method.equalsIgnoreCase("postpayload")) {
	   payloadsdetails p= new payloadsdetails();
	response=re.body(p.postpayload()).when().get(postresource.getResource());		
}
  else if (method.equalsIgnoreCase("PUTpayload")){
	  payloadsdetails p= new payloadsdetails();
	  response=re.body(p.putpayload()).when().get(postresource.getResource());
  }
  else if(method.equalsIgnoreCase("deletepayload")){
	  payloadsdetails p= new payloadsdetails();
	  response=re.body(p.deletepayload()).when().get(postresource.getResource());


  }


    

    
	
}

@Then("the {string} in the respose body is {string}")
public void the_in_the_respose_body_is(String keyvalue, String Expectedvalue) {
	String res=response.asString();
	System.out.println(res);
	JsonPath js=new JsonPath(res);
	assertEquals(js.get(keyvalue).toString(),Expectedvalue);
  
    
}




}
