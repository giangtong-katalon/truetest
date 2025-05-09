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

"Step 3: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Hover over link merchant.png')

"Step 4: Hover over link dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Hover over link dashboard.png')

"Step 5: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Hover over link merchant.png')

"Step 6: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Hover over link merchant.png')

"Step 7: Hover over link merchant2 -> Navigate to page '/AXISMMSUAT/views/frmMMAxis.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMECallSearch_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Hover over link merchant2 - Navigate to page AXISMMSUATviewsfrmMMAxisaspx.png')

"Step 8: Select option with input value from select grade"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/select_grade'), select_grade)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Select option with input value from select grade.png')

"Step 9: Click on input supermid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/input_supermid'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input supermid.png')

"Step 10: Click on input supermid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/input_supermid'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input supermid.png')

"Step 11: Hover over link asset -> Navigate to page '/AXISMMSUAT/Reports/frmMerchantAssetSummaryReport.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Hover over link asset - Navigate to page AXISMMSUATReportsfrmMerchantAssetSummaryReportaspx.png')

"Step 12: Hover over link activity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Reports/frmMerchantAssetSummaryReport.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Reports_frmMerchantAssetSummaryReport_aspx/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Hover over link activity.png')

"Step 13: Click on link host"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Reports/frmMerchantAssetSummaryReport.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Reports_frmMerchantAssetSummaryReport_aspx/link_host'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link host.png')

"Step 14: Click on link siteReady -> Navigate to page '/AXISMMSUAT/Views/frmMECallSearch.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Reports/frmMerchantAssetSummaryReport.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Reports_frmMerchantAssetSummaryReport_aspx/link_siteReady'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link siteReady - Navigate to page AXISMMSUATViewsfrmMECallSearchaspx.png')

"Step 15: Enter input value in input serialno"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmMECallSearch_aspx/input_serialno'), input_serialno)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in input serialno.png')

"Step 16: Hover over link asset"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmMECallSearch_aspx/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Hover over link asset.png')

"Step 17: Hover over link assetView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmMECallSearch_aspx/link_assetView'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Hover over link assetView.png')

"Step 18: Hover over link asset"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmMECallSearch_aspx/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Hover over link asset.png')

"Step 19: Click on link assetView2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmMECallSearch_aspx/link_assetView2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on link assetView2.png')

"Step 20: Click on link assetUpdate -> Navigate to page '/AXISMMSUAT/Views/frmReportsAsset.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmMECallSearch.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmMECallSearch_aspx/link_assetUpdate'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on link assetUpdate - Navigate to page AXISMMSUATViewsfrmReportsAssetaspx.png')

"Step 21: Hover over link merchant -> Navigate to page '/AXISMMSUAT/Views/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Hover over link merchant - Navigate to page AXISMMSUATViews.png')

"Step 22: Select option with input value from select display"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views/select_display'), select_display)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Select option with input value from select display.png')

"Step 23: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Hover over link merchant.png')

"Step 24: Hover over link merchant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Hover over link merchant.png')

"Step 25: Hover over link merchant2 -> Navigate to page '/AXISMMSUAT/views/frmMMAxis.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views/link_merchant'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Hover over link merchant2 - Navigate to page AXISMMSUATviewsfrmMMAxisaspx.png')

"Step 26: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Hover over link calls.png')

"Step 27: Hover over link stationaryCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_stationaryCalls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Hover over link stationaryCalls.png')

"Step 28: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Hover over link calls.png')

"Step 29: Click on link stationaryCalls2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_stationaryCalls2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on link stationaryCalls2.png')

"Step 30: Hover over link activity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_activity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Hover over link activity.png')

"Step 31: Click on link accessDeniedHost"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_accessDeniedHost'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on link accessDeniedHost.png')

"Step 32: Hover over link asset2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Hover over link asset2.png')

"Step 33: Hover over link asset2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_asset'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Hover over link asset2.png')

"Step 34: Click on link accessDeniedAssetUpdate -> Navigate to page '/AXISMMSUAT/Views/frmReportsAsset.aspx'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/views/frmMMAxis.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_views_frmMMAxis_aspx/link_accessDeniedAssetUpdate'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on link accessDeniedAssetUpdate - Navigate to page AXISMMSUATViewsfrmReportsAssetaspx.png')

"Step 35: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Hover over link calls.png')

"Step 36: Hover over link accessDeniedStationaryCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_accessDeniedStationaryCalls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Hover over link accessDeniedStationaryCalls.png')

"Step 37: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Hover over link calls.png')

"Step 38: Hover over link accessDeniedSupportCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_accessDeniedSupportCalls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Hover over link accessDeniedSupportCalls.png')

"Step 39: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Hover over link calls.png')

"Step 40: Hover over link accessDeniedSupportCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_accessDeniedSupportCalls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Hover over link accessDeniedSupportCalls.png')

"Step 41: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Hover over link calls.png')

"Step 42: Hover over link accessDeniedSupportCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_accessDeniedSupportCalls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Hover over link accessDeniedSupportCalls.png')

"Step 43: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Hover over link calls.png')

"Step 44: Hover over link accessDeniedSupportCalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_accessDeniedSupportCalls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Hover over link accessDeniedSupportCalls.png')

"Step 45: Hover over link calls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_calls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Hover over link calls.png')

"Step 46: Click on link accessDeniedSupportCalls2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AXISMMSUAT/Views/frmReportsAsset.aspx?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250509/Page_AXISMMSUAT_Views_frmReportsAsset_aspx/link_accessDeniedSupportCalls2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on link accessDeniedSupportCalls2 - Navigate to page .png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Verify Access in Merchant Management System_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}