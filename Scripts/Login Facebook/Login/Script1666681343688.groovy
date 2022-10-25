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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Login/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    'safiraannisa2021@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    '4QNlhDAY/HOt5EIxO9UDGw==')

WebUI.click(findTestObject('Object Repository/Login/Page_Facebook  log in or sign up/button_Log in'))

WebUI.click(findTestObject('Object Repository/Login/Page_Log in to Facebook/div_Log inForgotten password'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_email'), 
    '085712794616')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    '4QNlhDAY/HOt5EIxO9UDGw==')

WebUI.click(findTestObject('Object Repository/Login/Page_Log in to Facebook/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_email'), 
    '082135301557')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    '4QNlhDAY/HOt5EIxO9UDGw==')

WebUI.click(findTestObject('Object Repository/Login/Page_Log in to Facebook/button_Log in'))

WebUI.click(findTestObject('Object Repository/Login/Page_Log in to Facebook/div_Log inForgotten password'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_email'), 
    'safirabela2018@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    '4QNlhDAY/HOt5EIxO9UDGw==')

WebUI.click(findTestObject('Object Repository/Login/Page_Log in to Facebook/button_Log in'))

WebUI.click(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    '4QNlhDAY/HNCZ2I644WBPw==')

WebUI.click(findTestObject('Object Repository/Login/Page_Log in to Facebook/button_Log in'))

WebUI.closeBrowser()
