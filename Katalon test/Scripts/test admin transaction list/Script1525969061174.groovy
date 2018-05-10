import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.215.216.185:7071/')

WebUI.setText(findTestObject('admin transaction list/Page_ProjectBackend/input_username'), 'admin')

WebUI.setText(findTestObject('admin transaction list/Page_ProjectBackend/input_password'), 'admin')

WebUI.click(findTestObject('admin transaction list/Page_ProjectBackend/button_Login'))

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/a_Total Transaction'), 'Total Transaction')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_1'), '1')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Papaya'), 'Garden, Papaya')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_20120 THB'), '20,120 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_2'), '2')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Banana Garden Banana Rambut'), 'Banana, Garden, Banana, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_60570 THB'), '60,570 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_3'), '3')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Rambutan Banana'), 'Rambutan, Banana')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_170 THB'), '170 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_4'), '4')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange'), 'Garden, Banana, Orange')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_20430 THB'), '20,430 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_5'), '5')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_60000 THB'), '60,000 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_6'), '6')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange Papaya'), 'Garden, Banana, Orange, Papaya, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_42408 THB'), '42,408 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_7'), '7')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange Papaya'), 'Garden, Banana, Orange, Papaya, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_42408 THB'), '42,408 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_8'), '8')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange Papaya'), 'Garden, Banana, Orange, Papaya, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_40924 THB'), '40,924 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_9'), '9')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange Papaya'), 'Garden, Banana, Orange, Papaya, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_61386 THB'), '61,386 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_10'), '10')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange Papaya'), 'Garden, Banana, Orange, Papaya, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_81848 THB'), '81,848 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_11'), '11')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange Papaya'), 'Garden, Banana, Orange, Papaya, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_20462 THB'), '20,462 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_12'), '12')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden Banana Orange Papaya'), 'Garden, Banana, Orange, Papaya, Rambutan')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_20462 THB'), '20,462 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_13'), '13')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_20000 THB'), '20,000 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_14'), '14')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_20000 THB'), '20,000 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_15'), '15')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_100000 THB'), '100,000 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_16'), '16')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_100000 THB'), '100,000 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/th_17'), '17')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/td_20000 THB'), '20,000 THB')

WebUI.verifyElementText(findTestObject('admin transaction list/Page_ProjectBackend/p_Total price  731188 THB'), 'Total price: 731,188 THB')

WebUI.closeBrowser()

