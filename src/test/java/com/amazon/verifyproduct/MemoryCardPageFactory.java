package com.amazon.verifyproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MemoryCardPageFactory {
	WebDriver driver;
  
	@FindBy(xpath = ".//*[@id='resultsCol']//a[contains(@title,'SDSDQUAN-032G-G4A')]")
	WebElement memoryCard;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCardButton;
	
	public MemoryCardPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMemoryCard(){
		memoryCard.click();
	}
	
	public void submitAddToCartButton(){
		addToCardButton.submit();
	}
	/*
	public void searchText(String product){
		searchTextBox.sendKeys(product);
	}
	
	public void clickSearchIcon(){
		searchIcon.submit();
	}*/
	
	
}
