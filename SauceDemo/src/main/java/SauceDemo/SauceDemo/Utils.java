package SauceDemo.SauceDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Utils extends BaseTest {

	
	public void verifyBrowserTittle()
	{
		
		String Title=driver.getTitle();
		Assert.assertEquals(Title, "Swag Labs");
		
	}
	
	@Test(dataProvider="getData")
	public void login(String UserName,String Password)
	{
		
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-button")).submit();
		Assert.assertEquals(driver.findElement(By.id("react-burger-menu-btn")).isDisplayed(), true);
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[1][0];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		return data;
				
	}
	
	
	public void addItemsToCart()
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	}
	
	public void checkoutCart()
	{
		
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		
		
	}
	
	public void addInformation(String firstName,String lastName,String Pincode)
	{
		
		driver.findElement(By.id("first-name")).sendKeys(firstName);
		driver.findElement(By.id("last-name")).sendKeys(lastName);
		driver.findElement(By.id("postal-code")).sendKeys(Pincode);
		
		
	}
	
	public void verifyMessage(String message)
	{
		driver.findElement(By.id("finish")).click();
		String Actualmessage= driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
		Assert.assertEquals(Actualmessage, message);
		
		
	}
	
}
