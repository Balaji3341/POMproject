package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers
{
	
	
	@BeforeTest(groups="Regression")
	public void beforeTest() {
		
		testcaseName = "TC001";
		testcaseDescription = "IRCTC SignUp";
		testCaseCateogeory = "Smoke";
		testcaseAutor = "Balaji";
		excelSheetName = "TC001";
	}
	
	
	@Test(groups="Regression")
	public void tc002()
	{
		Homepage obj = new Homepage(driver, test);
		obj.clickOnSideMenu();
		
		
		
	}

}
