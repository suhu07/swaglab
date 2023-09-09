package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.CartPage;
import pom.HomePage;
import pom.LoginPage;

public class PlaceOrderTest extends Base {
	
	@BeforeMethod
	public void openBrowser() {
		driver = LaunchBrowser.chrome("https://www.saucedemo.com/");
	}
	
	@Test
	public void verifyIfCustomerIsAbleToLoginAndAddproductToCart() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("standard_user");
		login.enterPasswor("secret_sauce");
		login.clickOnloginButton();
		
		HomePage product = new HomePage(driver);
		product.clickOnAddTocart(1);
		product.clickOnCart();
		
		CartPage cart = new CartPage(driver);
		cart.clickOnCheckout();
		cart.enterFirstname("ABCD");
		cart.enterLastname("arise");
		cart.enterPostCode("12345");
		cart.clickOnContinue();
		cart.clickOnFinish();
	}


}
