@Feature
Feature: New Income
	
	@Scenario
	Scenario: New Income
		Given I click garis june
		When I choose add and new income
		And I enter money income
		Then I tap save button income