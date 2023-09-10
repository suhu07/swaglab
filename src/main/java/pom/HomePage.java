package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//div[@class='inventory_item_name']")                         private List<WebElement> product;
	@FindBy (xpath = "//button[text()='Add to cart']")                              private List<WebElement> addToCart;
	@FindBy (xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")  private WebElement AddToCart;
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")                       private WebElement menuButton;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnProduct(int i) {
		WebElement value = product.get(i);
		value.click();
	}
	public void clickonAddtocart() {
		AddToCart.click();
	}
	public void clickOnAddTocart(int i) {
		WebElement item = addToCart.get(i);
		item.click();
	}
	

}
