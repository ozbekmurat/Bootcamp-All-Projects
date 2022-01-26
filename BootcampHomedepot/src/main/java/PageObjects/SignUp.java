package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public WebDriver driver;
@FindBy(name = "email") WebElement Email;
@FindBy(id = "password-input-field") WebElement Pass;
@FindBy(id = "zipCode") WebElement Zip;
@FindBy(id = "phone") WebElement Phone;
//@FindBy(id = "recaptcha-anchor-label") WebElement Robot;
@FindBy(xpath = "//span[contains(text(),'Create an Account')]") WebElement Create;

//@FindBy(xpath = "//*[contains(text(), '')]") WebElement error;

public SignUp(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void EmailFieldSendKeys(String email) {
	Email.sendKeys(email);
}
public void PassFieldSendKeys(String pass) {
	Pass.sendKeys(pass);
}
public void ZipFieldSendKeys(String zip) {
		Zip.sendKeys(zip);
	}
public void PhoneFieldSendKeys(String phone) {
		Phone.sendKeys(phone);	
}	

//public void RobotBoxClick() {
//Robot.click();
//}

public void CreateButtonClick() {
	Create.click();
}
/*public String text() {
String errorof=	error.getText();  //Ana sayfada text metodu cagirilinca o da errorof degiskenini return edecek bu da error.gettext function u calistiracak. Ve sayfadan text i alacak
return errorof; }*/
	

}
//Create an Account
//public void ContinueButtonClick() {
//Continue.click();


//