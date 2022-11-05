package Authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class BasicAuth {

       
	@Test
	public void bearerToken()
	{
		 baseURI = "https://github.com/";
		
		 given().auth().basic("OmkarIngle123","Omi@14320")
		.when().get("/login")
		.then().log().all();
	}
}
