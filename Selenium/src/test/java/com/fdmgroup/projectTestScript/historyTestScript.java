package com.fdmgroup.projectTestScript;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.LogInUserNamePage;
import com.fdmgroup.pages.LoginPswdPage;
import com.fdmgroup.pages.amazonHomePage;
import com.fdmgroup.pages.mainSearchResultPage;
import com.fdmgroup.pages.productFullDescriptionPage;
import com.fdmgroup.pages.productViewHistoryPage;
import com.fdmgroup.projectData.projectDataFile;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class historyTestScript {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	private String productName;
	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}
	@Given("User open the amazon application and clicked on signin button and check if you went on that page or not")
	public void user_open_the_amazon_application_and_clicked_on_signin_button_and_check_if_you_went_on_that_page_or_not() {
		driver.manage().window().maximize();
		driver.get(projectDataFile.amazonHomePageURL);
		amazonHomePage.signInButton(driver).click();
		assertEquals(projectDataFile.singInPageVerifyText,LogInUserNamePage.verifySignInuserNamePage(driver).getText());
	}

	@When("User enters username and click on next button")
	public void user_enters_username_and_click_on_next_button() {
		LogInUserNamePage.userName(driver).sendKeys(projectDataFile.userId);
		LogInUserNamePage.continueButtonUserName(driver).click();
	}

	@When("User enters password and Click on submitt button")
	public void user_enters_password_and_click_on_submitt_button() {
		LoginPswdPage.passwordEnter(driver).sendKeys(projectDataFile.password);
		LoginPswdPage.submitButton(driver).click();
	}

	@Then("Check if user is on home page signed with account")
	public void check_if_user_is_on_home_page_signed_with_account() {
		assertEquals(projectDataFile.signedInUserVerifyText,amazonHomePage.signedUserName(driver).getText());
	}
	@Then("User type in the search box and click on the search button")
	public void user_type_in_the_search_box_and_click_on_the_search_button() throws InterruptedException {
		amazonHomePage.mainSearchBox(driver).sendKeys(projectDataFile.searchItem);
		amazonHomePage.mainSearchButton(driver).click();
//		Thread.sleep(2000);
	}

	@Then("User clicks on some product to view details and then goes back to home page")
	public void user_clicks_on_some_product_to_view_details_and_then_goes_back_to_home_page() throws InterruptedException {
		mainSearchResultPage.clickingOnItemFromSearchResult(driver).click();
		productName=productFullDescriptionPage.productTitle(driver).getText();
		System.out.println(productName);
		productFullDescriptionPage.navigateBackToHomePage(driver).click();
		Thread.sleep(2000);
	}

	@Then("User scroll down in the home page and clicks on view history link")
	public void user_scroll_down_in_the_home_page_and_clicks_on_view_history_link() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5100)", "");
		Thread.sleep(2000);
		amazonHomePage.browserHistoryLink(driver).click();
	}

	@Then("check if previosly viewed product is there or not")
	public void check_if_previosly_viewed_product_is_there_or_not() {
		assertEquals(productName,productViewHistoryPage.recentProductName(driver).getText());
		productViewHistoryPage.navigateBackToHomePage(driver).click();
	}

}
