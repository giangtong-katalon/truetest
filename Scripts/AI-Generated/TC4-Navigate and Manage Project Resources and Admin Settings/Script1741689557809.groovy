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

"Step 1: Navigate to */*/home/overview"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}/home/overview")

"Step 2: Hover over link Assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic_overview/link_Assets'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over link Assets.png')

"Step 3: Click on link Application -> Navigate to page 'project resources#project/*/resources/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_overview/link_Application'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link Application - Navigate to page project resourcesprojectresources.png')

"Step 4: Hover over link Tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/resources/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_resources/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Hover over link Tests.png')

"Step 5: Click on link TestCases -> Navigate to page 'project tests#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/resources/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_resources/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link TestCases - Navigate to page project tests.png')

"Step 6: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Hover over span object.png')

"Step 7: Hover over span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Hover over span object2.png')

"Step 8: Click on input RecentlyUpdated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/input_RecentlyUpdated'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on input RecentlyUpdated.png')

"Step 9: Hover over span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Hover over span object3.png')

"Step 10: Hover over span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Hover over span object4.png')

"Step 11: Click on input RecentlyUpdated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/input_RecentlyUpdated'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on input RecentlyUpdated.png')

"Step 12: Click on div FilterByType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/div_FilterByType'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on div FilterByType.png')

"Step 13: Click on div Menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/div_Menu'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on div Menu.png')

"Step 14: Click on div FilterByStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/div_FilterByStatus'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on div FilterByStatus.png')

"Step 15: Click on div Menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/div_Menu'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on div Menu.png')

"Step 16: Hover over link Assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/link_Assets'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Hover over link Assets.png')

"Step 17: Click on link TestData -> Navigate to page 'project resources#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/link_TestData'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on link TestData - Navigate to page project resources.png')

"Step 18: Hover over link TestCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_resources/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Hover over link TestCloud.png')

"Step 19: Click on link KREAgents -> Navigate to page 'agent management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_resources/link_KREAgents'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on link KREAgents - Navigate to page agent management.png')

"Step 20: Hover over link Org"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_agent_management/link_Org'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Hover over link Org.png')

"Step 21: Click on link UserManagement -> Navigate to page 'admin panel#admin/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_agent_management/link_UserManagement'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on link UserManagement - Navigate to page admin paneladmin.png')

"Step 22: Hover over link System"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_admin_panel/link_System'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Hover over link System.png')

"Step 23: Click on link General"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/link_General'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on link General.png')

"Step 24: Hover over button BusinessDomains"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_admin_panel/button_BusinessDomains'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Hover over button BusinessDomains.png')

"Step 25: Click on button Permission -> Navigate to page 'admin#admin/*/system-permission'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/button_Permission'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Click on button Permission - Navigate to page adminadminsystem-permission.png')

"Step 26: Click on button SystemConfigurations -> Navigate to page 'admin configuration#admin/*/configurations/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/system-permission?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_SystemConfigurations'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on button SystemConfigurations - Navigate to page admin configurationadminconfigurations.png')

"Step 27: Click on button SystemIntegrations -> Navigate to page 'admin#admin/*/system-integration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/configurations/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_configuration/button_SystemIntegrations'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27-Click on button SystemIntegrations - Navigate to page adminadminsystem-integration.png')

"Step 28: Hover over link Account"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/system-integration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_admin/link_Account'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 28-Hover over link Account.png')

"Step 29: Click on link General -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'admin/.*/system-integration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_General'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 29-Click on link General - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate and Manage Project Resources and Admin Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}