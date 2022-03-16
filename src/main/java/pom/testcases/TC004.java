package pom.testcases;

import pom.pages.Homepage;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pages.Accomdation;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers

{
	
	@BeforeTest(groups="Functional")
	public void beforeTest() {
		
		testcaseName = "TC001";
		testcaseDescription = "IRCTC SignUp";
		testCaseCateogeory = "Smoke";
		testcaseAutor = "Balaji";
		excelSheetName = "TC001";
	}
	
	
	@Test(groups="Functional")
	public void tc004() 
	{
		
	Homepage obj = new Homepage(driver, test);
	obj.clickOnSideMenu()
	.clickonStays();
     
	Accomdation obj2=new Accomdation();
    obj2.LoungeSideMenu()
    .clickCharter()
    .clickEnquiryForm()
    .usernameSaloon("balall")
    .organisation("nfl")
    .addressCharter("tapovanam near andhra bank")
    .mobileNoSaloon("88888888")
    .emailSaloon("balaji3341@gmail.com")
    .selectSaloonDropDown("Saloon Charter")
    .orignStation("bengaluru")
    .destnStation("Hyderabad")
    .clickDepartureTextBox()
    .depYear()
    .depMonth()
    .depYear()
    .clickDepartureTextBox()
    .arrYear()
    .arrMonth()
    .arrDate()
    .durationPeriod("10")
    .noOfCoaches("2")
    .noPassengers("200")
    .purposeOfCharter("tour")
    .additionalServices("Food");
    	
	
	
	}
}
