package pom.testcases;

import org.junit.Test;

import pom.pages.Accomdation;
import pom.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers

{
	@Test
	public void tc005()
	
	{
		Homepage obj = new Homepage();
		obj.clickOnSideMenu()
		.clickonStays();
		Accomdation obj2=new Accomdation();
	    obj2.stationName("NEW DELHI")
	    .loungeType("IRCTC TRAVELERS EXECUTIVE LOUNGE")
	    .loungePassengers("3")
	    .loungeTextBox()
	    .loungeYear()
	    .loungeMonth()
	    .LoungeDate()
	    .checkInTime("02:00")
	    .checkOutTime("12:00")
	    .clickBook()
	    .clickGuestUserLogin()
	    .email("balaji3341@gmail.com")
	    .mobileNo("9986726268")
	    .clickGuestLogin();
	    
	    
	    
	 
		
	}
	

}
