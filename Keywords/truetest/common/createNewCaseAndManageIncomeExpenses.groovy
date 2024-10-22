package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class createNewCaseAndManageIncomeExpenses {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link CreateNewCase"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_CreateNewCase'))
        
        "Step 2: Click on input creditCardPurpose (CreditCardPurpose)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_prweb_sts_app/input_creditCardPurpose"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_prweb_sts_app/input_creditCardPurpose', ['input_creditCardPurpose_internalLabel': data['input_creditCardPurpose_internalLabel']]))
        
        "Step 3: Click on button Next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Next'))
        
        "Step 4: Click on input creditCardPurpose (CreditCardPurpose2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_prweb_sts_app/input_creditCardPurpose"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_prweb_sts_app/input_creditCardPurpose', ['input_creditCardPurpose_internalLabel': data['input_creditCardPurpose_internalLabel_1']]))
        
        "Step 5: Click on button Next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Next'))
        
        "Step 6: Click on button RefreshSection2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_RefreshSection2'))
        
        "Step 7: Click on input CanadianResident"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_CanadianResident'))
        
        "Step 8: Click on link Edit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_Edit'))
        
        "Step 9: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Save'))
        
        "Step 10: Click on i ShowActions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/i_ShowActions'))
        
        "Step 11: Click on link incomeExpenseManagement (DeleteExpense)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement', ['link_incomeExpenseManagement_internalRoleMenuitemName': data['link_incomeExpenseManagement_internalRoleMenuitemName']]))
        
        "Step 12: Click on button Delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Delete'))
        
        "Step 13: Click on link AddExpense"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_AddExpense'))
        
        "Step 14: Click on link incomeExpenseManagement (CostFreeAccommodation)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement', ['link_incomeExpenseManagement_nthChild': data['link_incomeExpenseManagement_nthChild'], 'link_incomeExpenseManagement_internalRoleMenuitemName': data['link_incomeExpenseManagement_internalRoleMenuitemName_1']]))
        
        "Step 15: Click on i ShowActions2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/i_ShowActions2'))
        
        "Step 16: Click on link incomeExpenseManagement (DeleteIncome)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement', ['link_incomeExpenseManagement_nthChild': data['link_incomeExpenseManagement_nthChild_1'], 'link_incomeExpenseManagement_internalRoleMenuitemName': data['link_incomeExpenseManagement_internalRoleMenuitemName_2']]))
        
        "Step 17: Click on button OK"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_OK'))
        
        "Step 18: Click on i ShowActions2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/i_ShowActions2'))
        
        "Step 19: Click on link incomeExpenseManagement (EditIncome)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_prweb_sts_app/link_incomeExpenseManagement', ['link_incomeExpenseManagement_internalRoleMenuitemName': data['link_incomeExpenseManagement_internalRoleMenuitemName_3']]))
        
        "Step 20: Click on input CompanyName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_CompanyName'))
        
        "Step 21: Enter input value in input CompanyName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_CompanyName2'), data['input_CompanyName2'])
        
        "Step 22: Click on input Position"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_Position'))
        
        "Step 23: Enter input value in input Position2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_Position2'), data['input_Position2'])
        
        "Step 24: Click on input NoOfYears"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_NoOfYears'))
        
        "Step 25: Enter input value in input NoOfYears2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_NoOfYears2'), data['input_NoOfYears2'])
        
        "Step 26: Click on input NoOfMonths"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_NoOfMonths'))
        
        "Step 27: Enter input value in input NoOfMonths2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_NoOfMonths2'), data['input_NoOfMonths2'])
        
        "Step 28: Click on input YearlyIncome"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_YearlyIncome'))
        
        "Step 29: Enter input value in input YearlyIncome2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_YearlyIncome2'), data['input_YearlyIncome2'])
        
        "Step 30: Click on input PhoneNumber"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_PhoneNumber'))
        
        "Step 31: Enter input value in input PhoneNumber2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_PhoneNumber2'), data['input_PhoneNumber2'])
        
        "Step 32: Click on input AreaCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_AreaCode'))
        
        "Step 33: Enter input value in input AreaCode2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_AreaCode2'), data['input_AreaCode2'])
        
        "Step 34: Click on button Save2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Save2'))
        
        "Step 35: Click on input SavingsInvestmentsRange"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_SavingsInvestmentsRange'))
        
        "Step 36: Click on button Next2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Next2'))
        
        "Step 37: Click on button RefreshSection"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_RefreshSection'))
        
        "Step 38: Click on input CreditCardFeatureType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_CreditCardFeatureType'))
        
        "Step 39: Click on input AdvisorTransitNumber"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_AdvisorTransitNumber'))
        
        "Step 40: Enter input value in input AdvisorTransitNumber"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_AdvisorTransitNumber'), data['input_AdvisorTransitNumber'])
        
        "Step 41: Click on input SourceCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_SourceCode'))
        
        "Step 42: Enter input value in input SourceCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_SourceCode'), data['input_SourceCode'])
        
        "Step 43: Click on input TreatmentID"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_TreatmentID'))
        
        "Step 44: Enter input value in input TreatmentID"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_TreatmentID'), data['input_TreatmentID'])
        
        "Step 45: Click on textarea Description"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/textarea_Description'))
        
        "Step 46: Enter input value in textarea Description"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/textarea_Description'), data['textarea_Description'])
        
        "Step 47: Click on input ApplicationDate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_ApplicationDate'))
        
        "Step 48: Enter input value in input ApplicationDate"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_ApplicationDate'), data['input_ApplicationDate'])
        
        "Step 49: Click on select ResponseType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/select_ResponseType'))
        
        "Step 50: Click on button Next2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Next2'))
        
        "Step 51: Click on button RefreshSection"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_RefreshSection'))
        
        "Step 52: Click on input RemoveProductIndicator"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_RemoveProductIndicator'))
        
        "Step 53: Click on link RemoveAllProducts"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_RemoveAllProducts'))
        
        "Step 54: Click on link AddProductsProgramsOffers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_AddProductsProgramsOffers'))
        
        "Step 55: Click on link AddProductsProgramsOffers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_AddProductsProgramsOffers'))
        
        "Step 56: Click on select ProductType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/select_ProductType'))
        
        "Step 57: Click on link AddButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_AddButton'))
        
        "Step 58: Click on input RequestedCreditLimit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/input_RequestedCreditLimit'))
        
        "Step 59: Enter input value in input RequestedCreditLimit2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_prweb_sts_app/input_RequestedCreditLimit2'), data['input_RequestedCreditLimit2'])
        
        "Step 60: Click on div ConfigureDividendVisa"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/div_ConfigureDividendVisa'))
        
        "Step 61: Click on button OverlaySave"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_OverlaySave'))
        
        "Step 62: Click on button Done"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/button_Done'))
        
        "Step 63: Click on link SignOff3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_prweb_sts_app/link_SignOff3'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_AdvisorTransitNumber'] = testData.getValue('input_AdvisorTransitNumber', rowIndex)
        data['input_ApplicationDate'] = testData.getValue('input_ApplicationDate', rowIndex)
        data['input_AreaCode2'] = testData.getValue('input_AreaCode2', rowIndex)
        data['input_CompanyName2'] = testData.getValue('input_CompanyName2', rowIndex)
        data['input_NoOfMonths2'] = testData.getValue('input_NoOfMonths2', rowIndex)
        data['input_NoOfYears2'] = testData.getValue('input_NoOfYears2', rowIndex)
        data['input_PhoneNumber2'] = testData.getValue('input_PhoneNumber2', rowIndex)
        data['input_Position2'] = testData.getValue('input_Position2', rowIndex)
        data['input_RequestedCreditLimit2'] = testData.getValue('input_RequestedCreditLimit2', rowIndex)
        data['input_SourceCode'] = testData.getValue('input_SourceCode', rowIndex)
        data['input_TreatmentID'] = testData.getValue('input_TreatmentID', rowIndex)
        data['input_YearlyIncome2'] = testData.getValue('input_YearlyIncome2', rowIndex)
        data['input_creditCardPurpose_internalLabel'] = testData.getValue('input_creditCardPurpose_internalLabel', rowIndex)
        data['input_creditCardPurpose_internalLabel_1'] = testData.getValue('input_creditCardPurpose_internalLabel_1', rowIndex)
        data['link_incomeExpenseManagement_internalRoleMenuitemName'] = testData.getValue('link_incomeExpenseManagement_internalRoleMenuitemName', rowIndex)
        data['link_incomeExpenseManagement_internalRoleMenuitemName_1'] = testData.getValue('link_incomeExpenseManagement_internalRoleMenuitemName_1', rowIndex)
        data['link_incomeExpenseManagement_internalRoleMenuitemName_2'] = testData.getValue('link_incomeExpenseManagement_internalRoleMenuitemName_2', rowIndex)
        data['link_incomeExpenseManagement_internalRoleMenuitemName_3'] = testData.getValue('link_incomeExpenseManagement_internalRoleMenuitemName_3', rowIndex)
        data['link_incomeExpenseManagement_nthChild'] = testData.getValue('link_incomeExpenseManagement_nthChild', rowIndex)
        data['link_incomeExpenseManagement_nthChild_1'] = testData.getValue('link_incomeExpenseManagement_nthChild_1', rowIndex)
        data['textarea_Description'] = testData.getValue('textarea_Description', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_AdvisorTransitNumber'] = 'default_data'
        data['input_ApplicationDate'] = 'default_data'
        data['input_AreaCode2'] = 'default_data'
        data['input_CompanyName2'] = 'default_data'
        data['input_NoOfMonths2'] = 'default_data'
        data['input_NoOfYears2'] = 'default_data'
        data['input_PhoneNumber2'] = 'default_data'
        data['input_Position2'] = 'default_data'
        data['input_RequestedCreditLimit2'] = 'default_data'
        data['input_SourceCode'] = 'default_data'
        data['input_TreatmentID'] = 'default_data'
        data['input_YearlyIncome2'] = 'default_data'
        data['input_creditCardPurpose_internalLabel'] = 'default_data'
        data['input_creditCardPurpose_internalLabel_1'] = 'default_data'
        data['link_incomeExpenseManagement_internalRoleMenuitemName'] = 'default_data'
        data['link_incomeExpenseManagement_internalRoleMenuitemName_1'] = 'default_data'
        data['link_incomeExpenseManagement_internalRoleMenuitemName_2'] = 'default_data'
        data['link_incomeExpenseManagement_internalRoleMenuitemName_3'] = 'default_data'
        data['link_incomeExpenseManagement_nthChild'] = 'default_data'
        data['link_incomeExpenseManagement_nthChild_1'] = 'default_data'
        data['textarea_Description'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

