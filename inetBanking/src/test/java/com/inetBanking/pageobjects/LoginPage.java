package com.inetBanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	LoginPage(WebDriver rdriver){
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(name="ud")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassWord;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;

	
	public void setusernmae(String uname) {
		 txtUserName.sendKeys(uname);
	
		
	}
	public void setpassword(String pwd) {
	txtPassWord.sendKeys(pwd);
	}
public void click() {
	btnLogin.click();
}
}
