package com.amazon.verifyproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ProductVerficationPageFactory {
	WebDriver driver;
  
	@FindBy(id="nav-cart")
	WebElement cartIcon;
	
	@FindBy(xpath=".//*[@id='activeCartViewForm']//img[contains(@alt, 'SDSDQUAN-032G-G4A')]")
	WebElement product1;
	
	@FindBy(xpath=".//*[@id='activeCartViewForm']//img[contains(@alt, 'SDCZ36-032G-AFFP')]")
	WebElement product2;
	
	public ProductVerficationPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickCartIcon(){
		cartIcon.click();
	}
	
	/*
	public void searchText(String product){
		searchTextBox.sendKeys(product);
	}*/
	
	public void verifyProduct1(){
		product1.isDisplayed();
	}
	
	public void verifyProduct2(){
		product2.isDisplayed();
	}
	
}
