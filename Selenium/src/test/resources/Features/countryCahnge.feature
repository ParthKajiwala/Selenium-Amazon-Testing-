

Feature: Feature to test the country change
Scenario: User Should be able to open website of selected country 
	Given User launches the browser
	When User open the amazon application
	And User hover on country icon
	And User click on change country icon link
	And Check we are on country change page and  click on country drop-down 
	And User selelcts country
	Then User clicks on Go to WebSite button
	Then check if user is on changed country website
