package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy (xpath = "//button[@id='checkout']")              private WebElement checkoutButton;
	@FindBy (xpath = "//input[@id='first-name']")              private WebElement firstName;
	@FindBy (xpath = "//input[@id='last-name']")              private WebElement lastName;
	@FindBy (xpath = "//input[@id='postal-code']")              private WebElement postalCode;
	@FindBy (xpath = "//input[@id='continue']")              private WebElement continueButton;
	@FindBy (xpath = "//button[@id='finish']")              private WebElement finishButton;

	
	public CartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCheckout() {
		checkoutButton.click();
	}
	public void enterFirstname(String name) {
		firstName.sendKeys(name);
	}
	public void enterLastname(String last) {
		lastName.sendKeys(last);
	}
	public void enterPostCode(String number) {
		postalCode.sendKeys(number);
	}
	public void clickOnContinue() {
		continueButton.click();
	}
	public void clickOnFinish() {
		finishButton.click();
	}
}
