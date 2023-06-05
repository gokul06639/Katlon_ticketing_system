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

'Open the browser'
WebUI.openBrowser('')

'Navigate to the IOTPRO URL'
WebUI.navigateToUrl('http://iotpro.io:8077/login')

'Maximize the window'
WebUI.maximizeWindow()

'Enter the vaild username'
WebUI.setText(findTestObject('Object Repository/Page_ThingsBoard PE  Login/input_Username (email)_username-input'), Username)

'Enter the vaild password'
WebUI.setText(findTestObject('Object Repository/Page_ThingsBoard PE  Login/input_Username (email)_password-input'), Password)

'Select the Login button'
WebUI.sendKeys(findTestObject('Object Repository/Page_ThingsBoard PE  Login/input_Username (email)_password-input'), Keys.chord(
        Keys.ENTER))

'Select the dashboard groups'
WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Home/span_Dashboard groups'))

'Select the Production development'
WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Dashboard group/mat-icon_dashboard'))

'Select the Open button in O&M main Dashboard Live'
WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard groups/Page_ThingsBoard PE  Dashboard group/button_dashboard'))

'Click on Tickets button in O&M main Dashboard Live'
WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Dashboard/button_Tickets'))

'Select the "+" icon'
WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Dashboard/mat-icon_add'))

WebUI.delay(2)

'Verify the Customer name'
WebUI.verifyElementText(findTestObject('Page_ThingsBoard PE  Dashboard/select_Salem'), 'Salem')

'Verify the status'
WebUI.verifyTextPresent('Open', false, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Salam Customer text'
WebUI.verifyElementText(findTestObject('Page_ThingsBoard PE  Dashboard/select_Salem'), 'Salem')

'Take a Screenshot in create page'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/mat-icon_close'))

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/mat-icon_more_vert'))

WebUI.click(findTestObject('Page_ThingsBoard PE  Home/button_exit_to_appLogout'))

WebUI.closeBrowser()

WebUI.acceptAlert()

