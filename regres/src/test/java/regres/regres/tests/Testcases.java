package regres.regres.tests;

import org.testng.annotations.Test;

import regres.regres.utils.Utils;

public class Testcases extends Utils {

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

}
