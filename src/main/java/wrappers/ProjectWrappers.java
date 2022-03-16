package wrappers;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.Dataprovider_POM;

public class ProjectWrappers extends GenericWrappers {
	
	public String excelSheetName;
	
	@BeforeSuite(groups= {"Functional", "Regression"})
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeClass(groups= {"Functional", "Regression"})
	public void beforeClass() {
		startTest(testcaseName, testcaseDescription);
		test.assignAuthor(testcaseAutor);
		test.assignCategory(testCaseCateogeory);
		loadObjects();
	}
	

	@BeforeMethod(groups= {"Functional", "Regression"})
	public void irctcSignup() {

		invokeApp("Chrome","https://www.irctc.co.in/nget/train-search");
		// Click main menu
		
		//clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a");

		// clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]");

	}

	@AfterMethod(groups= {"Functional", "Regression"})
	public void closeIrctc()
	{
		closeAllBrowsers();
	}
	
	@AfterClass(groups= {"Functional", "Regression"})
	public void afterClass() {
		endTest();
	}
	
	@AfterTest(groups= {"Functional", "Regression"})
	public void afterTest() {
		//Reserved
	}
	
	
	@AfterSuite(groups= {"Functional", "Regression"})
	public void afterReport() {
		endReport();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException{
		return Dataprovider_POM.getData(excelSheetName);
	}
	
	
}
