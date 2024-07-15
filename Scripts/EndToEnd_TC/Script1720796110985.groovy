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

WebUI.navigateToUrl(Url)

//CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))

//CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Close_popUp_HP'))
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Close_popUp_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('HP/Login_LOGO_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Inicia_sesin_HP'))

WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Username_HP_loginPopup'), userName)

WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Password_HP_loginPopup'), Password)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Ingresar_Header_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Categoras_button_HP'))

CustomKeywords.'com.customKeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Enviar_a_Cdiga_Postal_14000_(after login postal code)'))

not_run: CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Ofertas_hedaer_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Home Page/Ofertas_hedaer_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Home Page/Sucursales_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Object Repository/Home Page/Facturacin_header_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Bienvenido  sudha'), 
    'Bienvenido sudha')

WebUI.rightClick(findTestObject('Object Repository/Home Page/Medicamentos_L1_category_HP'))

CustomKeywords.'com.customKeywords.myKeywords.highlightElement'(findTestObject('Object Repository/Home Page/SideBox_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Ofertas_de_la_semana_(IMG)_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/SearchBox_Header_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Logo_HP'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/li_Categoras MedicamentosMedicamentosAntimi_49f250'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Medicamentos_L1_category_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Medicamentos'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Antimicticos'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Antimicticos'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Aerosoles'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Aerosoles'))

WebUI.rightClick(findTestObject('Object Repository/Page_Aerosoles/button_Precio'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/button_Precio'), 'Precio')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Marca'), 'Marca')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Todas_las_Categoras'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Ordenar_por'), 'Ordenar por:')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/a_Artculos por pgina 12'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/i_Artculos por pgina 12_fa fa-2x fa-th-larg_767e51'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/button_Artculos por pgina 12_view-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/div_30 de Descuento  Silka Medic Defensa De_b8a457'), 
    '30% de Descuento Silka Medic Defensa Desodorante en Aero... 150 ML Lata $109.00 MXN $76.00 MXN Agregar')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/div_30 de Descuento  Silka Medic Defensa De_b8a457'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/i_Artculos por pgina 12_fa fa-heart disable'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/a_Silka Medic Defensa Desodorante en Aero'), 'Silka Medic Defensa Desodorante en Aero...')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/img'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Aerosoles/img'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/h3_Silka Medic Defensa Desodorante en Aeros_261b7a'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/img'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_Cantidad'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/p_Envo GRATIS a toda la Repblica Mexicana. _34a419'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_30 de Descuento'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Comprar ahora'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Seguir comprando'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_304.00 MXN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_ProductoPrecio'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Subtotal (4 productos)'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_436.00 MXN'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Total'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_304.00 MXN'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/h3_304.00 MXN'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Selecciona una direccin'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Resumen de compra'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Subtotal (1 producto)'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_436.00 MXN'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_Total'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_304.00 MXN'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/div_sudhasantafe98765Residencial insurgente_0adf22'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/div_Nueva direccin'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Selecciona_un_mtodo_de_entrega(cambiar)'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Entrega_programada_Elige_el'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/img_santafe 98765TLALPAN, RESIDENCIAL INSUR_9c95c1'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/div_Hoy12'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/p_8am - 9am'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/img_Viernes_imgCheck'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Solicitar FacturaPodrs capturar tus dat_4af506'))

WebUI.rightClick(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/h4_Selecciona una forma de pago'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Efectivo'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/span_Tarjeta de crdito o dbito'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Tarjeta de crdito o dbito'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/img_Efectivo_checkCard'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/button_Pagar al recibir pedido'))

WebUI.rightClick(findTestObject('Object Repository/Page_/div_Silka Medic Defensa Desodorante en Aero_b44a92'))

WebUI.rightClick(findTestObject('Object Repository/Page_/Direccin_de_entrega'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/h4_Resumen de productos'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Finalizar_compra_OPC'))

WebUI.closeBrowser()

