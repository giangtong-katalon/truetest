import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.createNewCaseAndManageIncomeExpenses
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /prweb/sts/app/*/*/!STANDARD"

TrueTestScripts.navigate("/prweb/sts/app/${GlobalVariable.app_id}/${GlobalVariable.path_param_6}/!STANDARD")

"Step 2: Click on button RefreshSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/prweb/sts/app/.*/.*/!STANDARD?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_RefreshSection'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 2-Click on button RefreshSection.png')

"Step 3: Create a new case and manage income and expenses details."

createNewCaseAndManageIncomeExpenses.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Create Case and Manage Income and Expenses_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}