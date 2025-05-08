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

"Step 3: Click on link accessDenied"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_accessDenied'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link accessDenied.png')

"Step 4: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Hover over link calls.png')

"Step 5: Click on link accessDenied2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_accessDenied2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link accessDenied2.png')

"Step 6: Select option with input value from select displayOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/select_displayOptions'), select_displayOptions)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Select option with input value from select displayOptions.png')

"Step 7: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Hover over link merchant.png')

"Step 8: Hover over link merchant2 -> Navigate to page '/AXISMMSUAT/Views/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Hover over link merchant2 - Navigate to page AXISMMSUATViews.png')

"Step 9: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Hover over link calls.png')

"Step 10: Click on link accessDenied"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_accessDenied'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link accessDenied.png')

"Step 11: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Hover over link merchant.png')

"Step 12: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Hover over link calls.png')

"Step 13: Click on link accessDenied"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_accessDenied'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link accessDenied.png')

"Step 14: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Hover over link merchant.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Access Denied Handling in Axis MMS Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}