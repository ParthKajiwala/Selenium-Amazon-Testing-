package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productViewHistoryPage {
	public static WebElement recentProductName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='p13n-asin-index-0']/div/a[2]/span/div"));
	}
	public static WebElement navigateBackToHomePage(WebDriver driver) {
		return	driver.findElement(By.id("nav-logo-sprites"));
	}
}
