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

"Step 1: Navigate to */*/home/overview with params (filter)"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}/home/overview", ["filter": overview_filter])

"Step 2: Hover over path object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic_overview/path_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over path object.png')

"Step 3: Click on link TestCases -> Navigate to page 'project tests#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_overview/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link TestCases - Navigate to page project tests.png')

"Step 4: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on input Search.png')

"Step 5: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Hover over span object.png')

"Step 6: Hover over span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Hover over span object2.png')

"Step 7: Click on input RecentlyUpdated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/input_RecentlyUpdated'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on input RecentlyUpdated.png')

"Step 8: Hover over span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Hover over span object3.png')

"Step 9: Hover over span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Hover over span object4.png')

"Step 10: Click on input RecentlyUpdated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/input_RecentlyUpdated'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on input RecentlyUpdated.png')

"Step 11: Hover over span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Hover over span object2.png')

"Step 12: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Hover over span object.png')

"Step 13: Click on input RecentlyUpdated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/input_RecentlyUpdated'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on input RecentlyUpdated.png')

"Step 14: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Hover over div object.png')

"Step 15: Click on link TestObjects -> Navigate to page 'project resources#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on link TestObjects - Navigate to page project resources.png')

"Step 16: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_resources/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Hover over div object.png')

"Step 17: Click on link projectResources (TestData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_resources/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_resources/link_projectResources', ['link_projectResources_class': link_projectResources_class, 'link_projectResources_internalLabel': link_projectResources_internalLabel, 'link_projectResources_liNthOfType': link_projectResources_liNthOfType, 'path_param_1': path_param_1_1, 'path_param_2': path_param_2_1, 'path_param_3': path_param_3, 'path_param_4': path_param_4]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on link projectResources TestData.png')

"Step 18: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_resources/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Hover over div object.png')

"Step 19: Click on link projectResources (TestObjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_resources/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_resources/link_projectResources', ['link_projectResources_class': link_projectResources_class_1, 'link_projectResources_internalLabel': link_projectResources_internalLabel_1, 'link_projectResources_liNthOfType': link_projectResources_liNthOfType_1, 'path_param_1': path_param_1_2, 'path_param_2': path_param_2_2, 'path_param_3': path_param_3_1, 'path_param_4': path_param_4_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on link projectResources TestObjects.png')

"Step 20: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_resources/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Hover over div object2.png')

"Step 21: Click on link projectResources (Environments) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_resources/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_resources/link_projectResources', ['link_projectResources_class': link_projectResources_class_2, 'link_projectResources_internalLabel': link_projectResources_internalLabel_2, 'link_projectResources_liNthOfType': link_projectResources_liNthOfType_2, 'path_param_1': path_param_1_3, 'path_param_2': path_param_2_3, 'path_param_3': path_param_3_2, 'path_param_4': path_param_4_2]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Click on link projectResources Environments - Navigate to page .png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate and Verify Home Overview with Test Cases and Resources_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}