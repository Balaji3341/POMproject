package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;

public class GenericWrappers extends Reporter implements Wrappers{

	public RemoteWebDriver driver;
	public static Properties objprop;
	
	public void loadObjects()
	{
	
		objprop = new Properties();
		try {
			objprop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//RHS = LHS
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) 
			{
				System.setProperty("webdriver.ie.driver", "");
				driver = new InternetExplorerDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			//System.out.println(browser+" Browser Launched Successfully and Loaded url -"+url);
			logStatus("pass", browser+" Browser Launched Successfully and Loaded url -"+url);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Browser got closed due to unknown error");
			logStatus("fail", "Browser got closed due to unknown error");
		}
			
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("Element inspected Correctly and entered data");
			logStatus("pass", "Element inspected Correctly and entered data");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+idValue+"to locate and enter data"+data);
			logStatus("fail", "There is no such element with "+idValue+"to locate and enter data"+data);
		}catch (ElementNotVisibleException e)
		{
			// TODO: handle exception
			logStatus("fail", "There is no such element visible "+idValue+"to locate and enter data"+data);
		}catch (ElementNotInteractableException e) 
		{
			// TODO: handle exception
			logStatus("fail", "Element not intereactable error appeared");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
			logStatus("fail", "Browser got closed due to unknown error");
			
		}
		
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
			
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("Element inspected Correctly and entered data");
			logStatus("pass", "Element inspected Correctly and entered data");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+nameValue+"to locate and enter data"+data);
			logStatus("fail", "There is no such element with "+nameValue+"to locate and enter data"+data);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//System.err.println("There is no such element visible "+nameValue+"to locate and enter data"+data);
			logStatus("fail", "There is no such element visible with "+nameValue+"to locate and enter data"+data);
			
		}catch (ElementNotInteractableException e) {
			//System.err.println("Element not intereactable error appeared");
			logStatus("fail", "Element not intereactable error appeared ");
		}catch (WebDriverException e) 
		{
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
			logStatus("fail", "Browser got closed due to unknown error");
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("Element inspected Correctly and entered data");
			logStatus("pass", "Element inspected Correctly and entered data");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+xpathValue+"to locate and enter data"+data);
			logStatus("fail", "There is no such element with "+xpathValue+"to locate and enter data"+data);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//System.err.println("There is no such element visible "+xpathValue+"to locate and enter data"+data);
			logStatus("fail", "There is no such element visible "+xpathValue+"to locate and enter data"+data);
		}catch (ElementNotInteractableException e) {
			//System.err.println("Element not intereactable error appeared");
			logStatus("fail", "Element not intereactable error appeared");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
		}finally {
			  
		}
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String title1=driver.getTitle();
			
			if(title1.equals(title))
			{
				//System.out.println("Brower title and the verified title are matching");
				logStatus("pass", "Brower title and the verified title are matching");
			}else
			{
				//System.out.println("Browsert Title is not Matching ");
				logStatus("fail", "Browsert Title is not Matching ");
			}
					
		}
		
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Browser got closed due to unknown error");
			logStatus("fail", "Browser got closed due to unknown error");
		}


				
	}

	public void verifyTextById(String id, String text) 
	{
		// TODO Auto-generated method stub
		
		String text1 = driver.findElementById(id).getText();
		if(text1.equals(text))
		{
			//System.out.println("Matches the give text");
			logStatus("Pass", "Matches the give text");
		}else
		{
			//System.out.println("Text does not match with the given ");
			logStatus("Fail", "Text does not match with the given");
		}	
					
	}

	public void verifyTextByXpath(String xpath, String text)
	{
		// TODO Auto-generated method stub
		
		String text1 = driver.findElementByXPath(xpath).getText();
		//equals Exact match 
		if(text1.equals(text))
		{
			//System.out.println("Matches the give text");
			logStatus("Pass", "Matches the give text");
			
		}else
		{
			//System.out.println("Text does not match with the given ");
			logStatus("Fail", "Text does not match with the given");
		}	
		
	}

	public void verifyTextContainsByXpath(String xpath, String text)
	{
		// TODO Auto-generated method stub
		
		String text1 = driver.findElementByXPath(xpath).getText();
		//Contains Partial Match
		if(text1.contains(text)) 
		{
			//System.out.println("Matches the given text");
			logStatus("Pass", "Matches the give text");
		}else
		{
			//System.out.println("Text does not match with the given ");
			logStatus("Fail", "Text does not match with the given");
			
		}	
		
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
			
		try {
			driver.findElementById(id).click();
			//System.out.println("Element inspected Correctly ");
			logStatus("pass", "Element inspected Correctly and clicked");
		} catch (NoSuchElementException e)
		{
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+id+"to Click");
			logStatus("Fail", "There is no such element with "+id+"to Click");
		}catch (ElementNotVisibleException e)
		{
			//System.err.println("Element is not visible exception occured");
			logStatus("Fail", "There is no such element visible with "+id+"to Click");
		}catch (ElementNotInteractableException e)
		{
			//System.err.println("Element is not intereactable exception occured");
			
			logStatus("Fail", "Element is not intereactable exception occured");
		}catch (WebDriverException e)
		{
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
			logStatus("Fail", "Browser got closed due to unknown error");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub	
	    try {
			driver.findElementByClassName(classVal);
			logStatus("pass", "Element inspected Correctly");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+classVal+" found");
			logStatus("Fail", "There is no such element with "+classVal+" found");
			
		}catch (ElementNotVisibleException e) {
			//System.err.println("Element is not visible exception occured");
			logStatus("fail", "Element is not visible exception occured");
			
		}catch (ElementNotInteractableException e) {
			//System.err.println("Element is not intereactable exception occured");
			logStatus("fail", "Element is not intereactable exception occured");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
			logStatus("fail", "Browser got closed due to unknown error");
		}
		
	}

	public void clickByName(String name) 
	{
		// TODO Auto-generated method stub
		
	    try {
				driver.findElementByName(name).click();
				
				logStatus("pass", "Element inspected Correctly");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("There is no such element with "+name+" to Click");
				logStatus("Fail", "There is no such element with "+name+" to Click");
			}catch (ElementNotVisibleException e) {
				//System.err.println("Element is not visible exception occured");
				logStatus("Fail", "Element is not visible exception occured");
			}catch (ElementNotInteractableException e) {
				//System.err.println("Element is not intereactable exception occured");
				logStatus("Fail", "Element is not intereactable exception occured");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("Browser got closed due to unknown error");
				logStatus("Fail", "Browser got closed due to unknown error");
			}
	}

	public void clickByLink(String name) 
	{
		// TODO Auto-generated method stub	
		 try {
				driver.findElementByLinkText(name).click();
				logStatus("pass", "Element inspected Correctly and clicked");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("There is no such element with "+name+" to Click");
				logStatus("Fail","There is no such element with "+name+" to Click");
			}catch (ElementNotVisibleException e)
		   {
				//System.err.println("Element is not visible exception occured");
				logStatus("Fail","There is no such element visible with "+name+" to Click");
			}catch (ElementNotInteractableException e) {
				//System.err.println("Element is not intereactable exception occured");
				logStatus("Fail","Element is not intereactable exception occured");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("Browser got closed due to unknown error");
				logStatus("Fail","Browser got closed due to unknown error");
			}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
	
		 try {
				driver.findElementByLinkText(name).click();
				logStatus("pass", "Element inspected Correctly and clicked");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("There is no such element with "+name+" to Click");
				
				logStatus("Fail", "There is no such element with "+name+" to Click");
			}catch (ElementNotVisibleException e) {
				//System.err.println("Element is not visible exception occured");
				logStatus("Fail", "Element is not visible exception occured");
			}catch (ElementNotInteractableException e) {
				//System.err.println("Element is not intereactable exception occured");
				logStatus("Fail", "Element is not intereactable exception occured");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("Browser got closed due to unknown error");
				logStatus("Fail", "Browser got closed due to unknown error");
			}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		

		 try {
				driver.findElementByXPath(xpathVal).click();
				logStatus("pass", "Element inspected Correctly and clicked");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("There is no such element with "+xpathVal+" to Click");
				logStatus("Fail", "There is no such element with "+xpathVal+" to Click");
			}catch (ElementNotVisibleException e) {
				//System.err.println("Element is not visible exception occured");
				logStatus("Fail", "Element is not visible exception occured");
			}catch (ElementNotInteractableException e) {
				//System.err.println("Element is not intereactable exception occured");
				logStatus("Fail", "Element is not intereactable exception occured");
			}catch(WebDriverException e) {
				// TODO: handle exception
				//System.err.println("Browser got closed due to unknown error");
				logStatus("Fail", "Browser got closed due to unknown error");
			}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		
		try {
			driver.findElementByXPath(xpathVal).click();
			logStatus("pass", "Element inspected Correctly and clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+xpathVal+" to Click");
			logStatus("Fail", "There is no such element with "+xpathVal+" to Click");
		}catch (ElementNotVisibleException e) {
			//System.err.println("Element is not visible exception occured");
			logStatus("Fail", "Element is not visible exception occured");
		}catch (ElementNotInteractableException e) {
			//System.err.println("Element is not intereactable exception occured");
			logStatus("Fail", "Element is not intereactable exception occured");
		}catch(WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
			logStatus("Fail", "Browser got closed due to unknown error");
			
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.findElementById(idVal).getText();
			logStatus("Pass", "Element found sucessfully and text retrived");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+idVal+" to get Text");
		}catch (ElementNotVisibleException e) {
			//System.err.println("Element is not visible exception occured");
		}catch (ElementNotInteractableException e) {
			//System.err.println("Element is not intereactable exception occured");
		}catch(WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally{
			  
		}
		
		return text;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		String text = null;
		try {
			text=driver.findElementByXPath(xpathVal).getText();
			logStatus("Pass", "Element found sucessfully and text retrived using xpath");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+xpathVal+" to get Text");
			logStatus("Fail", "There is no such element with "+xpathVal+" to get Text");
		}catch (ElementNotVisibleException e) {
			//System.err.println("Element is not visible exception occured");
			logStatus("Fail", "Element is not visible exception occured");
		}catch (ElementNotInteractableException e) {
			//System.err.println("Element is not intereactable exception occured");
			logStatus("Fail", "Element is not intereactable exception occured");
		}catch(WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
			logStatus("Fail", "Browser got closed due to unknown error");
		}
		
		return text;
	}

	public void selectVisibileTextById(String id, String value)
	{
		// TODO Auto-generated method stub
       
   	try {
        WebElement id1 =driver.findElementById(id);
        Select ids=new Select(id1);
        ids.selectByVisibleText(value);
    	logStatus("Pass", "Element found sucessfully using id");
        
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("There is no such element with "+id+" to select");
		logStatus("fail", "There is no such element with "+id+" to select");
	}catch (ElementNotVisibleException e) {
		//System.err.println("Element is not visible exception occured");
		logStatus("fail", "Element is not visible exception occured");
	}catch (ElementNotInteractableException e) {
		//System.err.println("Element is not intereactable exception occured");
		logStatus("fail", "Element is not intereactable exception occured");
	}catch(WebDriverException e) {
		// TODO: handle exception
		//System.err.println("Browser got closed due to unknown error");
		logStatus("fail", "Browser got closed due to unknown error");
		
	}
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub	
	   	try {
	        WebElement id1 =driver.findElementById(id);
	        Select ids=new Select(id1);
	         ids.selectByIndex(value);
	     	logStatus("Pass", "Element found sucessfully using id");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such element with "+id+" to select");
			logStatus("fail", "There is no such element with "+id+" to select");
		}catch (ElementNotVisibleException e) {
			//System.err.println("Element is not visible exception occured");
			logStatus("fail", "Element is not visible exception occured");
		}catch (ElementNotInteractableException e) {
			//System.err.println("Element is not intereactable exception occured");
			logStatus("fail", "Element is not intereactable exception occured");
		}catch(WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Browser got closed due to unknown error");
			logStatus("fail", "Browser got closed due to unknown error");
		}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			String wind=driver.getWindowHandle();
			Set<String> allwinds =driver.getWindowHandles();
			for (String wind1 : allwinds)
			{				
				driver.switchTo().window(wind1);	
				System.out.println(wind1);
				break;
			}
	        
		} 
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("No Such Window is found ");
		}
		catch(WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally{
			  
		}
		
	}
	
	
	
  
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			String wind=driver.getWindowHandle();
			Set<String> allwinds =driver.getWindowHandles();
			for (String wind1 : allwinds) {
				
				driver.switchTo().window(wind1);	
				System.out.println(wind1);		
			}
	        
		} 
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("No Such Window is found ");
		}
		catch(WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally{
			  
		}
		
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		 
	     try {
		 driver.switchTo().alert().accept();
	     }catch (NoSuchWindowException e) {
				// TODO: handle exception
				System.err.println("No Such Window is found ");
			}catch(TimeoutException e) {
				// TODO: handle exception
				System.err.println("Timeout has been found ");
			}catch(NoAlertPresentException e) {
				// TODO: handle exception
				System.err.println("No Alert Found ");
			}
			catch(WebDriverException e) {
				// TODO: handle exception
				System.err.println("Browser got closed due to unknown error");
			}finally{
				  
			}
		 
	}

	public void dismissAlert() {
		  try {
				 driver.switchTo().alert().dismiss();
			     }catch (NoSuchWindowException e) {
						// TODO: handle exception
						System.err.println("No Such Window is found ");
					}catch(TimeoutException e) {
						// TODO: handle exception
						System.err.println("Timeout has been found ");
					}catch(NoAlertPresentException e) {
						// TODO: handle exception
						System.err.println("No Alert Found ");
					}
					catch(WebDriverException e) {
						// TODO: handle exception
						System.err.println("Browser got closed due to unknown error");
					}finally{
						  
					}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		  try {
		         driver.switchTo().alert().getText();
			     }catch (NoSuchWindowException e) {
						// TODO: handle exception
						System.err.println("No Such Window is found ");
					}catch(TimeoutException e) {
						// TODO: handle exception
						System.err.println("Timeout has been found ");
					}catch(NoAlertPresentException e) {
						// TODO: handle exception
						System.err.println("No Alert Found ");
					}
					catch(WebDriverException e) {
						// TODO: handle exception
						System.err.println("Browser got closed due to unknown error");
					}
		
		
		return null;
	}

	public long takeSnap() {
		long snapNumber = 10000l;
		try {
			snapNumber = System.currentTimeMillis();
			File pic = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/snap"+snapNumber+".jpg");
			FileUtils.copyFile(pic, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		
		return snapNumber;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
		try {
			driver.close();
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("No Such Window Exception Found");
		}catch(WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally{
			  
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
		try {
			driver.quit();
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("No Such Window Exception Found");
		}catch(WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}
		
	}

	public void sleep(int ms) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		
			System.err.println("Interreupted Exception displayed while "+ms+"sleep in milliseconds");
		}
		
	}

	public void selectVisibileTextByXpath(String xpathVal,String value)
	{
		// TODO Auto-generated method stub
		try {
	        WebElement id1 =driver.findElementByXPath(xpathVal);
	        Select ids=new Select(id1);
	        ids.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no such element with "+xpathVal+" to select");
		}catch (ElementNotVisibleException e) {
			System.err.println("Element is not visible exception occured");
		}catch (ElementNotInteractableException e) {
			System.err.println("Element is not intereactable exception occured");
		}catch(WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally{
			  
		}
	}
		
		

	public void selectVisibileTextByName(String name,String value)
	{
		// TODO Auto-generated method stub
		try {
	        WebElement id1 =driver.findElementByName(name);
	        Select ids=new Select(id1);
	        ids.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no such element with "+name+" to select");
		}catch (ElementNotVisibleException e) {
			System.err.println("Element is not visible exception occured");
		}catch (ElementNotInteractableException e) {
			System.err.println("Element is not intereactable exception occured");
		}catch(WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally{
			  
		}
	}
	

	
	public void enterByTab(String element, String byIdNameXpath) {
		if (byIdNameXpath.equals("name")) {
			driver.findElementByName(element).sendKeys(Keys.TAB);
		} else if (byIdNameXpath.equals("id")) {
			driver.findElementById(element).sendKeys(Keys.TAB);
		} else if (byIdNameXpath.equals("xpath")) {
			driver.findElementByXPath(element).sendKeys(Keys.TAB);
		}

	}
	
	
	public void adRemover() {
		WebElement ad = driver.findElementByXPath("//*[@id=\'corover-close-btn\']");
		boolean trueOrfalse = ad.isEnabled();
		if (trueOrfalse == true) {
			ad.click();
		}
			
	}
	
	public void arrowKeys(String xpathval, String arrowFunc) {
		if (arrowFunc.equals("pageDown")) {

			driver.findElementByXPath(xpathval).sendKeys(Keys.PAGE_DOWN);
			
		} else if (arrowFunc.equals("arrowUp")) {
			driver.findElementByXPath(xpathval).sendKeys(Keys.ARROW_UP);
		} else if (arrowFunc.equals("arrowDown")) {
			driver.findElementByXPath(xpathval).sendKeys(Keys.ARROW_DOWN);
		}else if (arrowFunc.equals("arrowLeft")) {
			driver.findElementByXPath(xpathval).sendKeys(Keys.ARROW_LEFT);
		}else if (arrowFunc.equals("arrowRight")) {
			driver.findElementByXPath(xpathval).sendKeys(Keys.ARROW_RIGHT);
		}

	}
	
	public void enterByIdPassword(String idValue, String data)
	{

		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The element with " + idValue + " is entered with ******. ");
		} catch (ElementNotVisibleException e) {
			System.err.println("The Element with " + idValue + " is not visible in the DOM");

		} catch (NoSuchElementException e) {
			System.err.println("The Element with " + idValue + " is not available in DOM");
		} catch (NotFoundException e) {
			System.err.println("There is no such element " + idValue + " exist in DOM");

		} catch (WebDriverException e) {
			System.err.println("There is an Unknown error in the method enterByIdPassword");

		} finally {
			  
		}

	}
	
	public void webdriverWait(String element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		System.out.println("Method webdriverWait invoked");
		
		
	}

	
	public void selectVisibileValueByName(String name, String value) throws InterruptedException
	{
		try {

			WebElement webElementName = driver.findElementByName(name);
			Select elementName = new Select(webElementName);
			elementName.selectByValue(value);
			System.out.println("The Selected value is : " + value);
			if (name.equals("selPassangers")) {
				webElementName.sendKeys(Keys.TAB);
				Thread.sleep(2000);
			}

		} catch (ElementNotSelectableException e) {
			System.err.println("The entered indexvalue " + value + " is not selectable in DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The entered indexvalue " + value + " is not Visible in DOM");
		} catch (NoSuchElementException e) {
			System.err.println("The entered element with this name " + name + " is not found in DOM");
		} catch (WebDriverException e) {
			System.err.println("There is an Unknown error in the method selectIndexById");
		} finally {
			  
		}

	}
	public String getAttributeByXpath(String xpathVal) {
		String text = null;
		try {
			text = driver.findElementByXPath(xpathVal).getAttribute("value");
			// System.out.println("The Text is : " + text);

		} catch (ElementNotVisibleException e) {
			System.err.println("The entered element with xpath " + xpathVal + " is not Visible in DOM");
		} catch (NoSuchElementException e) {
			System.err.println("There is no such element for the entered xpath : " + xpathVal + " in DOM");
		} catch (WebDriverException e) {
			System.err.println("There is an Unknown error in the method getAttributeByXpath");
		} finally {
			  
		}
		return text;
	}




}
