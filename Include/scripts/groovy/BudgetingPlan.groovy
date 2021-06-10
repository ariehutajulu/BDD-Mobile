import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class BudgetingPlan {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I click garis")
	def I_click_garis() {
		Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (1)'), 0)
	}

	@When("I choose budgeting")
	def I_choose_budgeting() {
		Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Budgeting Plan'), 0)

		Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (2)'), 0)
	}

	@And("I enter money plan")
	def I_enter_money_plan() {

		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Description (1)'), 'Pengeluaran maksimal', 0)

		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Estimated Cost (can be blank)'), '2000000', 0)
	}

	@Then("I tap save button plan")
	def I_tap_save_button_plan() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - SAVE (1)'), 0)
	}
}