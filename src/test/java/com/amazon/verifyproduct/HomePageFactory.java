package com.amazon.verifyproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class HomePageFactory {
	WebDriver driver;
  
	@FindBy(id="twotabsearchtextbox")
	WebElement searchTextBox;
	
	@FindBy(id="nav-search-submit-text")
	WebElement searchIcon;
	
	@FindBy(id="nav-flyout-ya-signin")
	WebElement logIn;
	//WebElement logIn = driver.findElement(By.id("nav-link-yourAccount"));
	
	//@FindBy(className="nav-line-3")
	//WebElement logInButton = driver.findElement(By.className("nav-line-3"));
	
	public HomePageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSearchTextBox(){
		searchTextBox.click();
	}
	
	public void searchText(String product){
		searchTextBox.clear();
		searchTextBox.sendKeys(product);
	}
	
	public void clickSearchIcon(){
		searchIcon.submit();
	}
	
	public void clickLogIn(){
		logIn.click();
	}
	//Actions action = new Actions(driver);
	//action.moveToElement(logIn).moveToElement(logInButton).click().build().perform();
	//action.moveToElement(mainElement).perform();
}
