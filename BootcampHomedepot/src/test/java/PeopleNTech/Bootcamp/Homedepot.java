package PeopleNTech.Bootcamp;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import PageObjects.Home;
import PageObjects.SignUp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

public class Homedepot extends Utility {
   
	@Test
	@Parameters ({"a","b","c","d"})
	public void VerificationOfText(String a, String b, String c, String d) throws InterruptedException, IOException {
		
		

		
		Home ob=new Home(driver);
		Thread.sleep(2000);
		ob.MyToClick();
		Thread.sleep(2000);
		ob.RegisterToClick();
		Thread.sleep(2000);
		ob.SelectToClick();
		Thread.sleep(2000);
		
		SignUp ob1 = new SignUp(driver);
		ob1.EmailFieldSendKeys(a);
		Thread.sleep(2000);
		ob1.PassFieldSendKeys(b);
		Thread.sleep(2000);
		ob1.ZipFieldSendKeys(c);
		Thread.sleep(2000);
		ob1.PhoneFieldSendKeys(d);
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)");
	
		ob1.CreateButtonClick();
		Thread.sleep(2000);
		
		
		
		/*shots();
		SignInPage it=new SignInPage(driver);
		Thread.sleep(6000);
		it.EmailFieldSendKeys();
		shots();
		Thread.sleep(6000);
		it.ContinueButtonClick();
		shots();
	String errorit=	it.text();
	System.out.println(errorit);
	SoftAssert soft=new SoftAssert();
	
	soft.assertEquals(errorit, "We cannot find an account with that email address");
	System.out.println("This is after assertion");
	soft.assertAll(); */
	}
  
}
