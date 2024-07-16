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

'enter the testing enviornment URL\r\n'
WebUI.navigateToUrl('https://www.farmaciasanpablo.com.mx/')

//CustomKeywords.'com.customKeywords.myKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))
'no selection of pop-up\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/No_button_Popup_HP'))

//CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Close_popUp_HP'))
'close of Pop-up'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Close_popUp_HP'))

'click on login icon '
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('HP/Login_LOGO_HP'))

'click on iniciar session icon\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Inicia_sesin_HP'))

'enter username for login'
WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Username_HP_loginPopup'), GlobalVariable.username)

'enter password for login'
WebUI.setText(findTestObject('Object Repository/Home Page/Inicia_sesin_Password_HP_loginPopup'), GlobalVariable.password)

'submit button '
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Home Page/Ingresar_Header_HP'))

'category option header '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Categoras_button_HP'), 
    0)

'verify postal code at header '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Enviar_a_Cdiga_Postal_14000_(after login postal code)'), 
    0)

'verify oftertas option header '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Ofertas_hedaer_HP'), 
    0)

'verify surcursales option header '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Sucursales_HP'), 0)

'verify facturacin option header '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Facturacin_header_HP'), 
    0)

'verify logged in by verifying the name '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/div_Bienvenido  sudha'), 
    0)

'verify images at HP\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/SideBox_HP'), 
    0)

'verify searchbar header '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/SearchBox_Header_HP'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Home Page/Logo_hp'), 0)

'mouse over on category drop down option'
WebUI.mouseOver(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/li_Categoras MedicamentosMedicamentosAntimi_49f250'))

'verify Medicamentos L1 category option from category drop down'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Home Page/Medicamentos_L1_category_HP'), 
    0)

'mouse over on category drop down option'
WebUI.enhancedClick(findTestObject('Home Page/Medicamentos_L1_category_HP'))

'verify medicamentos \r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Ofertas  San Pablo Farmacia/a_Medicamentos'), 
    0)

'verify Element Aerosoles at L3'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Page_Ofertas  San Pablo Farmacia/a_Aerosoles_L3Category'))

'click Element Aerosoles at L3'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Page_Ofertas  San Pablo Farmacia/a_Aerosoles_L3Category'))

'verify Element precio filtter at PLP\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/button_Precio'))

'verify Element Maraco filtter at PLP\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Marca'))

'verify Element todas las categoras  at PLP\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Todas_las_Categoras'), 
    0)

'verify Element ordernar at PLP\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Aerosoles/Ordenar_por'), 'Ordenar por:')

'verify Element item per page at PLP\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/item per page'), 
    0)

'verify item per row in PLP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Page_Aerosoles/item per row option 1'), 
    0)

'verify item per row option 2 in PLP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/item per row option 2'), 
    0)

'verify product 1 in PLP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Product 1'), 
    0)

'verify add product 1 to wishlist heart button at PLP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Product1_Add to wishlist'), 
    0)

'verify product 1 name at PLP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/Product1_Name_PLP'))

'verify product 1 image at PLP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Aerosoles/img'), 
    0)

'click product 1 image at PLP'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Aerosoles/img'))

'verify product name '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/h3_product_name_PDP'), 
    0)

CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/img'), 
    0)

'verify candid at PDP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_Cantidad'), 
    0)

'verify product price PDP\t\r\n\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/Product_price_PDP'), 
    0)

'verify header IMG PDP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/header_IMG_PDP'), 
    0)

'verify quantity in PDP'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/Quantity_PDP'), 
    0)

'verify comprar ahora PDP\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Comprar ahora'), 
    0)

'verify Agregar al carrito'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'), 
    0)

'click Agregar al carrito'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Agregar al carrito'))

'verify Seguir comprando at pop up pdp\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Seguir comprando_PopUp_PDP'), 
    0)

'verify price visible'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/div_304.00 MXN'), 
    0)

'verify compra button '
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

'click compra button '
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Silka Medic Defensa Desodorante en Aer_ad4bf6/button_Realizar compra'))

'verify price per product '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_ProductoPrecio'), 
    0)

'verify subtotal of product '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Subtotal (4 productos)'), 
    0)

'verify total at opc'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_436.00 MXN'), 
    0)

'verify total title '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_Total'), 
    0)

'verify total price '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/div_304.00 MXN'), 
    0)

'verify seleciana direccin de entrega at address section'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'), 
    0)

'click seleciana direccin de entrega at address section'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Carrito de compras  San Pablo Farmacia/Selecciona_direccin_de_entrega'))

'verify resume de compra (title)'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Resumen de compra'), 
    0)

'verify subtotal '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_Subtotal (1 producto)'), 
    0)

'verify subtotal value'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h4_436.00 MXN'), 
    0)

'verify total title'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_Total'), 
    0)

'verify total price\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/h3_304.00 MXN'), 
    0)

'verify default address at OPC '
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/select_present_address'), 
    0)

'verify Entregar en esta direccin at OPC'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'), 
    0)

'verify add new address\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Checkout Shipping Address/div_Nueva direccin'))

'click Entregar en esta direccin at OPC'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Shipping Address/button_Entregar en esta direccin'))

'verify cambiar add address at OPC'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Selecciona_un_mtodo_de_entrega(cambiar)'), 
    0)

'verfy scedule delivary at OPC'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Entrega_programada_Elige_el'), 
    0)

'click radio button at OPC to scehule delivary'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_/radioButton_scehule_delivery_OPC'))

'verify scehule to select section'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/available_scehule_OPC'), 
    0)

'verify chose delivary method'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'), 
    0)

WebUI.enhancedClick(findTestObject('OPC/RadioBUtton'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_/Elegir_forma_de_entrega_PDP'))

'verify Selecciona una hora de entrega'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/Selecciona una forma de pago(title)'), 
    0)

'verify En inea Tarjeta de crdito'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_En lneaTarjeta de crdito o dbito'), 
    0)

'verify pedido efectivo o tarjets\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'), 
    0)

'click pedido efectivo o tarjets\r\n'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Al recibir tu PedidoEfectivo o tarjeta'))

'verify effectivo at final OPC'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Efectivo'), 
    0)

'verify tarjeta de crdito o dbito'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_Checkout Detalle de pago/span_Tarjeta de crdito o dbito'), 
    0)

'click Tarjeta de crdito o dbito'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/div_Tarjeta de crdito o dbito'))

'Efectivo check card _OPC'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/img_Efectivo_checkCard'))

'pagar al recibir peedido OPC'
CustomKeywords.'com.customKeywords.MyKeywords.clickElementWithoutScroll'(findTestObject('Object Repository/Page_Checkout Detalle de pago/button_Pagar al recibir pedido'))

'verify resume de productos'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/h4_Resumen de productos'), 
    0)

'verify finalizar Compa OPC'
CustomKeywords.'com.customKeywords.MyKeywords.verifyElementPresentKeyword'(findTestObject('Object Repository/Page_/Finalizar_compra_OPC'), 
    0)

WebUI.closeBrowser()

