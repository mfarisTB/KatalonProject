package orangehrm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class JobTitle {

	@Keyword(keywordObject = 'Add Job Title')
	def addJobTitle(jobTitle) {
		//input values   jobTitle = JB1
		String resultJobTitle = ""

		if (jobTitle == "JB1") {
			resultJobTitle = "Pentabir"
		}
		else if (jobTitle == "JB2") {
			resultJobTitle = "Pembantu Pentadbir"
		}
		else {
			resultJobTitle = "Setiausaha"
		}

		return resultJobTitle   //output values  resultJobTitle = Pentadbir
	}

	@Keyword(keywordObject = 'Delete Job Title')
	def deleteJobTitle(jobTitle) {  //input values - jobTitle = "Admin1,admin12"
		String[] lotsOfNames = jobTitle.split(",")

		for (title in lotsOfNames) {
			WebUI.click(findTestObject('Object Repository/OrangeHRM-JobTitles/OrangeHRM-DeleteJobTitles/Page_OrangeHRM/div_Checkbox_oxd-table-cell oxd-padding-cell',
					[('jobTitle') : title]))
		}
	}
}
