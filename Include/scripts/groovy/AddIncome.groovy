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



class AddIncome {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I click garis june")
	def I_click_garis_june() {
		Mobile.tap(findTestObject('android.widget.ImageButton (1)'), 0)

		Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - - June 2021'), 0)
	}

	@When("I choose add and new income")
	def I_choose_add_and_new_income() {
		Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (3)'), 0)

		Mobile.tap(findTestObject('Object Repository/android.widget.ToggleButton - EXPENSE'), 0)
	}

	@And("I enter money income")
	def I_enter_money_income() {

		Mobile.setText(findTestObject('android.widget.EditText - Description'), 'Gajian', 0)

		Mobile.setText(findTestObject('android.widget.EditText - Price'), '400000', 0)
	}

	@Then("I tap save button income")
	def I_tap_save_button_income() {

		Mobile.tap(findTestObject('android.widget.Button - SAVE'), 0)

		Mobile.closeApplication()
	}
}