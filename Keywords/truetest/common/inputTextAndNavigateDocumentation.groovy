package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class inputTextAndNavigateDocumentation {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Enter input value in div Textbox"
        
        WebUI.setText(findTestObject('AI-Generated/Page_home/div_Textbox'), data['div_Textbox_1'])
        
        "Step 2: Click on span headingLevels (H5)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_headingLevels"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_headingLevels', ['span_headingLevels_internalText': data['span_headingLevels_internalText']]))
        
        "Step 3: Click on div ExtensibleAndCustomizable"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_ExtensibleAndCustomizable'))
        
        "Step 4: Click on link LearnMoreAboutDraftJs -> Navigate to page 'documentation#docs/getting-started'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_LearnMoreAboutDraftJs'))
        
        "Step 5: Click on link documentationTopics (API Basics) -> Navigate to page 'documentation#docs/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': data['link_documentationTopics_class'], 'link_documentationTopics_nthChild': data['link_documentationTopics_nthChild'], 'link_documentationTopics_internalRoleLinkName': data['link_documentationTopics_internalRoleLinkName']]))
        
        "Step 6: Click on link documentationTopics (RichStyling2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_documentationTopics', ['link_documentationTopics_class': data['link_documentationTopics_class_1'], 'link_documentationTopics_nthChild': data['link_documentationTopics_nthChild_1'], 'link_documentationTopics_internalRoleLinkName': data['link_documentationTopics_internalRoleLinkName_1']]))
        
        "Step 7: Click on link nextDocumentationTopics (PreviousAPI Basics)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_documentation/link_nextDocumentationTopics', ['link_nextDocumentationTopics_class': data['link_nextDocumentationTopics_class'], 'link_nextDocumentationTopics_internalRoleLinkName': data['link_nextDocumentationTopics_internalRoleLinkName']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_Textbox_1'] = testData.getValue('div_Textbox_1', rowIndex)
        data['link_documentationTopics_class'] = testData.getValue('link_documentationTopics_class', rowIndex)
        data['link_documentationTopics_class_1'] = testData.getValue('link_documentationTopics_class_1', rowIndex)
        data['link_documentationTopics_internalRoleLinkName'] = testData.getValue('link_documentationTopics_internalRoleLinkName', rowIndex)
        data['link_documentationTopics_internalRoleLinkName_1'] = testData.getValue('link_documentationTopics_internalRoleLinkName_1', rowIndex)
        data['link_documentationTopics_nthChild'] = testData.getValue('link_documentationTopics_nthChild', rowIndex)
        data['link_documentationTopics_nthChild_1'] = testData.getValue('link_documentationTopics_nthChild_1', rowIndex)
        data['link_nextDocumentationTopics_class'] = testData.getValue('link_nextDocumentationTopics_class', rowIndex)
        data['link_nextDocumentationTopics_internalRoleLinkName'] = testData.getValue('link_nextDocumentationTopics_internalRoleLinkName', rowIndex)
        data['span_headingLevels_internalText'] = testData.getValue('span_headingLevels_internalText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_Textbox_1'] = 'default_data'
        data['link_documentationTopics_class'] = 'default_data'
        data['link_documentationTopics_class_1'] = 'default_data'
        data['link_documentationTopics_internalRoleLinkName'] = 'default_data'
        data['link_documentationTopics_internalRoleLinkName_1'] = 'default_data'
        data['link_documentationTopics_nthChild'] = 'default_data'
        data['link_documentationTopics_nthChild_1'] = 'default_data'
        data['link_nextDocumentationTopics_class'] = 'default_data'
        data['link_nextDocumentationTopics_internalRoleLinkName'] = 'default_data'
        data['span_headingLevels_internalText'] = 'default_data'
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

