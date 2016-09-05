package com.amazon.verifyproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class USBPageFactory {
	WebDriver driver;
  
	@FindBy(xpath = ".//*[@id='s-results-list-atf']//h2[text()='SanDisk Cruzer CZ36 32GB USB 2.0 Flash Drive, Frustration-Free Packaging- SDCZ36-032G-AFFP']")
	WebElement usbDrive;
	
	@FindBy(id="submit.add-to-cart")
	WebElement addToCardButton;
	
	public USBPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickusbDrive(){
		usbDrive.click();
	}
	
	public void submitAddToCartButton(){
		addToCardButton.submit();
	}
	
	/*public void searchText(String product){
		searchTextBox.sendKeys(product);
	}
	
	public void clickSearchIcon(){
		searchIcon.submit();
	}*/
	
	
}
