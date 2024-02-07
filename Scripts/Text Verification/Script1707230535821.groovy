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

WebUI.navigateToUrl('https://craferia.com/bedsheets/')

WebUI.verifyElementText(findTestObject('Object Repository/Furnishings Module/Page_Bedsheets Archives - Handicrafts Onlin_ae901f (1)/h1_Bedsheets'), 
    'Bedsheets')

WebUI.getCSSValue(findTestObject('Object Repository/Furnishings Module/Page_Bedsheets Archives - Handicrafts Onlin_ae901f (1)/h1_Bedsheets'), 
    'color')

WebUI.getCSSValue(findTestObject('Object Repository/Furnishings Module/Page_Bedsheets Archives - Handicrafts Onlin_ae901f (1)/h1_Bedsheets'), 
    'font-size')

WebUI.getCSSValue(findTestObject('Object Repository/Furnishings Module/Page_Bedsheets Archives - Handicrafts Onlin_ae901f (1)/h1_Bedsheets'), 
    'font')

WebUI.click(findTestObject('Object Repository/Furnishings Module/Page_Bedsheets Archives - Handicrafts Onlin_ae901f (1)/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Furnishings Module/Page_Bedsheets Archives - Handicrafts Onlin_ae901f/Page_Single Bedsheets Archives - Handicraft_2ded4a/img_Select options_attachment-woocommerce_t_0f4399'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Furnishings Module/Page_Bedsheets Archives - Handicrafts Onlin_ae901f/Page_Single Bedsheets Archives - Handicraft_2ded4a/span_999.00'))

WebUI.closeBrowser()

