package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPswdPage {
	public static WebElement passwordEnter(WebDriver driver) {
		return driver.findElement(By.id("ap_password"));
	}
	public static WebElement submitButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id,'signInSubmit')]"));
	}
}
	