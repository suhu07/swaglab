package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@placeholder='Username']")     private WebElement username;
	@FindBy (xpath = "//input[@placeholder='Password']")     private WebElement password;
	@FindBy (xpath = "//input[@id='login-button']")          private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String id) {
		username.sendKeys(id);
	}
	public void enterPasswor(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnloginButton() {
		loginButton.click();
	}

}
