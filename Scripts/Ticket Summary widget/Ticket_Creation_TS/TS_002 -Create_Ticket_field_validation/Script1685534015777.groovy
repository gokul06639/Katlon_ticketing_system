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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://iotpro.io:8077/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_ThingsBoard PE  Login/input_Username (email)_username-input'), 'gokul.m@sl2.qa.iotpro')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ThingsBoard PE  Login/input_Username (email)_password-input'), 
    '44KZjXygOFJC1THQA8242A==')

WebUI.sendKeys(findTestObject('Object Repository/Page_ThingsBoard PE  Login/input_Username (email)_password-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Home/span_Dashboard groups'))

WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Dashboard group/mat-icon_dashboard'))

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard groups/Page_ThingsBoard PE  Dashboard group/button_dashboard'))

WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Dashboard/button_Tickets'))

WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Dashboard/mat-icon_add'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Page_ThingsBoard PE  Dashboard/div_Entity Type'))

WebUI.verifyElementVisible(findTestObject('Page_ThingsBoard PE  Dashboard/div_Problem Type'))


WebUI.verifyElementVisible(findTestObject('Create_page/Page_ThingsBoard PE  Dashboard/div_Ward No'))

WebUI.verifyElementVisible(findTestObject('Page_ThingsBoard PE  Dashboard/div_Complainer'))

WebUI.verifyElementPresent(findTestObject('Page_ThingsBoard PE  Dashboard/input_Ward No_get_location'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ThingsBoard PE  Dashboard/div_Assignee'), 0)

