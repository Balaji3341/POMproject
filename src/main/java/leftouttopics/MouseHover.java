package leftouttopics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		WebElement location = driver.findElementByXPath("//*[@id='nav-link-accountList']/span[1]");
		
		Actions act = new Actions(driver);
		
		// mouse hover
		act.moveToElement(location).perform();
		
		// double click
		act.doubleClick(location).perform();
		
		// right click
		act.contextClick(location).perform();
		
		// drag and drop
		act.dragAndDrop(location, location).perform();
		
		
		
		
	}

}
