package com.Stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.Data.SetValues_Pojo_Put;
import com.utility.Apiutility;
import com.utility.Resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_step  extends Apiutility {
	RequestSpecification re;
	Response response;
	Resources rs= new Resources();
	

	
	@Given("the user has put method details")
	public void the_user_has_put_method_details() throws IOException {
		SetValues_Pojo_Put pj= new SetValues_Pojo_Put();
		re=RestAssured.given().baseUri("https://www.change2testautomation.com/").body(pj.putvalues());


	    
	    
	}

	@When("the user call put API with put HTTP method")
	public void the_user_call_put_api_with_put_http_method() {
	    response=re.when().put(rs.getPutAPI());
	    
	    
	}

	@Then("the user receive put status code success")
	public void the_user_receive_put_status_code_success() {
	    
		Assert.assertEquals(response.getStatusCode(), 937);
	}



	

}
