package com.Stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.Data.SetValues_Pojo_Delete;
import com.Data.SetValues_Pojo_Put;
import com.utility.Apiutility;
import com.utility.Resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Scenariooutline_delete extends Apiutility {
	RequestSpecification re;
	Response response;

@Given("the user has delete method details {string}")
public void the_user_has_delete_method_details(String id) throws IOException {
	SetValues_Pojo_Delete pj= new SetValues_Pojo_Delete();
	re=RestAssured.given().baseUri("https://www.change2testautomation.com/"
		).body(pj.deletevalues(id));
	



    
}

@When("the user send delete HTTP request")
public void the_user_send_delete_http_request() {
    
	Resources res= new Resources();
    response= re.when().delete(res.getDeleteAPI());
    

}

@Then("user gets message data deleted succesfully")
public void user_gets_message_data_deleted_succesfully() {
	Assert.assertEquals(response.getStatusCode(), 200);  
	System.out.println(response.asString());
    

    
}




}
