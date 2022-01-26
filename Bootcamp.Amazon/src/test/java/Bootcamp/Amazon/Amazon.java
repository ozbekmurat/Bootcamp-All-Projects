package Bootcamp.Amazon;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Utility;
import PageObject.AddToCart;
import PageObject.Search;

public class Amazon extends Utility {
   
	@Test
	
	public void VerificationOfText() throws InterruptedException, IOException {
		
		Search ob=new Search(driver);
		Thread.sleep(2000);
		ob.SearchFieldSendKeys();
		Thread.sleep(2000);
		ob.SearchsubmitToClick();
		Thread.sleep(2000);
		
		
		AddToCart ob1 = new AddToCart(driver);
		Thread.sleep(2000);
		ob1.SearchproductToClick();
		Thread.sleep(2000);
		ob1.AddToCartClick();
		Thread.sleep(2000);
		//ob1.ProccedClick();		
		//Thread.sleep(2000);
		
		
		/*SignUp ob1 = new SignUp(driver);
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
		
	
		
		ob1.RobotBoxClick();
		Thread.sleep(2000);
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
