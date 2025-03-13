import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link products"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_products'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link products.png')

"Step 3: Click on link products"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_products'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link products.png')

"Step 4: Click on link batteryManagementIcs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_batteryManagementIcs'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link batteryManagementIcs.png')

"Step 5: Click on link batteryAuthenticationIcs -> Navigate to page 'overview#*/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_batteryAuthenticationIcs'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link batteryAuthenticationIcs - Navigate to page overviewoverviewhtml.png')

"Step 6: Click on link viewAllProducts -> Navigate to page 'product listing#*/*/products.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_overview/link_viewAllProducts'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link viewAllProducts - Navigate to page product listingproductshtml.png')

"Step 7: Click on button filterAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/products.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/button_filterAll'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button filterAll.png')

"Step 8: Click on div groupTitleBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/products.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/div_groupTitleBar'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on div groupTitleBar.png')

"Step 9: Adjust div noUiConnects by input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/products.html?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_product_listing/div_noUiConnects'), Double.valueOf(div_noUiConnects))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Adjust div noUiConnects by input value.png')

"Step 10: Click on input rowToggle -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/products.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/input_rowToggle'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on input rowToggle - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Navigate to Products and Filter Battery Management ICS_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}