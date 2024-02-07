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


RunConfiguration.setExecutionSettingFile('C:\\Users\\chanti\\AppData\\Local\\Temp\\Katalon\\20240207_093127\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://craferia.com/mudha/\')\n\nWebUI.verifyElementText(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia (1)/div_Mudha furniture is available in a varie_b913fa\'), \n    \'Mudha furniture is available in a variety of styles and designs, making it a great option for any home or office. There is something special and unique about mudha furniture that makes it a great choice for both indoor and outdoor use.\\nIt is a popular choice for indoor and outdoor use because of its durability and comfort. Mudha chairs, Mudha tables, and Mudha stools are all designed to provide a comfortable sitting experience.\')\n\nWebUI.getCSSValue(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia (1)/div_Mudha furniture is available in a varie_b913fa\'), \n    \'color\')\n\nWebUI.getCSSValue(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia (1)/div_Mudha furniture is available in a varie_b913fa\'), \n    \'color\')\n\nWebUI.getCSSValue(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia (1)/div_Mudha furniture is available in a varie_b913fa\'), \n    \'color\')\n\nWebUI.verifyElementVisible(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia (1)/img\'))\n\nWebUI.getCSSValue(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia (1)/img\'), \'color\')\n\nWebUI.verifyElementVisible(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia/img\'))\n\nWebUI.verifyElementVisible(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia/img_1\'))\n\nWebUI.verifyElementText(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia/h2_Mudha Stools (3)\'), \n    \'Mudha Stools (3)\')\n\nWebUI.verifyElementText(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia/h2_Mudha chairs (25)\'), \n    \'Mudha chairs (25)\')\n\nWebUI.verifyElementText(findTestObject(\'Object Repository/Page_Mudda, Mudha Set  Furniture by Craferia/h2_Mudha Table (1)\'), \n    \'Mudha Table (1)\')\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

