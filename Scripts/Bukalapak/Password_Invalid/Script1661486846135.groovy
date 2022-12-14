import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Menu_Login'))

WebUI.setText(findTestObject('Object Repository/Bukalapak.com/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    'fian.olsera@gmail.com')

WebUI.click(findTestObject('Object Repository/Bukalapak.com/Page_Login ke Akun  Bukalapak/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Bukalapak.com/Page_Login ke Akun  Bukalapak/div_password'))

WebUI.setText(findTestObject('Bukalapak.com/Page_Login ke Akun  Bukalapak/input_Password'), '')

WebUI.click(findTestObject('Bukalapak.com/Page_Login ke Akun  Bukalapak/button_Login'))

WebUI.verifyElementText(findTestObject('Notifikasi_login/p_Password wajib diisi, ya'), 'Password wajib diisi, ya.')

WebUI.takeScreenshot()

