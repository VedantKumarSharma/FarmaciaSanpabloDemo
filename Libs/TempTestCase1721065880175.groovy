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


RunConfiguration.setExecutionSettingFile('C:\\Users\\VEDANT~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\End_to_End\\20240715_232120\\execution.properties')

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

'enter the testing enviornment URL\\r\\n'
not_run: WebUI.navigateToUrl('https://www.farmaciasanpablo.com.mx/')

//CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))
'no selection of pop-up\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))

//WebUI.click(findTestObject('Object Repository/Home Page/Close_popUp_HP'))
'close of Pop-up'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Close_popUp_HP'))

'click on login icon '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('HP/Login_LOGO_HP'))

'click on iniciar session icon\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Inicia_sesin_HP'))

'enter username for login'
not_run: WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Username_HP_loginPopup'), GlobalVariable.username)

'enter password for login'
not_run: WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Password_HP_loginPopup'), GlobalVariable.password)

'submit button '
not_run: WebUI.click(findTestObject('Object Repository/Home Page/Ingresar_Header_HP'))

'category option header '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Categoras_button_HP'), 
    0)

'verify postal code at header '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Enviar_a_Cdiga_Postal_14000_(after login postal code)'), 
    0)

'verify oftertas option header '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Ofertas_hedaer_HP'), 
    0)

'verify surcursales option header '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Sucursales_HP'), 
    0)

'verify facturacin option header '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Facturacin_header_HP'), 
    0)

'verify logged in by verifying the name '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Bienvenido  sudha'), 
    0)

'verify images at HP\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/SideBox_HP'), 
    0)

'verify searchbar header '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/SearchBox_Header_HP'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Logo_hp'), 
    0)

'mouse over on category drop down option'
not_run: WebUI.mouseOver(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/li_Categoras MedicamentosMedicamentosAntimi_49f250'))

'verify Medicamentos L1 category option from category drop down'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Medicamentos_L1_category_HP'), 
    0)

'click Medicamentos L1 category option from category drop down'
not_run: WebUI.click(findTestObject('Object Repository/Home Page/Medicamentos_L1_category_HP'), FailureHandling.STOP_ON_FAILURE)

'verify medicamentos \\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Medicamentos'), 
    0)

'verify Element Aerosoles at L3'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Page_Ofertas  San Pablo Farmacia/a_Aerosoles_L3Category'))

'click Element Aerosoles at L3'
not_run: WebUI.click(findTestObject('Page_Ofertas  San Pablo Farmacia/a_Aerosoles_L3Category'))

'verify Element precio filtter at PLP\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/button_Precio'))

'verify Element Maraco filtter at PLP\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Marca'))

'verify Element todas las categoras  at PLP\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Todas_las_Categoras'), 
    0)

'verify Element ordernar at PLP\\r\\n'
not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Ordenar_por'), 'Ordenar por:')

'verify Element item per page at PLP\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/item per page'), 
    0)

'verify item per row in PLP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Page_Aerosoles/item per row option 1'), 
    0)

'verify item per row option 2 in PLP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/item per row option 2'), 
    0)

'verify product 1 in PLP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Product 1'), 
    0)

'verify add product 1 to wishlist heart button at PLP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Product1_Add to wishlist'), 
    0)

'verify product 1 name at PLP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Product1_Name_PLP'))

'verify product 1 image at PLP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/img'), 
    0)

'click product 1 image at PLP'
not_run: WebUI.click(findTestObject('Object Repository/Page_Aerosoles/img'))

'verify product name '
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/h3_product_name_PDP'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/img'), 
    0)

'verify candid at PDP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_Cantidad'), 
    0)

'verify product price PDP\\t\\r\\n\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/Product_price_PDP'), 
    0)

'verify header IMG PDP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/header_IMG_PDP'), 
    0)

'verify quantity in PDP'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/Quantity_PDP'), 
    0)

'verify comprar ahora PDP\\r\\n'
not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Comprar ahora'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'))

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Seguir comprando'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_304.00 MXN'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_ProductoPrecio'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Subtotal (4 productos)'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_436.00 MXN'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Total'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_304.00 MXN'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/h3_304.00 MXN'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'))

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Resumen de compra'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Subtotal (1 producto)'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_436.00 MXN'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_Total'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_304.00 MXN'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/div_sudhasantafe98765Residencial insurgente_0adf22'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/div_Nueva direccin'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'))

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Selecciona_un_mtodo_de_entrega(cambiar)'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Entrega_programada_Elige_el'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_/img_santafe 98765TLALPAN, RESIDENCIAL INSUR_9c95c1'))

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/div_Hoy12'), 
    0)

not_run: CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/p_8am - 9am'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_/img_Viernes_imgCheck'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Solicitar FacturaPodrs capturar tus dat_4af506'))

WebUI.rightClick(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/h4_Selecciona una forma de pago'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Efectivo'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/span_Tarjeta de crdito o dbito'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Tarjeta de crdito o dbito'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/img_Efectivo_checkCard'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Detalle de pago/button_Pagar al recibir pedido'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/h4_Resumen de productos'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Finalizar_compra_OPC'), 
    0)

WebUI.closeBrowser()

''', 'Test Cases/End_to_End', new TestCaseBinding('Test Cases/End_to_End',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
