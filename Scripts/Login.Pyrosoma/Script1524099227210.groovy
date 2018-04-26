import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Page_Pyrosoma/button_Sign In'))

WebUI.setText(findTestObject('Page_Sign in to your account/input_loginfmt'), findTestData('TestDataUsers').getValue(2, 1))

WebUI.click(findTestObject('Page_Sign in to your account/input_idSIButton9'))

WebUI.setText(findTestObject('Page_Sign in to your account/input_passwd'), findTestData('TestDataUsers').getValue(3, 1))

WebUI.click(findTestObject('Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('Page_Pyrosoma/h4_Dashboard'))

WebUI.click(findTestObject('Page_Pyrosoma/div_Selamat Datang'))

result = WebUI.getText(findTestObject('Page_Pyrosoma/div_Selamat Datang'))

not_run: println(result)

