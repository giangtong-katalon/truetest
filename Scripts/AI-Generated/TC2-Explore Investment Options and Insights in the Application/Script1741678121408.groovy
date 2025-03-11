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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${path_param_1}")

"Step 2: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_homepage/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over span object.png')

"Step 3: Click on link MutualFunds -> Navigate to page 'investments mutual funds#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_MutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link MutualFunds - Navigate to page investments mutual funds.png')

"Step 4: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investments_mutual_funds/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Hover over span object.png')

"Step 5: Click on link InvestmentFinder -> Navigate to page 'investment product finder#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investments_mutual_funds/link_InvestmentFinder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link InvestmentFinder - Navigate to page investment product finder.png')

"Step 6: Click on button Investments -> Navigate to page 'investment information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_product_finder/button_Investments'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button Investments - Navigate to page investment information.png')

"Step 7: Click on button SeeAllAwards -> Navigate to page 'insights awards#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_information/button_SeeAllAwards'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button SeeAllAwards - Navigate to page insights awards.png')

"Step 8: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_insights_awards/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Hover over span object.png')

"Step 9: Click on link ETFs -> Navigate to page 'investments etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/link_ETFs'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link ETFs - Navigate to page investments etfs.png')

"Step 10: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investments_etfs/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Hover over span object.png')

"Step 11: Click on link MarketUpdates -> Navigate to page 'insights market updates#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investments_etfs/link_MarketUpdates'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link MarketUpdates - Navigate to page insights market updates.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Explore Investment Options and Insights in the Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}