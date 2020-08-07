package com.Stepdefinition;

import com.utility.Apiutility;
import com.utility.Resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;


public class Get_step extends Apiutility {
	RequestSpecification re;
	Response response;
	Resources rs= new Resources();



@Given("the user has get method details")
public void the_user_has_get_method_details() {
    re=RestAssured.given().basePath("https://www.change2testautomation.com/").header("Content type","application/json");
    
}

@When("the user call get with get HTTP method")
public void the_user_call_get_with_get_http_method() {
	response =re.when().get(rs.getGetAPI()); 
    
}

@Then("the user receive get status code success")
public void the_user_receive_get_status_code_success() {
	Assert.assertEquals( response.getStatusCode(), 200);
	System.out.println(response.asString());

	

    
    
}




}
