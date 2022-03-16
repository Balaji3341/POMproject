package pom.pages;

import wrappers.GenericWrappers;

public class Nvsppage extends GenericWrappers
{
	
	// Click on the side menu
	
	public Nvsppage clickMenu(String data)
	
	{
		clickByXpath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]/i");
		return this;
		
	}
	
	
				
				

}
