import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/login')

WebUI.setText(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah 212  Login/input_Koperasi_username'), 'admin.212@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah 212  Login/input_Koperasi_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah 212  Login/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/a_Master'))

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/a_Cooperative Saving'))

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/a_Cooperative Saving_btn btn-primary'))

WebUI.setText(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/input_Name_title'), 'test')

WebUI.setText(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/textarea_Description_description'), 'test')

WebUI.setText(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/input_Nominal_nominal'), '800000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/select_Choose Operator                     _ea9185'), 
    'SAMA_DENGAN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/select_Simp LKS                            _a3de6e'), 
    'f55620c7-0174-44ce-ab83-a79faf9dd975', true)

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/button_Save'))

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/a_Master'))

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/span_Administrator'))

WebUI.click(findTestObject('Object Repository/Test_01/Page_Koperasi Syariah/a_Logout'))

WebUI.closeBrowser()

