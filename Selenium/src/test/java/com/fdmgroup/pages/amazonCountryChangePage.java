package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.projectData.projectDataFile;

public class amazonCountryChangePage {
	public static WebElement countryChangePageVerify(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@class='a-spacing-extra-large']"));
	}
		public static WebElement countryDropDownClick(WebDriver driver) {
			return 	driver.findElement(By.xpath("//*[@id='a-page']//span[@class='a-dropdown-container']"));
		}
		public static WebElement countryDropDownMenu(WebDriver driver) {
			return	driver.findElement(By.xpath("//select[@id='icp-dropdown']"));
		}
		public static WebElement countrySelection(WebDriver driver) {
			return driver.findElement(By.partialLinkText(projectDataFile.countryName));
		}
		public static WebElement countryChangeButtonClick(WebDriver driver) {
			return driver.findElement(By.className("a-button-input"));
		}
}
