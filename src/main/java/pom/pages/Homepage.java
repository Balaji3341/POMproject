package pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers {
	
	public Homepage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public Homepage clickOnSideMenu() 
	{
		clickByXpath(objprop.getProperty("HomePage.clickOnSideMenu"));
		return new Homepage(driver, test);
	}
	
	public Homepage clickOnLogin()
	{
		clickByXpath(objprop.getProperty("HomePage.clciKOnLogin"));
		return this;
	}
	
	public Homepage clickonStays() 
	
	{
		clickByXpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[4]/label");
		return this;
	}
	
	public Homepage clickonLounge() {
		clickByXpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[4]/ul/li[3]/a/span");
		return this;
	}
	
	public RegistrationPage clickOnRegister()
	{
		clickByXpath("//*[@id=\"login_header_disable\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/a[1]");
		return new RegistrationPage(driver, test);
	}
	
	

}
