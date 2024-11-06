import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link iPhone15Plus -> Navigate to page 'display single item:/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link iPhone15Plus - Navigate to page display single itemfixed partitem id or slug.png')

"Step 3: Click on label itemAttributes (ItemStorage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_display_single_item_fixed_part_item_id_or_slug/label_itemAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_display_single_item_fixed_part_item_id_or_slug/label_itemAttributes', ['label_itemAttributes_internalText': label_itemAttributes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on label itemAttributes ItemStorage.png')

"Step 4: Click on label itemAttributes (ItemColor)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_display_single_item_fixed_part_item_id_or_slug/label_itemAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_display_single_item_fixed_part_item_id_or_slug/label_itemAttributes', ['label_itemAttributes_internalText': label_itemAttributes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on label itemAttributes ItemColor.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on button Buy.png')

"Step 6: Click on link PlaceOrder -> Navigate to page 'form:/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link PlaceOrder - Navigate to page formfixed page.png')

"Step 7: Click on button ProceedToCheckout -> Navigate to page 'form:/{fixed part}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button ProceedToCheckout - Navigate to page formfixed partfixed page.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Purchase Process for iPhone 15 Plus_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}