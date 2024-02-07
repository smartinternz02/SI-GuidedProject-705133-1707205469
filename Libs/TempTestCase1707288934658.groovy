import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\chanti\\AppData\\Local\\Temp\\Katalon\\20240207_122534\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://craferia.com/\')\n\nWebUI.setText(findTestObject(\'Object Repository/Global search/Page_Handicrafts Online, Indian Handicraft _c8b31e/input_Search for_s\'), \n    \'cane furniture\')\n\nWebUI.sendKeys(findTestObject(\'Object Repository/Global search/Page_Handicrafts Online, Indian Handicraft _c8b31e/input_Search for_s\'), \n    Keys.chord(Keys.ENTER))\n\nWebUI.setText(findTestObject(\'Object Repository/Global search/Page_You searched for cane furniture - Hand_ea2f43/input_Search for_s\'), \n    \'cane furniture chairs\')\n\nWebUI.sendKeys(findTestObject(\'Object Repository/Global search/Page_You searched for cane furniture - Hand_ea2f43/input_Search for_s\'), \n    Keys.chord(Keys.ENTER))\n\nWebUI.setText(findTestObject(\'Object Repository/Global search/Page_You searched for cane furniture chairs_93a051/input_Search for_s\'), \n    \'sticks\')\n\nWebUI.sendKeys(findTestObject(\'Object Repository/Global search/Page_You searched for cane furniture chairs_93a051/input_Search for_s\'), \n    Keys.chord(Keys.ENTER))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

