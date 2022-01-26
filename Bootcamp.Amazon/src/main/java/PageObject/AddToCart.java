package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	public WebDriver driver;
	
@FindBy(linkText= "SAMSUNG Galaxy Buds Live True Wireless Earbuds US Version Active Noise Cancelling Wireless Charging Case Included, Mystic Black") WebElement Searchproduct;
//@FindBy(className = "a-button-input attach-dss-atc") WebElement AddToCart;
@FindBy(id = "add-to-cart-button") WebElement AddToCart;
//@FindBy(name = "proceedToCheckout") WebElement Proceed;
//@FindBy(linkText= "Proceed to checkout") WebElement Proceed;
//@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]") WebElement Proceed;

//@FindBy(xpath = "//span[contains(text(),'Create an Account')]") WebElement Create;
//@FindBy(xpath = "//*[contains(text(), '')]") WebElement error;

public AddToCart(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void SearchproductToClick() {
	Searchproduct.click();
}

public void AddToCartClick() {
AddToCart.click();
}

//public void ProccedClick() {
//Proceed.click();
//}

/*public String text() {
String errorof=	error.getText();  //Ana sayfada text metodu cagirilinca o da errorof degiskenini return edecek bu da error.gettext function u calistiracak. Ve sayfadan text i alacak
return errorof; }*/
	

}
//Create an Account
//public void ContinueButtonClick() {
//Continue.click();


//