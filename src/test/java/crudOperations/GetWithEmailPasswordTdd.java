
package crudOperations;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetWithEmailPasswordTdd {
	
	@Test
	public void GetWithEmailPasswordBdd() {
		
		baseURI="http://localhost:8080";
		
		given()
		.contentType(ContentType.JSON);
		
		when()
		.get("/admins/email/nalesanketg2021@gmail.com/password/Rajkumar@788")
		
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
		
		
		
		
		
		
		
	}
	

}
