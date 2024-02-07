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

WebUI.navigateToUrl('https://craferia.com/bamboo-chair/')

WebUI.selectOptionByValue(findTestObject('Object Repository/All Categories Module/Page_Bamboo Chair, Cane Bamboo Chair, Armre_78e336/select_Sort by popularitySort by average ra_747407'), 
    'popularity', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/All Categories Module/Page_Bamboo Chair, Cane Bamboo Chair, Armre_78e336/select_Sort by popularitySort by average ra_747407'), 
    'rating', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/All Categories Module/Page_Bamboo Chair, Cane Bamboo Chair, Armre_78e336/select_Sort by popularitySort by average ra_747407'), 
    'date', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/All Categories Module/Page_Bamboo Chair, Cane Bamboo Chair, Armre_78e336/select_Sort by popularitySort by average ra_747407'), 
    'price', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/All Categories Module/Page_Bamboo Chair, Cane Bamboo Chair, Armre_78e336/select_Sort by popularitySort by average ra_747407'), 
    'price-desc', true)

WebUI.closeBrowser()

