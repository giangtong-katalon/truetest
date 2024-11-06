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

"Step 2: Click on link GoToCart -> Navigate to page 'form:/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link GoToCart - Navigate to page formfixed page.png')

"Step 3: Click on button Increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_page/button_Increase'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on button Increase.png')

"Step 4: Click on button ProceedToCheckout -> Navigate to page 'form:/{fixed part}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button ProceedToCheckout - Navigate to page formfixed partfixed page.png')

"Step 5: Click on input ReceiveMarketingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ReceiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on input ReceiveMarketingInfo.png')

"Step 6: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on input Email.png')

"Step 7: Click on main FormFixedPart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/main_FormFixedPart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on main FormFixedPart.png')

"Step 8: Click on span EmailNewsOffers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/span_EmailNewsOffers'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on span EmailNewsOffers.png')

"Step 9: Click on input ReceiveMarketingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ReceiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on input ReceiveMarketingInfo.png')

"Step 10: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on input Email.png')

"Step 11: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Enter input value in input Email.png')

"Step 12: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on button ContinueToShipping.png')

"Step 13: Click on input ReceiveMarketingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ReceiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on input ReceiveMarketingInfo.png')

"Step 14: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on input Email.png')

"Step 15: Click on main FormFixedPart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/main_FormFixedPart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on main FormFixedPart.png')

"Step 16: Click on span EmailNewsOffers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/span_EmailNewsOffers'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on span EmailNewsOffers.png')

"Step 17: Click on input ReceiveMarketingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ReceiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on input ReceiveMarketingInfo.png')

"Step 18: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on input Email.png')

"Step 19: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Enter input value in input Email.png')

"Step 20: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on button ContinueToShipping.png')

"Step 21: Click on button CompleteOrder -> Navigate to page 'display single item:/{fixed page}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on button CompleteOrder - Navigate to page display single itemfixed pageitem id or slug.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Cart Management and Order Completion_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}