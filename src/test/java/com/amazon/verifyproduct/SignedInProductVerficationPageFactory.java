package com.amazon.verifyproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class SignedInProductVerficationPageFactory {
	WebDriver driver;
  
	@FindBy(id="ap_email")
	WebElement emailTextBox;
	
	@FindBy(id="ap_password")
	WebElement passwordTextBox;
	
	@FindBy(id="signInSubmit")
	WebElement signInButton;
	
	@FindBy(xpath=".//*[@id='a-page']//i[contains(@class,'a-icon a-icon-logo')]")
	WebElement consumerHomePage;
	public SignedInProductVerficationPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickemailTextBox(){
		emailTextBox.click();
		emailTextBox.clear();
	}
	
	public void emailText(){
		emailTextBox.sendKeys("patel.viren.b1@gmail.com");
	
	
		/*JavascriptExecutor eamilvalue = ((JavascriptExecutor)driver);
		eamilvalue.executeScript(email, emailTextBox);*/
	}
	
	
	public void clickpasswordTextBox(){
		passwordTextBox.click();
		passwordTextBox.clear();
	}
	
	public void passwordText(){
		passwordTextBox.sendKeys("Test1234!");
		/*JavascriptExecutor passwordvalue = ((JavascriptExecutor)driver);
		passwordvalue.executeScript(password, passwordTextBox);*/
	}
	
	public void submitSignIn(){
		signInButton.submit();
	}
	
	public void landOnConsumerHomePage(){
		consumerHomePage.click();
	}

}
