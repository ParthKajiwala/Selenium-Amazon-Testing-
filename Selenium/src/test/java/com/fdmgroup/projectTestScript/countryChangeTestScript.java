package com.fdmgroup.projectTestScript;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.pages.amazonCountryChangePage;
import com.fdmgroup.pages.amazonHomePage;
import com.fdmgroup.pages.newCountryPage;
import com.fdmgroup.projectData.projectDataFile;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class countryChangeTestScript {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {
	    driverUtilities = DriverUtilities.getInstance();
	    driver = driverUtilities.getDriver();
	}

	@When("User open the amazon application")
	public void user_open_the_amazon_application() {
		driver.manage().window().maximize();
		driver.get(projectDataFile.amazonHomePageURL);
	}

	@When("User hover on country icon")
	public void user_hover_on_country_icon() throws InterruptedException {
		WebElement countryChange = amazonHomePage.countryChnageIcon(driver);

		Actions actions = new Actions(driver);
		actions.moveToElement(countryChange).perform();
		Thread.sleep(1000);
	}


	@When("User click on change country icon link")
	public void user_click_on_change_country_icon_link() {
		Actions actions = new Actions(driver);
		WebElement submenu = amazonHomePage.changeCountryButton(driver);
		actions.moveToElement(submenu);
		actions.click().build().perform();
	}
	@When("Check we are on country change page and  click on country drop-down")
	public void check_we_are_on_country_change_page_and_click_on_country_drop_down() {
		WebElement countryChangePage = amazonCountryChangePage.countryChangePageVerify(driver);
		System.out.println(countryChangePage.getText());
		assertEquals(projectDataFile.countryChangePageTestString, countryChangePage.getText());
		
		
		amazonCountryChangePage.countryDropDownClick(driver).click();
	}

	@When("User selelcts country")
	public void user_selelcts_country() {
		WebElement countryDropDown = amazonCountryChangePage.countryDropDownMenu(driver);
		Select countrySelected = new Select(countryDropDown);
		amazonCountryChangePage.countrySelection(driver).click();
	}

	@Then("User clicks on Go to WebSite button")
	public void user_clicks_on_go_to_web_site_button() {
		amazonCountryChangePage.countryChangeButtonClick(driver).click();
	}
	@Then("check if user is on changed country website")
	public void check_if_user_is_on_changed_country_website() {
		assertEquals(projectDataFile.changeCountryVerify,newCountryPage.newCountryVerify(driver).getText());
		newCountryPage.backToOriginalTab(driver);
	}

}
