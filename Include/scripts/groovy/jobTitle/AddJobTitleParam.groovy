package jobTitle
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



class AddJobTitleParam {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User go to login page") //Annotation - identity sesebuah function
	def go_to_login_page() { //function - mengandungi data type, nama function, parameter
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

		WebUI.setText(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/input_Username_username'), 'Admin')

		WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

		WebUI.click(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/button_Login'))						//start masukkan arahan (coding)
	}

	@When("User go to Add Job Title page")
	def go_to_add_job_title_page() {
		WebUI.click(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/span_Admin'))
		
		WebUI.click(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/span_Job'))
		
		WebUI.click(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/a_Job Titles'))
	}
	
	@And("Start masukkan job title details, such as (.*), (.*) and (.*)") // (.*) refer to each variables
	def start_masuk_job_title(String jobTitle, String jobDescription, String note) {
		WebUI.click(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/button_Add'))
		
		WebUI.setText(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'),
			jobTitle)
		
		WebUI.setText(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-t_4f7bba'),
			jobDescription)
		
		WebUI.setText(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'),
			note)
	}

	@Then("User press save button")
	def press_save_button() {
		WebUI.click(findTestObject('Object Repository/OrangeHRM-JobTitles/Page_OrangeHRM/button_Save'))
	}
}