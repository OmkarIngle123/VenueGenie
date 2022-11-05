package crudOperations;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class PutWithTdd {
	
	@Test
    public void PutWithBdd() {
    	
    	baseURI="http://localhost:8080";
    	
    	JSONObject object=new JSONObject();
		 object.put("email","omkar.ingale2001@gmail.com");
		 object.put("id",58);
		 object.put("name","Omi");
		 object.put("otp",123457);
		 object.put("passWord","Omkar@123");
		 object.put("phone","8999096615");
		 
		 given()
		   .contentType(ContentType.JSON)
		   .body(object)
		   
		   .when()
		   .put("/admins")
		   
		   .then()
	       .assertThat().statusCode(200)
	       .log().all();
		
    	
    }

}
