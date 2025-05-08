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

"Step 1: Navigate to /AXISMMSUAT/login.aspx with params (ReturnUrl)"

TrueTestScripts.navigate("/AXISMMSUAT/login.aspx", ["ReturnUrl": login_ReturnUrl])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Hover over link merchant2 -> Navigate to page '/AXISMMSUAT/views/frmMMAxis.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Hover over link merchant2 - Navigate to page AXISMMSUATviewsfrmMMAxisaspx.png')

"Step 4: Select option with input value from select grade"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMMAxis_aspx/select_grade'), select_grade)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Select option with input value from select grade.png')

"Step 5: Hover over link merchant -> Navigate to page '/AXISMMSUAT/Views/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Hover over link merchant - Navigate to page AXISMMSUATViews.png')

"Step 6: Select option with input value from select display"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/select_display'), select_display)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Select option with input value from select display.png')

"Step 7: Hover over link calls -> Navigate to page '/AXISMMSUAT/Views/frmServiceRequest.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Hover over link calls - Navigate to page AXISMMSUATViewsfrmServiceRequestaspx.png')

"Step 8: Select option with input value from select center"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequest.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequest_aspx/select_center'), select_center)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Select option with input value from select center.png')

"Step 9: Hover over link activity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequest.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequest_aspx/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Hover over link activity.png')

"Step 10: Hover over link activity2 -> Navigate to page '/AXISMMSUAT/Views/ExceptionHandler.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequest.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequest_aspx/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Hover over link activity2 - Navigate to page AXISMMSUATViewsExceptionHandleraspx.png')

"Step 11: Hover over link merchant -> Navigate to page '/AXISMMSUAT/Views/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/ExceptionHandler.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_ExceptionHandler_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Hover over link merchant - Navigate to page AXISMMSUATViews.png')

"Step 12: Hover over link merchant -> Navigate to page '/AXISMMSUAT/views/frmMMAxis.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Hover over link merchant - Navigate to page AXISMMSUATviewsfrmMMAxisaspx.png')

"Step 13: Select option with input value from select edc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMMAxis_aspx/select_edc'), select_edc)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Select option with input value from select edc.png')

"Step 14: Hover over link others"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_others'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Hover over link others.png')

"Step 15: Hover over link mdrChecker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_mdrChecker'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Hover over link mdrChecker.png')

"Step 16: Hover over link others2 -> Navigate to page '/AXISMMSUAT/Views/frmVendorSimNumber.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_others'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Hover over link others2 - Navigate to page AXISMMSUATViewsfrmVendorSimNumberaspx.png')

"Step 17: Hover over link activity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmVendorSimNumber.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmVendorSimNumber_aspx/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Hover over link activity.png')

"Step 18: Click on link preInstSurvey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmVendorSimNumber.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmVendorSimNumber_aspx/link_preInstSurvey'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on link preInstSurvey.png')

"Step 19: Click on link siteReady -> Navigate to page '/AXISMMSUAT/Views/frmServiceRequestSearchAxis Maker.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmVendorSimNumber.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmVendorSimNumber_aspx/link_siteReady'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on link siteReady - Navigate to page AXISMMSUATViewsfrmServiceRequestSearchAxis Makeraspx.png')

"Step 20: Select option with input value from select fspCenter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequestSearchAxis_Maker.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequestSearchAxis_Maker_aspx/select_fspCenter'), select_fspCenter)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Select option with input value from select fspCenter.png')

"Step 21: Select option with input value from select display"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequestSearchAxis_Maker.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequestSearchAxis_Maker_aspx/select_display'), select_display_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Select option with input value from select display.png')

"Step 22: Hover over link merchant -> Navigate to page '/AXISMMSUAT/Views/frmReportsMerchants.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequestSearchAxis_Maker.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequestSearchAxis_Maker_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Hover over link merchant - Navigate to page AXISMMSUATViewsfrmReportsMerchantsaspx.png')

"Step 23: Hover over link activity -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsMerchants.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmReportsMerchants_aspx/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Hover over link activity - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Explore Merchant and Service Request Functionality in the Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}