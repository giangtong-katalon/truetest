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

"Step 2: Click on link crossReferenceSearch -> Navigate to page '/cross-reference-search'"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_crossReferenceSearch'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link crossReferenceSearch - Navigate to page cross-reference-search.png')

"Step 3: Click on textarea enterParts"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/textarea_enterParts'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on textarea enterParts.png')

"Step 4: Enter input value in textarea enterParts"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/textarea_enterParts'), textarea_enterParts)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Enter input value in textarea enterParts.png')

"Step 5: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/button_search'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button search.png')

"Step 6: Click on input toggleRowSelection"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/input_toggleRowSelection'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input toggleRowSelection.png')

"Step 7: Click on button filterOptions (parametricFilterAll)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions', ['button_filterOptions_internalHasText': button_filterOptions_internalHasText]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button filterOptions parametricFilterAll.png')

"Step 8: Click on span groupTitle"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/span_groupTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on span groupTitle.png')

"Step 9: Click on span groupIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/span_groupIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on span groupIcon.png')

"Step 10: Click on div filteringOperator"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/div_filteringOperator'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on div filteringOperator.png')

"Step 11: Click on div selectFieldEquals"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/div_selectFieldEquals'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on div selectFieldEquals.png')

"Step 12: Click on div typeOfMatch"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/div_typeOfMatch'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on div typeOfMatch.png')

"Step 13: Click on button filterOptions (parametricFilterHide)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions', ['button_filterOptions_internalHasText': button_filterOptions_internalHasText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button filterOptions parametricFilterHide.png')

"Step 14: Click on button clearAll"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/button_clearAll'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button clearAll.png')

"Step 15: Click on button filterOptions (columns)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions', ['button_filterOptions_internalHasText': button_filterOptions_internalHasText_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button filterOptions columns.png')

"Step 16: Click on input visibilityToggle (toggleVisibility)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/input_visibilityToggle"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/input_visibilityToggle', ['input_visibilityToggle_id': input_visibilityToggle_id, 'input_visibilityToggle_internalLabel': input_visibilityToggle_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on input visibilityToggle toggleVisibility.png')

"Step 17: Click on input visibilityToggle (additionalMatches)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/input_visibilityToggle"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/input_visibilityToggle', ['input_visibilityToggle_id': input_visibilityToggle_id_1, 'input_visibilityToggle_internalLabel': input_visibilityToggle_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input visibilityToggle additionalMatches.png')

"Step 18: Click on input visibilityToggle (toggleVisibility2)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/input_visibilityToggle"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/input_visibilityToggle', ['input_visibilityToggle_id': input_visibilityToggle_id_2, 'input_visibilityToggle_internalLabel': input_visibilityToggle_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input visibilityToggle toggleVisibility2.png')

"Step 19: Click on button filterOptions (columnsHide)"

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_cross_reference_search/button_filterOptions', ['button_filterOptions_internalHasText': button_filterOptions_internalHasText_3]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on button filterOptions columnsHide.png')

"Step 20: Click on input text"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/input_text'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on input text.png')

"Step 21: Enter input value in input text2"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/input_text2'), input_text2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in input text2.png')

"Step 22: Click on div inventoryDetails -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cross_reference_search/div_inventoryDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on div inventoryDetails - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Perform Cross Reference Search and Apply Filters_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}