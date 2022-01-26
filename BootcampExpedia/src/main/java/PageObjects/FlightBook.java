package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBook {
	public WebDriver driver;
	
	//uitk-fake-input uitk-form-field-trigger	
	
	/*WebElement flights=driver.findElement(By.xpath("//*[text()='Flights']"));
    flights.click();
    WebElement departure=driver.findElement(By.id("d1-btn"));
    departure.click();
    Thread.sleep(6000);
    WebElement slectdatefor=driver.findElement(By.xpath("//*[@aria-label='Dec 26, 2021']")); 
    slectdatefor.click();*/

@FindBy(xpath = "//span[contains(text(), 'Flights')]") WebElement Flights;
@FindBy(xpath = "//span[contains (text(), 'Roundtrip')]") WebElement Round;
@FindBy(xpath = "//button[contains(@aria-label,'Leaving from')]") WebElement Depclick;
@FindBy(id = "location-field-leg1-origin") WebElement Departure;
@FindBy(xpath ="//button[@aria-label='Search for “IAD”']") WebElement Searchclickd;
//@FindBy(xpath = "//ul[@data-stid='location-field-leg1-origin-results']//li/descendant::div[@class='truncate']") List<WebElement> DepartureSelect;

@FindBy(xpath = "//button[contains(@aria-label,'Going to')]") WebElement Arrclick;
@FindBy(id = "location-field-leg1-destination") WebElement Arrival;
@FindBy(xpath ="//button[@aria-label='Search for “Ankara”']") WebElement Searchclicka;
@FindBy(id = "d1-btn") WebElement Depdate;
@FindBy(id = "d2-btn") WebElement Arrdate;
//@FindBy(xpath = "//button[@id='d1-btn' and @aria-label='Feb 21, 2022']//*[contains (text(),'Feb 21')]") WebElement Depdatefield;
//@FindBy(xpath = "//button[@id='d1-btn' and @aria-label='Feb 27, 2022']//*[contains (text(),'Feb 27')]") WebElement Arrdatefield;
@FindBy(xpath= "//*[@aria-label='Dec 21, 2021']") WebElement Depdatefield;

@FindBy(xpath = "//button [contains (text(), 'Search')]") WebElement Search;
@FindBy(xpath = "//button[contains(@data-test-id,'select-link')]") WebElement SelectLink;
@FindBy(xpath ="//li[@id='AQrDAgqtAnY1LXNvcy0yMjE0NGI1OTk0MjRhMTlmNWZlZmFkM2E5NTk0YjVlMS0xLTItMX4yLlN-QVFvQ0NBRVNCd2pVQkJBQkdBRW9BbGdDY0FBfkFRcERDaDRJMUpZQkVnRTRHSWdZSU1pY0FTaVhfNE1DTU5hRGhBSTRVRUFBV0FFS0lRalVsZ0VTQkRJeE56QVl5SndCSU1RTUtNU0VoQUl3aW9XRUFqaFpRQUZZQVFwRENpRUkxSllCRWdReU1UZ3pHTVFNSU1pY0FTanJob1FDTUxhSGhBSTRXVUFBV0FFS0hnalVsZ0VTQVRjWXlKd0JJSWdZS04yT2hBSXctNU9FQWpoUVFBRllBUklLQ0FFUUFSZ0JLZ0pVU3hnQklnUUlBUkFCS0FJb0F5Z0VNQUURH4XrUbjok0AiAQEqBRIDCgExEj8KFgoKMjAyMi0wMi0wNRIDSUFEGgNFU0IKFgoKMjAyMi0wMi0wNhIDRVNCGgNJQUQSBxIFQ09BQ0gaAhABIAI=']//button[@class='uitk-card-link']") WebElement FlightSelect;


//@FindBy(xpath = "//*[contains(text(), '')]") WebElement error;

public FlightBook(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void FlightsClick() {
	Flights.click();
}
public void RoundClick() {
	Round.click();
}
public void DepClick() {
	Depclick.click();
}
public void DepartureFieldSendKeys(String departure) {
	Departure.sendKeys(departure);
}
/*public void DepartureSelect() {
	System.out.println(DepartureSelect.size());
	  for(int i=0; i<DepartureSelect.size(); i++) {
		  System.out.println(DepartureSelect.get(i).getText());
		  
		  if(DepartureSelect.get(i).getText().contains("Washington (IAD - Washington Dulles Intl.)")){
			  DepartureSelect.get(i).click();
			  break;	
}}}*/

public void Searchclickd() {
	Searchclickd.click();
}

public void ArrClick() {
	Arrclick.click();
}
public void ArrivalFieldSendKeys(String arrival) {
	Arrival.sendKeys(arrival);
}
public void Searchclicka() {
	Searchclicka.click();
}

//public void DepdateFieldSendKeys() {
	//Depdate.click();
	//}
//public void ArrdateFieldSendKeys() {
	//Arrdate.click();	
   // }	

//public void DepdateFieldSendKeys(String depdate) {
	//Depdatefield.sendKeys(depdate);
	//}
//public void ArrdateFieldSendKeys(String arrdate) {
	//Arrdatefield.sendKeys(arrdate);	
//}	

public void SearchBoxClick() {
	Search.click();
}

public void SelectLinkButtonClick() {
	SelectLink.click();
    }

public void FlightSelectClick() {
	FlightSelect.click();
}

}

