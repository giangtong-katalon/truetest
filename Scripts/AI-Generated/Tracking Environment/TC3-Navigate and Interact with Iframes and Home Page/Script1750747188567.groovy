import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over link about"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/link_about'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over link about.png')

"Step 3: Click on link iframes -> Navigate to page '/iframes'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_iframes'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link iframes - Navigate to page iframes.png')

"Step 4: Hover over button iframeSameDomain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_iframeSameDomain'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Hover over button iframeSameDomain.png')

"Step 5: Click on link object -> Navigate to page '/iframes/cellphone-demo'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/link_object'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link object - Navigate to page iframescellphone-demo.png')

"Step 6: Click on link vinothQaDemo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes/cellphone-demo?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes_cellphone_demo/link_vinothQaDemo'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link vinothQaDemo - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate and Interact with Iframes and Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}