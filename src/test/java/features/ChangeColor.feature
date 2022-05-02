@Feature
Feature: User should be able to change background color


@Scenario1
Scenario: User should be able to change background color to Skyblue
	Given User is on Techfios101 page
	When User clicks on "Set SkyBlue Background" button
	Then The background should be set to Skyblue 
	
	
@Scenario2
Scenario: User should be able to change background color to White
	Given User is on Techfios101 page
	When User clicks on "Set White Background" button
	Then The background should be set to White 
	
	