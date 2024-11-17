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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.stevemadden.com/')

try {
    // Wait for the frame to be present
    WebUI.waitForElementPresent(findTestObject('SM US/attentive_creative_frame'), 10)

    // Switch to the frame
    WebUI.switchToFrame(findTestObject('SM US/attentive_creative_frame'), 10)

    // Wait for the close button to be clickable
    WebUI.waitForElementClickable(findTestObject('SM US/closeIconContainer'), 10)

    // Click the close button
    WebUI.click(findTestObject('SM US/closeIconContainer'))
}
catch (Exception e) {
    WebUI.waitForElementClickable(findTestObject('SM US/Page_Steve Madden Official Site  Free Shipp_5c327c/button_No, thanks'), 
        30)

    WebUI.click(findTestObject('SM US/Page_Steve Madden Official Site  Free Shipp_5c327c/button_No, thanks'))
} 
// Handle TimeoutException by interacting with the region popup
finally { 
    // Switch back to the default content
    WebUI.switchToDefaultContent()
}

WebUI.click(findTestObject('Object Repository/SM US/button_OK'))

WebUI.click(findTestObject('Object Repository/SM US/img_Search input_image_class mobile-hidden'))

WebUI.click(findTestObject('Object Repository/SM US/img_Filters_product-img svelte-1keq2mf'))

WebUI.click(findTestObject('Object Repository/SM US/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/SM US/button_Check out'))

WebUI.closeBrowser()

