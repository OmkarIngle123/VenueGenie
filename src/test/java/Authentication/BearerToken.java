package Authentication;
 
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class BearerToken {
	
	@Test
	
	public void bearerToken() {
		
		baseURI= "https://api.github.com";
		
		JSONObject obj = new JSONObject();
		
		obj.put("name","VenueGenie");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		}

}
