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

WebUI.navigateToUrl('https://www.farmaciasanpablo.com.mx/')

//CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/div_No'))
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/div_No'))

//CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/span_'))
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/span_'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('HP/Login_LOGO_HP'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/button_Inicia sesin'))

WebUI.setText(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/input_Inicia sesin_form-control ng-untouche_9480b0'), 
    'sudha.addepalli6662@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/input_Correo electrnico_login-password'), 
    'WtqaFd5tBeTuHNYCQX1z/QRIls5xePo7Y6lEp5krdYVJRf73XNkyVH30uakpQvy2vUJaWS3TsJJN54XUFc3WtFoucZzO3HMF5xb+aSLqcOE=')

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/i_Correo electrnico_fa fa-eye-slash'))

WebUI.setText(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/input_Correo electrnico_login-password_1'), 
    'Indian143.  ')

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/button_Ingresar'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/a_Categoras'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/p_Enviar a Cdigo Postal 14000'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Farmacia en lnea con envo gratis a dom_c469f2/a_Ofertas'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Ofertas'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Sucursales'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Facturacin'), 0)

//CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Bienvenido  sudha'), 'Bienvenido sudha')

//WebUI.rightClick(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Medicamentos'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/img_concat( i class, , fas fa-chevron-right_898612'), 
    0)

//CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Ofertas de la semana'),  0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/input_Atencin a clientes_searchBoxId'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/Logo_hp'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/li_Categoras MedicamentosMedicamentosAntimi_49f250'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Medicamentos'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Medicamentos'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Antimicticos'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Antimicticos'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Aerosoles_L3Category'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Aerosoles_L3Category'))

WebUI.rightClick(findTestObject('Object Repository/Page_Aerosoles/button_Precio'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/button_Precio'), 'Precio')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Marca'), 'Marca')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Todas_las_Categoras'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Ordenar_por'), 'Ordenar por:')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/a_Artculos por pgina 12'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/i_Artculos por pgina 12_fa fa-2x fa-th-larg_767e51'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/button_Artculos por pgina 12_view-button'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/div_30 de Descuento  Silka Medic Defensa De_b8a457'), 
    '30% de Descuento Silka Medic Defensa Desodorante en Aero... 150 ML Lata $109.00 MXN $76.00 MXN Agregar')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/div_30 de Descuento  Silka Medic Defensa De_b8a457'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/i_Artculos por pgina 12_fa fa-heart disable'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/a_Silka Medic Defensa Desodorante en Aero'), 'Silka Medic Defensa Desodorante en Aero...')

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/img'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Aerosoles/img'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/h3_Silka Medic Defensa Desodorante en Aeros_261b7a'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/img'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_Cantidad'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/p_Envo GRATIS a toda la Repblica Mexicana. _34a419'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_30 de Descuento'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Comprar ahora'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Seguir comprando'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_304.00 MXN'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_ProductoPrecio'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Subtotal (4 productos)'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_436.00 MXN'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Total'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_304.00 MXN'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/h3_304.00 MXN'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Selecciona una direccin'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Resumen de compra'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Subtotal (1 producto)'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_436.00 MXN'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_Total'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_304.00 MXN'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/div_sudhasantafe98765Residencial insurgente_0adf22'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/div_Nueva direccin'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Selecciona_un_mtodo_de_entrega(cambiar)'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Entrega_programada_Elige_el'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/img_santafe 98765TLALPAN, RESIDENCIAL INSUR_9c95c1'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/div_Hoy12'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/p_8am - 9am'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/img_Viernes_imgCheck'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Solicitar FacturaPodrs capturar tus dat_4af506'))

WebUI.rightClick(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/h4_Selecciona una forma de pago'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Efectivo'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/span_Tarjeta de crdito o dbito'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Tarjeta de crdito o dbito'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/img_Efectivo_checkCard'))

CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/button_Pagar al recibir pedido'))

WebUI.rightClick(findTestObject('Object Repository/Page_/div_Silka Medic Defensa Desodorante en Aero_b44a92'))

WebUI.rightClick(findTestObject('Object Repository/Page_/Direccin_de_entrega'))

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/h4_Resumen de productos'), 0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Finalizar_compra_OPC'), 0)

WebUI.closeBrowser()


