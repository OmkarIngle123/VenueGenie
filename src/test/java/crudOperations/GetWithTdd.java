package crudOperations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class GetWithTdd {
	
	@Test
	public void getIdwithbdd() {
		baseURI="http://localhost:8080";
		
		when()
		.get("/admins/133")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
		
	}

}
