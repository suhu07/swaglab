package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.CartPage;
import pom.HomePage;
import pom.LogOutPage;
import pom.LoginPage;

public class PlaceOrderTest extends Base {
	
	@BeforeMethod
	public void openBrowser() {
		driver = LaunchBrowser.chrome("https://www.saucedemo.com/");
		LoginPage login = new LoginPage(driver);
		login.enterUsername("standard_user");
		login.enterPasswor("secret_sauce");
		login.clickOnloginButton();
	}
	
	
	@Test(priority=1)
	public void loginWithProperUsenameAndPassword() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("standard_user");
		login.enterPasswor("secret_sauce");
		login.clickOnloginButton();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test(priority=2)
	public void verifyIfCustomerIsAbleToLoginAndAddproductToCart() {
		
		HomePage product = new HomePage(driver);
		product.clickOnAddTocart(1);
		product.clickonAddtocart();
		
		CartPage cart = new CartPage(driver);
		cart.clickOnCart();
		cart.clickOnCheckout();
		cart.enterFirstname("ABCD");
		cart.enterLastname("arise");
		cart.enterPostCode("12345");
		cart.clickOnContinue();
		cart.clickOnFinish();
	}
	@Test(priority=3)
	public void verifyIfCustomerIsAbleToAddProductFromDisplayPage() {
		HomePage item = new HomePage(driver);
		item.clickOnProduct(1);
		item.clickonAddtocart();
		driver.navigate().back();
		item.clickOnAddTocart(4);
		
	}
	@Test(priority=4)
	public void verifyIfUserAbleToLogOut() {
		LogOutPage logout = new LogOutPage(driver);
		logout.clickOnMenuButton();
		logout.clickOnLogOut();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
		
	}
	@Test(priority=5)
	public void verifyIfCustomerIsAbleToFillCheckoutInfo() {
		CartPage cart = new CartPage(driver);
		cart.clickOnCart();
		cart.clickOnCheckout();
		cart.enterFirstname("ABCD");
		cart.enterLastname("arise");
		cart.enterPostCode("12345");
		cart.clickOnContinue();
		cart.clickOnFinish();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/checkout-complete.html");
		
	
	}
	

}
