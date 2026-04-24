import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.All.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1919, 546)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://www.fidelity.ca/en"

TrueTestScripts.navigate("/en")

"Step 2: Hover over button investmentsDropdown"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en/button_investmentsDropdown'))

"Step 3: Click on link etfs -> Navigate to page '/en/investments/etfs'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en/link_etfs'))

"Step 4: Hover over button investmentsDropdown"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en_investments_etfs/button_investmentsDropdown'))

"Step 5: Click on link mutualFunds -> Navigate to page '/en/investments/mutual-funds'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investments_etfs/link_mutualFunds'))

"Step 6: Hover over button investorEducationDropdown"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en_investments_mutual_funds/button_investorEducationDropdown'))

"Step 7: Click on link investingForBeginners -> Navigate to page '/en/investor-education/investing-beginners'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investments_mutual_funds/link_investingForBeginners'))

"Step 8: Hover over button investmentsDropdown"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en_investor_education_investing_beginners/button_investmentsDropdown'))

"Step 9: Click on link priceAndPerformance -> Navigate to page '/en/priceandperformance'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investor_education_investing_beginners/link_priceAndPerformance'))

"Step 10: Click on button addToWatchlist"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_priceandperformance/button_addToWatchlist'))

"Step 11: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_priceandperformance/button_close'))

"Step 12: Click on button removeFromWatchlist"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_priceandperformance/button_removeFromWatchlist'))

"Step 13: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_priceandperformance/button_close'))

"Step 14: Click on button watchlistAction (addToWatchlist2)"

// Bind values to the variables in the locators of "AI-Generated/All/Dynamic Objects/Page_en_priceandperformance/button_watchlistAction"
WebUI.enhancedClick(findTestObject('AI-Generated/All/Dynamic Objects/Page_en_priceandperformance/button_watchlistAction', ['button_watchlistAction_TrNthChild_1': button_watchlistAction_TrNthChild, 'button_watchlistAction_css_value_1': button_watchlistAction_css_value]))

"Step 15: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_priceandperformance/button_close'))

"Step 16: Click on button watchlistAction (removeFromWatchlist2) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/All/Dynamic Objects/Page_en_priceandperformance/button_watchlistAction"
WebUI.enhancedClick(findTestObject('AI-Generated/All/Dynamic Objects/Page_en_priceandperformance/button_watchlistAction', ['button_watchlistAction_TrNthChild_1': button_watchlistAction_TrNthChild_1, 'button_watchlistAction_css_value_1': button_watchlistAction_css_value_1]))

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Manage Watchlist in Investment Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}