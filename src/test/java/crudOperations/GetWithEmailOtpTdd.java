package crudOperations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetWithEmailOtpTdd {

	@Test
	public void GetWithEmailOtpBdd() {
		
		baseURI= "http://localhost:8080";
		
		when()
		.get("/admins/email/nalesanketg2021@gmail.com/otp/9876543")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
		
		
		
		
		
		
	}
}
