package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLogIn {
public DWSLogIn (WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public @FindBy(css = "input[autofocus='autofocus']")
WebElement username;
public @FindBy(name = "Password")
WebElement password;
public @FindBy(css = "input[class='button-1 login-button']")
WebElement login_bt;

public void username(String value) {
	username.sendKeys(value);
}
public void password(String value) {
	password.sendKeys(value);
}
public void loginBt(){
	login_bt.click();
}
}
