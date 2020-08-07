package com.Stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.Data.SetValues_Pojo_Post;
import com.Data.SetValues_Pojo_Put;
import com.utility.Apiutility;
import com.utility.Resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Scenariooutline_put extends Apiutility {
	RequestSpecification re;
	Response response;



@Given("the user has put method details {string} {string}")
public void the_user_has_put_method_details(String author, String id) throws IOException {
	SetValues_Pojo_Put pj= new SetValues_Pojo_Put();
	re=RestAssured.given().spec(requestdetails()).body(pj.putvalues(author, id));


    
}

@When("the user send put HTTP request")
public void the_user_send_put_http_request() {
	Resources res= new Resources();
    response= re.when().put(res.getPutAPI());
    
}

@Then("user gets message data updated succesfully")
public void user_gets_message_data_updated_succesfully() {
    
	Assert.assertEquals( response.getStatusCode(), 200);  
	System.out.println(response.asString());
    

}




}
