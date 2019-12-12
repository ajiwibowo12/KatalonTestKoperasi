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

Mobile.startApplication('/home/aji/Documents/Belajar/koperasi-syariah-212-android/app/build/outputs/apk/debug/app-debug.apk', 
    true)

Mobile.pressBack()

Mobile.setText(findTestObject('TestDemoAndroid/android.widget.EditText0 - Username'), 'admin.212@yopmail.com', 0)

Mobile.setText(findTestObject('TestDemoAndroid/android.widget.EditText0 - Password'), 'admin', 0)

Mobile.tap(findTestObject('TestDemoAndroid/android.widget.Button0 - Sign in'), 0)

Mobile.closeApplication()

