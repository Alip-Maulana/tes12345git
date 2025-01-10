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

WebUI.navigateToUrl('https://alip-maulana.github.io/Bank-Sampah/index.html')

WebUI.click(findTestObject('Object Repository/TES-003/Page_Bank Sampah/a_Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_Bank Sampah/a_Riwayat'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_Riwayat Penjualan Sampah/a_Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_Riwayat Penjualan Sampah/a_Jual Sampah'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/input_Nama_nama'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Kirim'))

WebUI.setText(findTestObject('Object Repository/TES-003/Page_CRUD Form/input_Nama_nama'), 'ALIP')

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Kirim'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TES-003/Page_CRUD Form/select_Pilih jenis sampah              Plas_68a1f6'), 
    '25000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TES-003/Page_CRUD Form/select_Pilih kelas              RPL A      _5d68b4'), 
    'RPL A', true)

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/div_Formulir Penjualan Sampah              _ab35b9'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Kirim'))

WebUI.setText(findTestObject('Object Repository/TES-003/Page_CRUD Form/input_Jumlah Sampah (kg)_jumlahSampah'), '4')

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Kirim'))

WebUI.setText(findTestObject('Object Repository/TES-003/Page_CRUD Form/textarea_Alamat_alamat'), 'jl bajsdbkad')

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Kirim'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Edit'))

WebUI.setText(findTestObject('Object Repository/TES-003/Page_CRUD Form/input_Nama_nama'), 'ALIPasssssssssdadada')

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Kirim'))

WebUI.click(findTestObject('Object Repository/TES-003/Page_CRUD Form/button_Hapus'))

WebUI.closeBrowser()

