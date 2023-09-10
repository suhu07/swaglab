package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")   private WebElement menuButton;
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")          private WebElement logOut ;
	@FindBy (xpath = "//a[text()='All Items']")                 private WebElement allItems;
	@FindBy (xpath = "//a[@id='about_sidebar_link']")           private WebElement About;
	@FindBy (xpath = "//a[text()='Reset App State']")           private WebElement appState;
	
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenuButton() {
		menuButton.click();
	}
	public void clickOnLogOut() {
		logOut.click();
	}
	public void clickOnAllItems() {
		allItems.click();
	}
	public void clickOnAbout() {
		About.click();
	}
	public void clickOnAppStates() {
		appState.click();
	}

}
