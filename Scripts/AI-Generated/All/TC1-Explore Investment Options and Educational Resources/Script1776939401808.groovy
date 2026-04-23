import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.All.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 934)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://www.fidelity.ca/en"

TrueTestScripts.navigate("/en")

"Step 2: Hover over button investmentsDropdown"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en/button_investmentsDropdown'))

"Step 3: Click on link mutualFunds -> Navigate to page '/en/investments/mutual-funds'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en/link_mutualFunds'))

"Step 4: Hover over button investmentsMenu"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en_investments_mutual_funds/button_investmentsMenu'))

"Step 5: Click on link etfs -> Navigate to page '/en/investments/etfs'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investments_mutual_funds/link_etfs'))

"Step 6: Hover over button investorEducationMenu"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en_investments_etfs/button_investorEducationMenu'))

"Step 7: Click on link investingForBeginners -> Navigate to page '/en/investor-education/investing-beginners'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investments_etfs/link_investingForBeginners'))

"Step 8: Click on textarea searchQuery"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investor_education_investing_beginners/textarea_searchQuery'))

"Step 9: Enter input value in textarea searchQuery2"

WebUI.setText(findTestObject('AI-Generated/All/Page_en_investor_education_investing_beginners/textarea_searchQuery2'), textarea_searchQuery2)

"Step 10: Click on div megamenuHeader"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investor_education_investing_beginners/div_megamenuHeader'))

"Step 11: Click on button clearSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investor_education_investing_beginners/button_clearSearch'))

"Step 12: Click on link whatIsAstock -> Navigate to page '/en/investor-education/what-is-a-stock'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investor_education_investing_beginners/link_whatIsAstock'))

"Step 13: Hover over button toolsAndCalculatorsMenu"

WebUI.mouseOver(findTestObject('AI-Generated/All/Page_en_investor_education_what_is_a_stock/button_toolsAndCalculatorsMenu'))

"Step 14: Click on link investmentFinder -> Navigate to page '/en/products/investmentfinder'"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_investor_education_what_is_a_stock/link_investmentFinder'))

"Step 15: Click on input fundSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_products_investmentfinder/input_fundSearch'))

"Step 16: Enter input value in input fundSearch"

WebUI.setText(findTestObject('AI-Generated/All/Page_en_products_investmentfinder/input_fundSearch'), input_fundSearch)

"Step 17: Click on item fidelityAbsoluteIncomeFund"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_products_investmentfinder/item_fidelityAbsoluteIncomeFund'))

"Step 18: Click on div searchWrapper -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/All/Page_en_products_investmentfinder/div_searchWrapper'))

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Investment Options and Educational Resources_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}