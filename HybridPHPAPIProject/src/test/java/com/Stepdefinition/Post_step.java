package com.Stepdefinition;

import com.Data.SetValues_Pojo_Post;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;



public class Post_step extends com.utility.Apiutility {
	RequestSpecification re;
	Response response;

	@Given("The user has Post method details")
	public void the_user_has_post_method_details() throws IOException {
		SetValues_Pojo_Post pj= new SetValues_Pojo_Post();
		re=RestAssured.given().spec(requestdetails()).body(pj.setvalues());

	}

	@When("the user call Post API with post HTTP method")
	public void the_user_call_post_api_with_post_http_method() {
		response =re.when().post("/api/insert.php");
	}

	@Then("the user receive post status code success")
	public void the_user_receive_post_status_code_success() {
		Assert.assertEquals( response.getStatusCode(), 200);


	}



}