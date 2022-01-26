package PeopleNTech.Bootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\eclipse-boothcamp\\BoothcampHomedepot\\src\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	
	}

}
