package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonHomePage {
	public static WebElement signInButton(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Sign in"));
	}
	public static WebElement signedUserName(WebDriver driver) {
		return	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	}
	public static WebElement countryChnageIcon(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='icp-nav-flyout']"));
	}
	public static WebElement changeCountryButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='nav-flyout-icp']//a[@id='icp-flyout-mkt-change']"));
	}
	public static WebElement mainSearchBox(WebDriver driver) {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}
	public static WebElement mainSearchButton(WebDriver driver) {
		return driver.findElement(By.id("nav-search-submit-button"));
	}
	public static WebElement browserHistoryLink(WebDriver driver) {
		return driver.findElement(By.partialLinkText("View or edit your browsing history"));
	}
	
}
