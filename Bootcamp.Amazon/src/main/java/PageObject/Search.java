
package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.FindBy;

public class Search {
	public WebDriver driver;
	
	//twotabsearchtextbox
	//nav-search-submit-button
	
	
	@FindBy(id = "twotabsearchtextbox") WebElement Search;
	@FindBy(id = "nav-search-submit-button") WebElement Searchsubmit;
	
	
	public Search(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void SearchFieldSendKeys() {
	Search.sendKeys("Samsung ear buds");
	
}
public void SearchsubmitToClick() {
	Searchsubmit.click();

   }


}