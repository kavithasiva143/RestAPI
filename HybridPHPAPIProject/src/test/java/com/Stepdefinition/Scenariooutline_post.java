package com.Stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.Data.SetValues_Pojo_Post;
import com.utility.Apiutility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Scenariooutline_post extends Apiutility {
	RequestSpecification re;
	Response response;

	@Given("the user has post method details {string} {string} {string}")
	public void the_user_has_post_method_details(String Title, String body, String author) throws IOException {
		SetValues_Pojo_Post pj= new SetValues_Pojo_Post();
		re=RestAssured.given().spec(requestdetails()).body(pj.setvalues_post(Title, body, author));


	    
	}

	@When("the user send post HTTP request")
	public void the_user_send_post_http_request() {
		response =re.when().post("/api/insert.php");
	    
	    
	}

	@Then("user gets message data inserted succesfully")
	public void user_gets_message_data_inserted_succesfully() {
		Assert.assertEquals( response.getStatusCode(), 200);  
		System.out.println(response.asString());
	    
	}




}
