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

WebUI.navigateToUrl('https://craferia.com/cane-furniture/')

WebUI.click(findTestObject('Object Repository/cart and checkout/Page_Buy - Cane Furniture of chair sofa set_e6ddd0/a_FREE SHIPPINGRound Rattan Cane Chair  Rec_d5cfb9'))

WebUI.click(findTestObject('Object Repository/cart and checkout/Page_Buy Round Rattan Cane Recliner Chair I_0ce242/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/cart and checkout/Page_Buy Round Rattan Cane Recliner Chair I_0ce242/a_View cart'))

WebUI.click(findTestObject('Object Repository/cart and checkout/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_first_name'), 
    'chaitu')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_last_name'), 
    'n')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input_(optional)_billing_company'), 
    'x')

WebUI.click(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/span__select2-search select2-search--dropdown'))

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_address_1'), 
    '23')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input_(optional)_billing_address_2'), 
    '5')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_city'), 
    'mtm')

WebUI.click(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/span_Delhi'))

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__select2-search__field'), 
    'andh')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_address_1'), 
    '23')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_postcode'), 
    '444')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_phone'), 
    '55555555555')

WebUI.setText(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_email'), 
    'c@gmail.com')

WebUI.click(findTestObject('Object Repository/cart and checkout/Page_Checkout - Handicrafts Online, Indian _dcf088/button_Place order'))

WebUI.closeBrowser()

