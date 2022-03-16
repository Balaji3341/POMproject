package pom.testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers
{
	@BeforeTest(groups="Functional")
	public void beforeTest() 
	{
		
		testcaseName = "TC001";
		testcaseDescription = "IRCTC SignUp";
		testCaseCateogeory = "Smoke";
		testcaseAutor = "Balaji";
		excelSheetName = "TC001";
	}
	

	@Test(groups="Functional")
	public void tc001() 
	{
		
		Homepage obj = new Homepage(driver, test);
		obj.clickOnSideMenu()
		.clickOnLogin()
		.clickOnRegister()
		.enterUserName("String.valueOf(userName)")
		.enterPassword("password")
		.confirmPassword("balu")
		.selectSecurityQuestion("what is your pet name?")
		.sleepinRegistrationPage(2000)
		.securityAnswer("puppy")
		.sleepinRegistrationPage(2000)
		.preferedLanguage("English")
		.firstName("Balaji")
		.middleName("gandikota")
		.lastName("golla")
		.gender("Male")
	    .sleepinRegistrationPage(2000)
		.year("1986")
		.month("July")
		.date("10")
		.occupation("Public")
		.martialStatus("Married")
		.country("India")
		.sleepinRegistrationPage(2000)
		.email("balaji3341@il.com")
		.mobile("3921312312")
		.nationality("Indian")
		.sleepinRegistrationPage(2000)
		.address("3-3499")
		.address1("tapovanam")
		.area("tapovanam")
		.pinCode("515001")
		.sleepinRegistrationPage(2000)
		.city("Ananthapur")
		.postOffice("Anantapur H.O")
		.phoneNumber("4125123")
		.copyAddress("N")
		.address("3-3499")
		.address1("tapovanam")
		.area("tapovanam")
		.pinCode("515001")
		.sleepinRegistrationPage(3000)
		.city("Ananthapur")
		.postOffice("Anantapur H.O")
		.phoneNumber("4125123")
		.acceptTermsAndConditions("")
		.register("REGISTER");
		
		
	}
	
	
}
