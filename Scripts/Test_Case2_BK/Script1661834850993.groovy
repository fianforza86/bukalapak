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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.click(findTestObject('Object Repository/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/div_Nomor handphone atau email'))

WebUI.setText(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    'fianforza86@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/div_Pilih cara lain'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/svg_Lupa Password_ml-16 svg-icon svg-fill'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/svg_--8753_ico_chevron_down_minor'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/svg_--8753_ico_chevron_up_minor'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/strong_--8753'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/path'))

WebUI.setText(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    'fianforza86@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/div_Pilih cara lain'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/svg_--8753_ico_chevron_right_minor'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/svg_Lupa Password_ml-16 svg-icon svg-fill'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'))

WebUI.setText(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 
    '081219183568')

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/strong_0812-1918-3568'))

WebUI.setText(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/input_Nomor hilang atau tidak aktif_bl-text_eb5b69'), 
    '62185')

WebUI.click(findTestObject('Object Repository/Page_Login ke Akun  Bukalapak/span_Verifikasi'))

WebUI.click(findTestObject('Object Repository/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/div_Lagi Populer_bl-image-group__head'))

WebUI.closeBrowser()

