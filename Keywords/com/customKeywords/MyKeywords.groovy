package com.customKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
 
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
 
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
 
import internal.GlobalVariable
 
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
 
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
 
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
 
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
 
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.JavascriptExecutor;
import com.kms.katalon.core.webui.common.WebUiCommonHelper
 
//import com.kms.katalon.core.webui.driver.DriverFactory
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.lang.RandomStringUtils
 
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.util.KeywordUtil
 
 
class myKeywords {
	private static final KeywordLogger logger = KeywordLogger.getInstance(myKeywords.class)
	@Keyword
	def generateRandomEmail() {
		String firstName = 'automation'
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		String Email = firstName+generatedstring+'mailinator.com'
		KeywordUtil.logInfo(Email)
		return Email
	}
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}
 
	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
 
		try {
			WebElement element = WebUI.findWebElement(to);
			WebUI.scrollToElement(to, 4)
			for (int i = 0; i < 5; i++) {
 
				JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
 
				js.executeScript("arguments[0].setAttribute('style','background: white; border: 5px solid green;');", element);
			}
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
 
	//highlight and click element without scroll
 
	@Keyword
	def clickElementWithoutScroll(TestObject to, int timeout = 30) {
 
		try {
			//WebElement element = WebUI.findWebElement(to, timeout);
			WebUI.waitForElementClickable(to, timeout)
			for (int i = 0; i < 5; i++) {
 
				JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
 
				js.executeScript("arguments[0].setAttribute('style','background: white; border: 5px solid green;');", element);
				//js.executeScript("arguments[0].setAttribute('style', border: 5px solid green;');", element);
				
			}
			//			KeywordUtil.logInfo("Clicking element")
			//element.click()
			WebUI.click(to)
			logger.logPassed("Clicked on element: " + to.getObjectId())
			//KeywordUtil.markPassed("Element has been clicked")
			
		//} catch (WebElementNotFoundException e) {
		//	KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			//KeywordUtil.markFailed("Fail to click on element")
			handleFailure("Failed to click on element: " + to.getObjectId(), e)
		}
	}
 
 
	/*
	 * @Keyword def verifyElementPresent(TestObject to, int timeOut) throws
	 * StepFailedException { return (boolean)
	 * KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.PLATFORM_WEB,
	 * "verifyElementPresent", to, timeOut) }
	 */
	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
 
	@Keyword
	def scrollWindow() {
		// softly scroll to the element group
		JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
 
		for (int i = 0; i < 5000; i += 7) {
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
	}
 
	//scroll to top of the page
	@Keyword
	def scrollToTop() {
		JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
		js.executeScript("window.scrollTo(0,0)");
	}
 
 
	@Keyword
	def highlightElement1() {
		println ("hgfhj")
	}
 
	@Keyword
	def highlightElement(TestObject objectto) {
 
		WebElement element = WebUiCommonHelper.findWebElement(objectto, 20);
 
		for (int i = 0; i < 5; i++) {
 
			JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
 
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 5px solid red;');", element);
		}
	}
/*	//check if element visible
	@Keyword
	def verifyElementPresentKeyword1(TestObject to, int timeOut=30) {
		WebDriver driver;
		
		try {
		WebElement element = WebUI.findWebElement(to, timeOut);
		boolean t = element.isDisplayed();
		if(t) {
			JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
 
			js.executeScript("arguments[0].setAttribute('style','background: white; border: 5px solid blue;');", element);
			//js.executeScript("arguments[0].setAttribute('style', border: 5px solid blue;');", element);
		logger.logPassed("verified the element: " + to.getObjectId())
	}
	else
		 {
		KeywordUtil.logInfo("element is not displayed")
	}
	catch(Exception e) {
	handleFailure("Failed to verify an element: " + to.getObjectId(), e)
	}*/
	
	@Keyword
	def verifyElementPresentKeyword(TestObject to, int timeout = 30) {
		try {
			boolean isPresent = WebUI.waitForElementPresent(to, timeout)
			if (isPresent) {
				JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
				
							js.executeScript("arguments[0].setAttribute('style','background: white; border: 5px solid blue;');", element);
							//js.executeScript("arguments[0].setAttribute('style', border: 5px solid blue;');", element);
				logger.logPassed("Element is present: " + to.getObjectId())
			} else {
				handleFailure("Element is not present: " + to.getObjectId())
			}
		} catch (Exception e) {
			handleFailure("Exception occurred while verifying element presence: " + to.getObjectId(), e)
		}
	}
 
	@Keyword
	def randomString() {
		String charset = (('A'..'Z') + ('0'..'9')).join()
		Integer length = 4
		String StartingText = "Test"
		String randomString = StartingText+RandomStringUtils.random(length, charset.toCharArray())
		KeywordUtil.logInfo(randomString)
	}
	@Keyword
	def removeDollar(String withDollarprice) {
		// withDollarprice = '$230'
		String priceWithoutDollar = withDollarprice.replace('$', '').replace(',', '').replace('.', '')
		KeywordUtil.logInfo(priceWithoutDollar)
		return priceWithoutDollar
	}
	
	
		private void handleFailure(String message, Exception e) {
			logger.logFailed(message)
			KeywordUtil.markFailedAndStop(message)
			takeScreenshot()
			throw new StepFailedException(message, e)
		}
	
		private void takeScreenshot() {
			String screenshotPath = WebUI.takeScreenshot()
			logger.logInfo("Screenshot captured: " + screenshotPath)
		}
	}
 
	//price = removeDollar('$2,3,0')
	//	KeywordUtil.logInfo(price)
 
 