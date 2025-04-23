package regres.regres.utils;

import io.restassured.RestAssured;

public class Utils {
 
	Response res;
	public void submitRequest(String email,String password)
	{
		RestAssured.baseURI="https://regres.in";
		res=RestAssured.given().body(data(email,password)).when().post("api/login").then().extract().response();
	}


	public static String data(String email,String password)
	{
		String str="{\r\n"
				+ "				\"email\":\""+email+"\",\r\n"
				+ "				\"password\":\""+password+"\"\r\n"
				+ "		}";
		return str;
					
	}

	public void verifyStatusCode(int StatusCode)
	{
		Assert.assertEquals(res.statusCode(), StatusCode);
		
	}

	public void verifyResponse(String expectedValue)
	{
		String Actualresponse=res.asString();
		JsonPath js=new JsonPath(Actualresponse);
		js.getString("value");
		Assert.assertEquals(res.statusCode(), 200);
		
	}

}
