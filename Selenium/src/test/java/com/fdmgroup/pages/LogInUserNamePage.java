package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInUserNamePage {
	public static WebElement verifySignInuserNamePage(WebDriver driver) {
		return driver.findElement(By.tagName("h1"));
	}
	
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("ap_email"));
	}
	public static WebElement continueButtonUserName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id,'continue')]//input[contains(@id,'continue')]"));
	}
}
