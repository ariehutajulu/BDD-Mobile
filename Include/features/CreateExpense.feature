@Feature
Feature: Create
	
	@Scenario
	Scenario: Create
		Given I open the Expense app
		When I tap new expense
		And I enter money
		Then I tap save button