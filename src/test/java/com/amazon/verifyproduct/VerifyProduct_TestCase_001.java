package com.amazon.verifyproduct;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.amazon.verifyproduct.HomePageFactory;
import com.amazon.verifyproduct.USBPageFactory;
import com.amazon.verifyproduct.MemoryCardPageFactory;
import com.amazon.verifyproduct.ProductVerficationPageFactory;

public class VerifyProduct_TestCase_001 {
	
	private WebDriver driver;
	private String baseURL;
	HomePageFactory homePage;
	USBPageFactory usbDrivePage;
	MemoryCardPageFactory memoryCardPage;
	ProductVerficationPageFactory productVerficationPage;
	
	@BeforeMethod
	 public void beforeMethod() {
		  driver = new FirefoxDriver();
		  baseURL = "http://www.amazon.com/";
		  
		  homePage = new HomePageFactory(driver);
		  usbDrivePage = new USBPageFactory(driver);
		  memoryCardPage = new MemoryCardPageFactory(driver);
		  productVerficationPage = new ProductVerficationPageFactory(driver);
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get(baseURL);
	  }
	
	
  @Test
  public void testMethod() {
	  homePage.clickSearchTextBox();
	  homePage.searchText("flash drive");
	  homePage.clickSearchIcon();
	  usbDrivePage.clickusbDrive();
	  usbDrivePage.submitAddToCartButton();
	  homePage.clickSearchTextBox();
	  homePage.searchText("memory card");
	  homePage.clickSearchIcon();
	  //usbDrivePage.clickusbDrive();
	  //usbDrivePage.submitAddToCartButton();
	  memoryCardPage.clickMemoryCard();
	  memoryCardPage.submitAddToCartButton();
	  productVerficationPage.clickCartIcon();
	  productVerficationPage.verifyProduct1();
	  productVerficationPage.verifyProduct2();
	  
  }
  
  @AfterMethod
  public void quitTest(){
  	 driver.quit();
  }
  
}
