
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.FindBy;

public class Home {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[contains (text(),'My Account')]") WebElement My;
	@FindBy(xpath = "//*[contains (text(),'Register')]") WebElement Register;
	@FindBy(xpath = "//*[contains (text(),'Select & Continue')]") WebElement Select;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void MyToClick() {
	My.click();
}
public void RegisterToClick() {
	Register.click();

   }

public void SelectToClick() {
	Select.click();
}

}