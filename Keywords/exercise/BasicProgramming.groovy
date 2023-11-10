package exercise

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

public class BasicProgramming {

	@Keyword(keywordObject = 'Temperature')
	def checkTemperature() {
		//Groovy
		int temperature = 31
		String statusMessage = " "

		if (temperature > 30) {
			statusMessage = "It's hot!"
			println statusMessage
		}
		else
		{
			statusMessage = "It's cold!"
			println statusMessage
		}
	}

	@Keyword(keywordObject = 'Temp')
	public void checkTemp() { //Java
		int temperature = 31
		String statusMessage = " "

		if (temperature > 30) {
			statusMessage = "It's hot!"
			println statusMessage
		}
		else
		{
			statusMessage = "It's cold!"
			println statusMessage
		}
	}

	@Keyword(keywordObject = 'Day of Week')
	def dayOfWeek() { //Groovy
		int dayOfWeek = 1
		String dayName = "Monday"

		switch (dayOfWeek) //expression
		{
			case 1:
				dayName = "Monday"
				println dayName
				break
			case 2:
				dayName = "Tuesday"
				println dayName
				break
			default:
				dayName = "Not in range"
				println dayName
				break
		}
	}

	@Keyword(keywordObject = 'Loop One To Ten')
	def loopOneToTen() { //Groovy
		for (int i = 1; i <= 10; i++) {
			println i
		}
	}

	@Keyword(keywordObject = 'Loop Names')
	def loopNames() { //Groovy

		String[] lotsOfNames = ["Name1", "Name2", "Name3"]

		/*for (name in lotsOfNames) {
		 println name
		 }*/

		for (String name : lotsOfNames) {
			println name
		}
	}
}
