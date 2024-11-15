import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on span headingLevels (H1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_headingLevels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_headingLevels', ['span_headingLevels_internalText': span_headingLevels_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on span headingLevels H1.png')

"Step 3: Enter input value in div Textbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/div_Textbox'), div_Textbox)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Enter input value in div Textbox.png')

"Step 4: Click on span headingLevels (H4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_headingLevels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_headingLevels', ['span_headingLevels_internalText': span_headingLevels_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on span headingLevels H4.png')

"Step 5: Click on link LearnMoreAboutDraftJs -> Navigate to page 'documentation#docs/getting-started'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_LearnMoreAboutDraftJs'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link LearnMoreAboutDraftJs - Navigate to page documentationdocsgetting-started.png')

"Step 6: Click on link richStyling (RichStyling) -> Navigate to page 'documentation#docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/getting-started?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_richStyling"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_richStyling', ['link_richStyling_nthChild': link_richStyling_nthChild, 'link_richStyling_internalRoleLinkName': link_richStyling_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link richStyling RichStyling - Navigate to page documentationdocs.png')

"Step 7: Click on link documentationTopics (API Basics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link documentationTopics API Basics.png')

"Step 8: Click on link QuickStart -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_documentation/link_QuickStart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link QuickStart - Navigate to page .png')

"Step 9: Click on link LearnMoreAboutDraftJs -> Navigate to page 'documentation#docs/getting-started'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_LearnMoreAboutDraftJs'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link LearnMoreAboutDraftJs - Navigate to page documentationdocsgetting-started.png')

"Step 10: Click on link documentationTopics (API Basics) -> Navigate to page 'documentation#docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/getting-started?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_1, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_1, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on link documentationTopics API Basics - Navigate to page documentationdocs.png')

"Step 11: Click on link DraftJsLogo -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_documentation/link_DraftJsLogo'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link DraftJsLogo - Navigate to page .png')

"Step 12: Click on link Docs -> Navigate to page 'documentation#docs/getting-started'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Docs'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link Docs - Navigate to page documentationdocsgetting-started.png')

"Step 13: Click on link richStyling (RichStyling) -> Navigate to page 'documentation#docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/getting-started?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_richStyling"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_richStyling', ['link_richStyling_nthChild': link_richStyling_nthChild_1, 'link_richStyling_internalRoleLinkName': link_richStyling_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on link richStyling RichStyling - Navigate to page documentationdocs.png')

"Step 14: Click on link AdvancedTopics"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_documentation/link_AdvancedTopics'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link AdvancedTopics.png')

"Step 15: Click on link documentationTopics (Entities)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_2, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_2, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on link documentationTopics Entities.png')

"Step 16: Click on link documentationTopics (v0 10APIMigration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_3, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_3, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link documentationTopics v0 10APIMigration.png')

"Step 17: Click on link documentationTopics (Decorators)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_4, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_4, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on link documentationTopics Decorators.png')

"Step 18: Click on link documentationTopics (KeyBindings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_5, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_5, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on link documentationTopics KeyBindings.png')

"Step 19: Click on link documentationTopics (ManagingFocus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_6, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_6, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on link documentationTopics ManagingFocus.png')

"Step 20: Click on link documentationTopics (BlockStyling)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_7, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_7, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on link documentationTopics BlockStyling.png')

"Step 21: Click on link documentationTopics (CustomBlockRendering)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_8, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_8, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on link documentationTopics CustomBlockRendering.png')

"Step 22: Click on link documentationTopics (CustomBlockComponents)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_9, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_9, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_9]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on link documentationTopics CustomBlockComponents.png')

"Step 23: Click on link documentationTopics (ComplexInlineStyles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_10, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_10, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_10]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on link documentationTopics ComplexInlineStyles.png')

"Step 24: Click on link NestedLists -> Navigate to page 'documentation#docs/advanced-topics-nested-lists'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_documentation/link_NestedLists'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Click on link NestedLists - Navigate to page documentationdocsadvanced-topics-nested-lists.png')

"Step 25: Click on link TextDirection -> Navigate to page 'documentation#docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/advanced-topics-nested-lists?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_documentation/link_TextDirection'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on link TextDirection - Navigate to page documentationdocs.png')

"Step 26: Click on link documentationTopics (EditorStateRaceConditions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': link_documentationTopics_class_11, 'link_documentationTopics_nthChild': link_documentationTopics_nthChild_11, 'link_documentationTopics_internalRoleLinkName': link_documentationTopics_internalRoleLinkName_11]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on link documentationTopics EditorStateRaceConditions.png')

"Step 27: Click on link DraftJsLogo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_documentation/link_DraftJsLogo'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on link DraftJsLogo.png')

"Step 28: Input text and navigate through documentation topics"

inputTextAndNavigateDocumentation.execute(data_path_0, Integer.valueOf(index_0))

"Step 29: Click on link nextDocumentationTopics (NextEntities)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on link nextDocumentationTopics NextEntities.png')

"Step 30: Click on link nextDocumentationTopics (Nextv0 10APIMigration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class_1, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on link nextDocumentationTopics Nextv0 10APIMigration.png')

"Step 31: Click on link nextDocumentationTopics (NextDecorators)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class_2, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on link nextDocumentationTopics NextDecorators.png')

"Step 32: Click on link nextDocumentationTopics (NextKeyBindings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class_3, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Click on link nextDocumentationTopics NextKeyBindings.png')

"Step 33: Click on link nextDocumentationTopics (NextManagingFocus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class_4, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on link nextDocumentationTopics NextManagingFocus.png')

"Step 34: Click on link nextDocumentationTopics (NextBlockStyling)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class_5, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Click on link nextDocumentationTopics NextBlockStyling.png')

"Step 35: Click on link nextDocumentationTopics (NextCustomBlockRendering)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class_6, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Click on link nextDocumentationTopics NextCustomBlockRendering.png')

"Step 36: Click on link nextDocumentationTopics (NextCustomBlockComponents)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': link_nextDocumentationTopics_class_7, 'link_nextDocumentationTopics_internalRoleLinkName': link_nextDocumentationTopics_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Click on link nextDocumentationTopics NextCustomBlockComponents.png')

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Explore Documentation Topics and Verify Pages_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}