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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link accessDenied.png')

"Step 4: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Hover over link calls.png')

"Step 5: Click on link accessDenied2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_accessDenied2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link accessDenied2.png')

"Step 6: Select option with input value from select displayOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/select_displayOptions'), select_displayOptions)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Select option with input value from select displayOptions.png')

"Step 7: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Hover over link merchant.png')

"Step 8: Hover over link merchant2 -> Navigate to page '/AXISMMSUAT/Views/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Hover over link merchant2 - Navigate to page AXISMMSUATViews.png')

"Step 9: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Hover over link calls.png')

"Step 10: Click on link accessDenied"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_accessDenied'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on link accessDenied.png')

"Step 11: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Hover over link merchant.png')

"Step 12: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Hover over link calls.png')

"Step 13: Click on link accessDenied"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_accessDenied'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on link accessDenied.png')

"Step 14: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Hover over link merchant.png')

"Step 15: Hover over link asset -> Navigate to page '/AXISMMSUAT/login.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Hover over link asset - Navigate to page AXISMMSUATloginaspx.png')

"Step 16: Login into Application"

TrueTestScripts.login()

"Step 17: Click on link home -> Navigate to page '/AXISMMSUAT/views/frmhomepagebank.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on link home - Navigate to page AXISMMSUATviewsfrmhomepagebankaspx.png')

"Step 18: Hover over link merchant -> Navigate to page '/AXISMMSUAT/Views/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmhomepagebank.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_views_frmhomepagebank_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Hover over link merchant - Navigate to page AXISMMSUATViews.png')

"Step 19: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Hover over link calls.png')

"Step 20: Click on link accessDenied"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_accessDenied'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on link accessDenied.png')

"Step 21: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Hover over link calls.png')

"Step 22: Click on link supportCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_supportCalls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on link supportCalls.png')

"Step 23: Hover over link asset2 -> Navigate to page '/AXISMMSUAT/Views/frmReportsAsset.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Hover over link asset2 - Navigate to page AXISMMSUATViewsfrmReportsAssetaspx.png')

"Step 24: Hover over link activity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Hover over link activity.png')

"Step 25: Click on link omcConfirmaion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_omcConfirmaion'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on link omcConfirmaion.png')

"Step 26: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Hover over link calls.png')

"Step 27: Click on link assetCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_assetCalls'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on link assetCalls.png')

"Step 28: Hover over link merchant -> Navigate to page '/AXISMMSUAT/Views/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Hover over link merchant - Navigate to page AXISMMSUATViews.png')

"Step 29: Hover over link activity -> Navigate to page '/AXISMMSUAT/Views/frmServiceRequestSearch.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Hover over link activity - Navigate to page AXISMMSUATViewsfrmServiceRequestSearchaspx.png')

"Step 30: Click on link assetView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequestSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequestSearch_aspx/link_assetView'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on link assetView.png')

"Step 31: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequestSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequestSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Hover over link merchant.png')

"Step 32: Click on link dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequestSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequestSearch_aspx/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Click on link dashboard.png')

"Step 33: Hover over link asset -> Navigate to page '/AXISMMSUAT/Views/frmReportsAsset.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmServiceRequestSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_AXISMMSUAT_Views_frmServiceRequestSearch_aspx/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Hover over link asset - Navigate to page AXISMMSUATViewsfrmReportsAssetaspx.png')

"Step 34: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Navigate and Verify Access Permissions in Axis MMS Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}