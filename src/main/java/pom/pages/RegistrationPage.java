package pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	//Enter userName 
	public RegistrationPage enterUserName(String data) {
		enterById("userName", data);
		return this;
	}
	
	//enter PassWord
	
	public RegistrationPage enterPassword(String data)
	{
		
		enterByIdPassword("usrPwd", data);
		return this;
		
	}
	
	//Confirm Password
	public RegistrationPage confirmPassword(String data)
	{
		
		enterByIdPassword("cnfUsrPwd", data);
		return this;
	}
	
	//Select SecurityQuestion
	public RegistrationPage  selectSecurityQuestion(String data)
	
	{
		selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[5]/div[2]/p-dropdown/div/label", data);
		return this;
			
	}
	
	//Select Security Answer 
	public RegistrationPage securityAnswer(String data)
	
	{
		enterByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[5]/div[4]/input", data);
		return this;
	}
	
	//Select PreferedLanguage 
	public RegistrationPage preferedLanguage(String data)
	
	{
	selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[6]/div[2]/p-dropdown/div/label", data);
		
		return this;
	}
	
	//enter firstName
	public RegistrationPage firstName(String data)
	
	{
	
		enterById("firstName", data);
		
		return this;
	}
	
	//Enter middleName
	public RegistrationPage middleName(String data)
	{
		
		enterById("middleName", data);
		return this;
	}	
	
	//Enter lastName
	public RegistrationPage lastName(String data)
	{
		
		enterById("lastname", data);
		return this;
	}	
	
	//enter Gender
	public RegistrationPage gender(String data)
	{
		
	    clickById("M");
		return this;
	}	
		
	
	//select Date textbox
	public RegistrationPage selectDate(String data)
	{
		
	   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/div");
		return this;
	}
	
	
	//select year dropdown
	public RegistrationPage year(String data)
	{
		
	   selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/div/div/div/select[2]", data);
		return this;
	}
	
	//select month dropdown
	
		public RegistrationPage month(String data)
		{
			
		   selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/div/div/div/select[1]", data);
			return this;
		}
		
		//select date 
		
		public RegistrationPage date(String data)
		{
			
		   selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/div/table/tbody/tr[2]/td[4]/a", data);
			return this;
		}
	
	
	// Add Remover	
	public RegistrationPage addRemover(String data)
	{
		
	   adRemover();
		return this;
	}
	
	//select occupation 
	public RegistrationPage occupation(String data)
	{
		
	 selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/label", data); 
		return this;
	}
	
	
	
	//Select martialStatus
	public RegistrationPage martialStatus(String data)
	{
		
	    clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[11]/div[2]/label[1]/input");
	    
		return this;
	}	
	
	//Select country
	public RegistrationPage country(String data)
	{
		
	selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[12]/div[2]/select", data);

		return this;
	}	
	
	//Select email
	public RegistrationPage email(String data)
	{
		
     enterById("email", data);

		return this;
	}	
	

	//Select mobile
	public RegistrationPage mobile(String data)
	{
		
     enterById("mobile", data);

		return this;
	}	

	//Select Nationality
	public RegistrationPage nationality(String data)
	{
		
   selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[13]/div[5]/select", data);
		return this;
	}	
	
	
	//enter address flat
    public RegistrationPage address(String data)
		{
			
	     enterById("resAddress1", data);

			return this;
		}
		
		//enter  address1 lane 
	 public RegistrationPage address1(String data)
		{
					
		enterById("resAddress2", data);

		return this;
		}	
		//enter area
	 public RegistrationPage area(String data)
		{
					
		enterById("resAddress3", data);

		return this;
		}
	 
	//enter pinCode
		 public RegistrationPage pinCode(String data)
			{
						
		enterByName("resPinCode", data);

			return this;
			}
		 
		 
	//enter state
		public RegistrationPage state(String data)
		{
								
			enterById("resState", data);

		return this;
		}
		
		//enter City
		public RegistrationPage city(String data)
			{
										
	         selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[17]/div[4]/select", data);

			return this;
			}
		
		//enter postoffice
		public RegistrationPage postOffice(String data)
				{
										
	            selectVisibileTextByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[18]/div[2]/select", data);

				return this;
				}
						
		 
	   //enter phonenumber
		public RegistrationPage phoneNumber(String data)
		{
								
			enterById("resPhone", data);

		return this;
		}			  
	
		 
		   //click copy address
			public RegistrationPage copyAddress(String data)
			{
									
          clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[19]/div[2]/input");

			return this;
			}	
			
	//click acceptTermsAndConditions
		public RegistrationPage acceptTermsAndConditions(String data)
		{
											
		   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[22]/div/input");

		return this;
		}			  
		
		
		//click clickRegister
				public RegistrationPage register(String data)
				{
													
				   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[24]/div[1]/button/b");

				return this;
				}			  
						
				//click Sleep
				public RegistrationPage sleepinRegistrationPage(int data)
				{
													
				sleep(data);

				return this;
				
				}			  
						
		
		
}
