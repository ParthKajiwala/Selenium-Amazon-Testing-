package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productFullDescriptionPage {
	public static WebElement productTitle(WebDriver driver) {
		return	driver.findElement(By.id("productTitle"));
	}
	public static WebElement navigateBackToHomePage(WebDriver driver) {
		return	driver.findElement(By.id("nav-logo-sprites"));
	}
}
