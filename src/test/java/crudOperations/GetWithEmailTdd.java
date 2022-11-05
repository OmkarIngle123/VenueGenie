package crudOperations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetWithEmailTdd {
	
	@Test
	public void GetWithEmailBdd() {
	baseURI="http://localhost:8080";
	
	when()
	.get("/admins/email/nalesanketg2021@gmail.com")
	
	.then()
	.assertThat().statusCode(200)
	.log().all();

}
}
