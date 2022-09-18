package com.fdmgroup.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newCountryPage {
	public static WebElement newCountryVerify(WebDriver driver) {
		Set<String> windowHandles= driver.getWindowHandles();
		List<String>windowhandleList=new ArrayList<>(windowHandles);
		driver.switchTo().window(windowhandleList.get(1));
		return driver.findElement(By.className("nav-logo-locale"));

	}
	public static WebElement backToOriginalTab(WebDriver driver) {
		Set<String> windowHandles= driver.getWindowHandles();
		List<String>windowhandleList=new ArrayList<>(windowHandles);
		driver.switchTo().window(windowhandleList.get(0));
		return driver.findElement(By.id("nav-logo-sprites"));
	}
}
