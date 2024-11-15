import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.inputTextAndNavigateDocumentation
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
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

"Step 2: Click on div richTextEditor (DraftJsRichTextEditor)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_richTextEditor'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on div richTextEditor DraftJsRichTextEditor.png')

"Step 3: Click on span headingLevels (H1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_headingLevels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_headingLevels', ['span_headingLevels_internalText': span_headingLevels_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on span headingLevels H1.png')

"Step 4: Click on span headingLevels (H2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_headingLevels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_headingLevels', ['span_headingLevels_internalText': span_headingLevels_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on span headingLevels H2.png')

"Step 5: Input text and navigate through documentation topics"

inputTextAndNavigateDocumentation.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div controlledInputs (ControlledInputs) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/div_controlledInputs'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on div controlledInputs ControlledInputs - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Verify Home Page with Rich Text Editor_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}