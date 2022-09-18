package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainSearchResultPage {
	public static WebElement clickingOnItemFromSearchResult(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[8]/div/div/div/div/div[1]/div/span/a/div"));
	}
}
