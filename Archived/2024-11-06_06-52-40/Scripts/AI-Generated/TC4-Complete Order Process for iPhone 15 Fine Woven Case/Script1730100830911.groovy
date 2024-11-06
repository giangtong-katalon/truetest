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

"Step 2: Click on button iPhone15FineWovenCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_iPhone15FineWovenCase'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on button iPhone15FineWovenCase.png')

"Step 3: Click on label mobilePhoneModel (iPhone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_mobilePhoneModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_mobilePhoneModel', ['label_mobilePhoneModel_internalText': label_mobilePhoneModel_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on label mobilePhoneModel iPhone15.png')

"Step 4: Click on label mobilePhoneModel (iPhone15ProMax)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_mobilePhoneModel'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on label mobilePhoneModel iPhone15ProMax.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button Buy.png')

"Step 6: Click on link PlaceAnOrder -> Navigate to page 'form:/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on link PlaceAnOrder - Navigate to page formfixed page.png')

"Step 7: Click on button Increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_page/button_Increase'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button Increase.png')

"Step 8: Click on div ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_page/div_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on div ProceedToCheckout.png')

"Step 9: Click on button ProceedToCheckout -> Navigate to page 'form:/{fixed part}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button ProceedToCheckout - Navigate to page formfixed partfixed page.png')

"Step 10: Click on input ReceiveMarketingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ReceiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on input ReceiveMarketingInfo.png')

"Step 11: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on input Email.png')

"Step 12: Click on main FormFixedPart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/main_FormFixedPart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on main FormFixedPart.png')

"Step 13: Click on span EmailNewsOffers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/span_EmailNewsOffers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on span EmailNewsOffers.png')

"Step 14: Click on input ReceiveMarketingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ReceiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on input ReceiveMarketingInfo.png')

"Step 15: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on input Email.png')

"Step 16: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Enter input value in input Email.png')

"Step 17: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on button ContinueToShipping.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Complete Order Process for iPhone 15 Fine Woven Case_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}