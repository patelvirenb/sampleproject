package com.amazon.verifyproduct;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.amazon.verifyproduct.HomePageFactory;
import com.amazon.verifyproduct.ProductVerficationPageFactory;
import com.amazon.verifyproduct.SignedInProductVerficationPageFactory;

public class VerifyProduct_TestCase_002 {
	
	private WebDriver driver;
	private String baseURL;
	HomePageFactory homePage;
	ProductVerficationPageFactory productVerficationPage;
	SignedInProductVerficationPageFactory signedInProductVerficationPage;
	
	@BeforeMethod
	 public void beforeMethodd() {
		  driver = new FirefoxDriver();
		  baseURL = "http://www.amazon.com/gp/sign-in.html";
		  
		  homePage = new HomePageFactory(driver);
		  productVerficationPage = new ProductVerficationPageFactory(driver);
		  signedInProductVerficationPage = new SignedInProductVerficationPageFactory(driver);
 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.get(baseURL);
	  }

  @Test
  public void testMethod() {
	  
	  signedInProductVerficationPage.clickemailTextBox();
	  signedInProductVerficationPage.emailText();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  signedInProductVerficationPage.clickpasswordTextBox();
	  signedInProductVerficationPage.passwordText();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  signedInProductVerficationPage.submitSignIn();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  signedInProductVerficationPage.landOnConsumerHomePage();
	  productVerficationPage.clickCartIcon();
	  productVerficationPage.verifyProduct1();
	  productVerficationPage.verifyProduct2();
	 
	  /*String currentWindow = driver.getWindowHandle();
	  Set<String> windows = driver.getWindowHandles();
	  
	  for (String handle: windows){
		  if(!handle.equals(currentWindow)){
			  driver.switchTo().window(handle);
		  }
	  }
	  
	  homePage.clickSearchTextBox();
	  homePage.searchText("flash drive");
	  homePage.clickSearchIcon();
	  productVerficationPage.verifyProduct1();
	  productVerficationPage.verifyProduct2();*/
  }
 
  @AfterMethod
  public void quitTest(){
  	 driver.quit();
  }
}

