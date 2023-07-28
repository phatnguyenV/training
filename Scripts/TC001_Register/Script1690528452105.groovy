import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def email = new String[3]
email[0] = 'phatnt@firegroup.io'
email[1] = 'phatnt+1@firegroup.io'
email.putAt(2, 'phatnt+2@firegroup.io')

def userMap = [
	customer_1:[first_name: "Phat", last_name: "Nguyen Tan", email: "test@gmail.com"],
	customer_2:[first_name: "Long", last_name: "Le Tan", email: "long@gmail.com"],
	customer_3:[first_name: "Minh", last_name: "Trinh Hoang", email: "minh@gmail.com"]
	]

	
WebUI.openBrowser(url)
WebUI.waitForElementPresent(input_first_name, 5)
WebUI.sendKeys(input_first_name, userMap.customer_1.first_name)
WebUI.sendKeys(input_last_name, userMap.customer_1.last_name)
enterEmail(input_email, email)
WebUI.setEncryptedText(input_password, '4aUHZLRHJF4=')
WebUI.click(btn_create)
WebUI.delay(3)



WebUI.closeBrowser()

def enterEmail(def input_email, def email) {
	for(def i = 0; i<3; i++) {
		WebUI.setText(input_email, email[i])
	}
}