package SauceDemo.stepDefinitions;

import SauceDemo.SauceDemo.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createOrderStepDefinitions extends Utils {

	@Given("URL is launched and tittle of the website is verified")
	public void VerifyWebsiteTitle()
	{
		verifyBrowserTittle();
	}
	
	@When("User logged in with valid username and password")
	public void LoginToWebsite()
	{
		
		
	}
	
	@Then("User is on the products page and Add products to the cart")
	public void AddProductsToCart()
	{
		addItemsToCart();
	}
	
	
	@And("Move to cart and checkout")
	public void CheckoutCart()
	{
		checkoutCart();
	}
	
	
	@And("Add {String} {String} {String} information")
	public void AddUserInformation(String firstName,String lastName,String Pincode)
	{
		addInformation(firstName,lastName,Pincode);
	}
	
	@Then("Finish the order and verify {String} on the confirmation page")
	public void FinishOrderAndVerifyMessage(String message)
	{
		verifyMessage(message);
	}
	
}
