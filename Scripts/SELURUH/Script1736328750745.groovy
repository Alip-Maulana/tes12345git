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

WebUI.click(findTestObject('Object Repository/FINAL/Page_Bank Sampah/a_Pelajari Lebih Lanjut'))

WebUI.doubleClick(findTestObject('Object Repository/FINAL/Page_Bank Sampah/button_View larger map_gm-control-active'))

WebUI.doubleClick(findTestObject('Object Repository/FINAL/Page_Bank Sampah/button_View larger map_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Bank Sampah/a_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Informasi - Bank Sampah/button_View larger map_gm-control-active'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Informasi - Bank Sampah/button_Keyboard shortcuts'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Informasi - Bank Sampah/div_To navigate, press the arrow keys'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Informasi - Bank Sampah/div_To navigate, press the arrow keys'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Informasi - Bank Sampah/a_Kontak Kami'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Kritik dan Saran - Bank Sampah/button_Kirim'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Kritik dan Saran - Bank Sampah/a_Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Kritik dan Saran - Bank Sampah/a_Jenis Sampah'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Jenis Sampah - Bank Sampah/a_Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Jenis Sampah - Bank Sampah/a_Jual Sampah'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/button_Kirim'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/input_Nama_nama'))

WebUI.setText(findTestObject('Object Repository/FINAL/Page_CRUD Form/input_Nama_nama'), 'asadasd')

WebUI.selectOptionByValue(findTestObject('Object Repository/FINAL/Page_CRUD Form/select_Pilih jenis sampah              Plas_68a1f6'), 
    '4000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FINAL/Page_CRUD Form/select_Pilih kelas              RPL A      _5d68b4'), 
    'RPL A', true)

WebUI.setText(findTestObject('Object Repository/FINAL/Page_CRUD Form/input_Jumlah Sampah (kg)_jumlahSampah'), '12')

WebUI.setText(findTestObject('Object Repository/FINAL/Page_CRUD Form/textarea_Alamat_alamat'), 'asdasda')

WebUI.setText(findTestObject('Object Repository/FINAL/Page_CRUD Form/input_Nama_nama'), '122')

WebUI.setText(findTestObject('Object Repository/FINAL/Page_CRUD Form/input_Jumlah Sampah (kg)_jumlahSampah'), '121')

WebUI.setText(findTestObject('Object Repository/FINAL/Page_CRUD Form/textarea_Alamat_alamat'), '121wws')

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/button_Cetak Struk'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Struk Penjualan/a_Kembali ke Halaman Penjualan'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/button_Cetak Struk_1'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Struk Penjualan/a_Kembali ke Halaman Penjualan'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/a_Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/a_Riwayat'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Riwayat Penjualan Sampah/a_Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_Riwayat Penjualan Sampah/a_Jual Sampah'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/button_Hapus'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/button_Hapus'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/a_Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/FINAL/Page_CRUD Form/a_Riwayat'))

WebUI.closeBrowser()

