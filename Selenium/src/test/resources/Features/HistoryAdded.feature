Feature: Recently looked Item Should be present in the history
Scenario: User Should be able to look items that was previously viewed 
	Given User launches the browser
	When User open the amazon application and clicked on signin button and check if you went on that page or not
	When User enters username and click on next button
	And User enters password and Click on submitt button
	Then Check if user is on home page signed with account 
	And User type in the search box and click on the search button
	And User clicks on some product to view details and then goes back to home page
	And User scroll down in the home page and clicks on view history link
	Then check if previosly viewed product is there or not 