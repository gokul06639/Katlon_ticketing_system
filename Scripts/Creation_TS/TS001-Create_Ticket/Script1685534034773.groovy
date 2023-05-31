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

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/div_Entity Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard groups/Page_ThingsBoard PE  Dashboard group/Page_ThingsBoard PE  Dashboard/span_gw'))

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/div_Problem Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/span_Day time burning'))

WebUI.click(findTestObject('Create_page/Page_ThingsBoard PE  Dashboard/div_Ward No'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_page/Page_ThingsBoard PE  Dashboard/span_SLM1-1'))

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/div_Complainer'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/span_Councillor'))

//WebUI.(findTestObject('Page_ThingsBoard PE  Dashboard/div_Location'))
Thread.sleep(1000)

WebUI.setText(findTestObject('Page_ThingsBoard PE  Dashboard/input_Ward No_get_location'), 'Saravanampatti')

//WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/input_Entity Type_mat-input-47'))
WebUI.setText(findTestObject('Page_ThingsBoard PE  Dashboard/input_Entity Type_mat-input-32'), '5632563325')

//WebUI.Settext(findTestObject('Page_ThingsBoard PE  Dashboard/input_Complainer_mat-input-49'))
WebUI.setText(findTestObject('Page_ThingsBoard PE  Dashboard/input_Complainer_mat-input-34'), '9658745555')

WebUI.click(findTestObject('Page_ThingsBoard PE  Dashboard/div_Assignee'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_ThingsBoard PE  Dashboard/textarea_Created On_remarks'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_ThingsBoard PE  Dashboard/button_Create'))

WebUI.acceptAlert()

