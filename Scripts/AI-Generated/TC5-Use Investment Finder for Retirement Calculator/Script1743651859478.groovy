import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */products/*/* with params (series)"

TrueTestScripts.navigate("${path_param_1}/products/${products_id}/${path_param_4}", ["series": products_series])

"Step 2: Click on link investmentFinder -> Navigate to page 'retirementcalculator en#*/retirementcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_investmentFinder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link investmentFinder - Navigate to page retirementcalculator enretirementcalculator.png')

"Step 3: Click on input userAge"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userAge'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on input userAge.png')

"Step 4: Enter input value in input userAge"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userAge'), input_userAge)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Enter input value in input userAge.png')

"Step 5: Click on input userAnnualIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userAnnualIncome'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on input userAnnualIncome.png')

"Step 6: Enter input value in input userAnnualIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userAnnualIncome'), input_userAnnualIncome)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Enter input value in input userAnnualIncome.png')

"Step 7: Click on input userRetirementSavings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userRetirementSavings'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on input userRetirementSavings.png')

"Step 8: Enter input value in input userRetirementSavings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userRetirementSavings'), input_userRetirementSavings)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Enter input value in input userRetirementSavings.png')

"Step 9: Press key Tab on input userRetirementSavings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userRetirementSavings'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Press key Tab on input userRetirementSavings.png')

"Step 10: Enter input value in input userMonthlySavings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_retirementcalculator_en/input_userMonthlySavings'), input_userMonthlySavings)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Enter input value in input userMonthlySavings.png')

"Step 11: Click on link next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_retirementcalculator_en/link_next'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on link next.png')

"Step 12: Click on link next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_retirementcalculator_en/link_next'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on link next.png')

"Step 13: Adjust div investmentStyleSlider by input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_retirementcalculator_en/div_investmentStyleSlider'), Double.valueOf(div_investmentStyleSlider))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Adjust div investmentStyleSlider by input value.png')

"Step 14: Adjust div investmentStyleSlider by input value -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_retirementcalculator_en/div_investmentStyleSlider'), Double.valueOf(div_investmentStyleSlider_1))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Adjust div investmentStyleSlider by input value - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Use Investment Finder for Retirement Calculator_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}