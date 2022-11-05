package crudOperations;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic.utility.BaseClass;

import io.restassured.http.ContentType;

public class PostwithTdd extends BaseClass {

	@Test
	 public void postwithTDD() {
		 
		 JSONObject object=new JSONObject();
		 object.put("email", "omkar.ingale2001@gmail.com");
		 object.put("id",126);
		 object.put("name","Omkar");
		 object.put("otp",123456);
		 object.put("passWord","Omkar@123");
		 object.put("phone","8999096615");
		 
      given()
		   .contentType(ContentType.JSON)
		   .body(object)
		   
		   .when()
		   .post("http://localhost:8080/admins")
		   
		   .then()
	       .assertThat().statusCode(201)
	       .log().all();
		
		
	 }

}
