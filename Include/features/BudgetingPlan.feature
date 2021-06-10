@Feature
Feature: Budgeting
	
	@Scenario
	Scenario: Budgeting
		Given I click garis
		When I choose budgeting
		And I enter money plan
		Then I tap save button plan