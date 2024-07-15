import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\VEDANT~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\EndToEnd_TC\\20240715_103911\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.farmaciasanpablo.com.mx/')

//CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))
not_run: WebUI.click(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))

//WebUI.click(findTestObject('Object Repository/Home Page/Close_popUp_HP'))
not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElement'(findTestObject('Object Repository/Home Page/Close_popUp_HP'))

not_run: CustomKeywords.'com.customKeywords.myKeywords.clickElement'(findTestObject('HP/Login_LOGO_HP'))

not_run: WebUI.click(findTestObject('Object Repository/Home Page/Inicia_sesin_HP'))

not_run: WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Username_HP_loginPopup'), GlobalVariable.username)

not_run: WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Password_HP_loginPopup'), GlobalVariable.password)

not_run: WebUI.click(findTestObject('Object Repository/Home Page/Ingresar_Header_HP'))

not_run: WebUI.verifyElementPresent(findTestObject('Home Page/Categoras_button_HP'), 0)

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Enviar_a_Cdiga_Postal_14000_(after login postal code)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Home Page/Ofertas_hedaer_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Home Page/Ofertas_hedaer_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Home Page/Sucursales_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Object Repository/Home Page/Facturacin_header_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Bienvenido  sudha'), 
    'Bienvenido sudha')

WebUI.rightClick(findTestObject('Object Repository/Home Page/Medicamentos_L1_category_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Object Repository/Home Page/SideBox_HP'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home Page/Ofertas_de_la_semana_(IMG)_HP'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Home Page/SearchBox_Header_HP'), 0)

WebUI.verifyElementPresent(findTestObject('Home Page/Logo_HP'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/li_Categoras MedicamentosMedicamentosAntimi_49f250'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home Page/Medicamentos_L1_category_HP'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Medicamentos'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Antimicticos'))

WebUI.click(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Antimicticos'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Aerosoles'), 0)

WebUI.click(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Aerosoles'))

WebUI.rightClick(findTestObject('Object Repository/Page_Aerosoles/button_Precio'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/button_Precio'), 'Precio')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Marca'), 'Marca')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aerosoles/Todas_las_Categoras'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Ordenar_por'), 'Ordenar por:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aerosoles/a_Artculos por pgina 12'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aerosoles/i_Artculos por pgina 12_fa fa-2x fa-th-larg_767e51'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aerosoles/button_Artculos por pgina 12_view-button'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/div_30 de Descuento  Silka Medic Defensa De_b8a457'), 
    '30% de Descuento Silka Medic Defensa Desodorante en Aero... 150 ML Lata $109.00 MXN $76.00 MXN Agregar')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aerosoles/div_30 de Descuento  Silka Medic Defensa De_b8a457'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aerosoles/i_Artculos por pgina 12_fa fa-heart disable'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/a_Silka Medic Defensa Desodorante en Aero'), 'Silka Medic Defensa Desodorante en Aero...')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aerosoles/img'), 0)

WebUI.click(findTestObject('Object Repository/Page_Aerosoles/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/h3_Silka Medic Defensa Desodorante en Aeros_261b7a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_Cantidad'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/p_Envo GRATIS a toda la Repblica Mexicana. _34a419'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_30 de Descuento'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Comprar ahora'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Seguir comprando'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_304.00 MXN'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

WebUI.click(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_ProductoPrecio'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Subtotal (4 productos)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_436.00 MXN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Total'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_304.00 MXN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/h3_304.00 MXN'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Selecciona una direccin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Resumen de compra'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Subtotal (1 producto)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_436.00 MXN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_Total'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_304.00 MXN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Shipping Address/div_sudhasantafe98765Residencial insurgente_0adf22'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/div_Nueva direccin'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/Selecciona_un_mtodo_de_entrega(cambiar)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/Entrega_programada_Elige_el'), 0)

WebUI.click(findTestObject('Object Repository/Page_/img_santafe 98765TLALPAN, RESIDENCIAL INSUR_9c95c1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/div_Hoy12'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/p_8am - 9am'), 0)

WebUI.click(findTestObject('Object Repository/Page_/img_Viernes_imgCheck'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'), 0)

WebUI.click(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Solicitar FacturaPodrs capturar tus dat_4af506'))

WebUI.rightClick(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Detalle de pago/h4_Selecciona una forma de pago'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Efectivo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout Detalle de pago/span_Tarjeta de crdito o dbito'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Tarjeta de crdito o dbito'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/img_Efectivo_checkCard'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/button_Pagar al recibir pedido'))

WebUI.rightClick(findTestObject('Object Repository/Page_/div_Silka Medic Defensa Desodorante en Aero_b44a92'))

WebUI.rightClick(findTestObject('Object Repository/Page_/Direccin_de_entrega'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/h4_Resumen de productos'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/Finalizar_compra_OPC'), 0)

WebUI.closeBrowser()

WebUI.acceptAlert()

''', 'Test Cases/EndToEnd_TC', new TestCaseBinding('Test Cases/EndToEnd_TC',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
