# SauceLabs
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


 @Test
	public void ValidUserNamePassword()
	{
		submitRequest("test@gmail.com","test");
		verifyStatusCode(200);
		verifyResponse("expectedValue");
		
	}
	
	@Test
	public void InValidUserNameValidPassword()
	{
		submitRequest("testing@gmail.com","test");
		verifyStatusCode(400);
		
	}


	@Test
	public void ValidUserNameInValidPassword()
	{
		submitRequest("test@gmail.com","testing");
		verifyStatusCode(400);
		
	}
	
	@Test
	public void InValidUserNameInValidPassword()
	{
		submitRequest("testing@gmail.com","testing");
		verifyStatusCode(400);
		
	}
