package crudOperations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteWithTdd {
	
	@Test
	public void DeleteWithBdd() {
		
		baseURI="http://localhost:8080";
		
		when()
		.delete("/admins/35")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
	}
	

}
