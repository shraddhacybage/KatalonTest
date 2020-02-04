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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.automationtesting.in/')

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Index/img_Skip Sign In_enterimg'))

WebUI.setText(findTestObject('Object Repository/DemoTest/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7'),
	'shraddha')

WebUI.setText(findTestObject('Object Repository/DemoTest/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7_1'),
	'chandrakar')

WebUI.setText(findTestObject('Object Repository/DemoTest/Page_Register/textarea_Address_form-control ng-untouched _b1abf7'),
	'keshav nagar')

WebUI.setText(findTestObject('Object Repository/DemoTest/Page_Register/input_Email address_form-control ng-untouch_b58296'),
	'shraddhach@sybage.com')

WebUI.setText(findTestObject('Object Repository/DemoTest/Page_Register/input_Phone_form-control ng-untouched ng-in_c98163'),
	'9876543219')

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/input_FeMale_radiooptions'))

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/input_Cricket_checkbox2'))

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/a_Hindi'))

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/div_(adsbygoogle  windowadsbygoogle  )push(_930220'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoTest/Page_Register/select_Select Skills                       _fcf818'),
	'Python', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoTest/Page_Register/select_Select Country                      _cc64b6'),
	'India', true)

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/span_Select Country _select2-selection sele_4ca78e'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoTest/Page_Register/select_year                             191_0e56cb'),
	'1993', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoTest/Page_Register/select_Month                               _920c21'),
	'October', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoTest/Page_Register/select_Day                                 _6d848d'),
	'13', true)

WebUI.setEncryptedText(findTestObject('Object Repository/DemoTest/Page_Register/input_Password_firstpassword'), 'p4y+y39Ir5Ov+WEY7KiS/A==')

WebUI.setEncryptedText(findTestObject('Object Repository/DemoTest/Page_Register/input_Confirm Password_secondpassword'),
	'p4y+y39Ir5Ov+WEY7KiS/A==')

//WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/button_Submit'))
//Manage mouseover
mouseover('Object Repository/DemoTest/Page_Register/a_SwitchTo')

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Web Table/a_Alerts'))

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Alerts/a_Alert with Textbox'))

//Manage Alert
WebUI.click(findTestObject('Object Repository/DemoTest/Page_Alerts/button_click the button to demonstrate the prompt box'))

WebUI.waitForAlert(5)

WebUI.setAlertText('hello')

//manage tabbed window
mouseover('Object Repository/DemoTest/Page_Register/a_SwitchTo')

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/a_Windows'))

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Frames  windows/button_click'))

WebUI.waitForPageLoad(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

// manage seperate window
WebUI.refresh()

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Frames  windows/a_Open New Seperate Windows'))

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Frames  windows/button_click_1'))

WebUI.maximizeWindow()

WebUI.waitForPageLoad(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

//Manage frames
mouseover('Object Repository/DemoTest/Page_Register/a_SwitchTo')

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Frames/a_Frames'))

WebUI.switchToFrame(findTestObject('Object Repository/DemoTest/Page_Frames/a_Single Iframe'), 5)

WebUI.setText(findTestObject('Object Repository/DemoTest/Page_Frames/single Iframe input field'), 'shraddha')

WebUI.switchToDefaultContent()

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

//File upload
mouseover('Object Repository/DemoTest/Page_Register/a_More')

WebUI.click(findTestObject('Object Repository/DemoTest/Page_Register/a_File Upload'))

WebUI.uploadFile(findTestObject('Object Repository/DemoTest/Page_File input - Multi select/input_Browse _input4'), 'D:\\images.jpg')
WebUI.takeScreenshot()

def mouseover(Object ob) {
	WebUI.mouseOver(findTestObject(ob))
}

