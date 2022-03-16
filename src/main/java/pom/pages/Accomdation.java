package pom.pages;

import wrappers.GenericWrappers;

public class Accomdation extends GenericWrappers

{
	
	public Accomdation LoungeSideMenu()
	{
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i");
		return this;
	}
	

	//select StationName 
		public Accomdation stationName(String data) {
     
             selectVisibileTextByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[1]/select", data);
			return this;
		}
		
	
		//select loungeType 
				public Accomdation loungeType(String data) {
		     
		             selectVisibileTextByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[2]/select", data);
					return this;
				}
				

	//select passengers 
		public Accomdation loungePassengers(String data) 
		{
				     
		 selectVisibileTextByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[2]/select", data);
		 return this;
		}
		
		//select dob textbox 
		public Accomdation loungeTextBox() 
		{
				     
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[4]/input");
		 return this;
		}
			
		//select year textbox 
		public Accomdation loungeYear() 
		{
						     
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[4]/div/div/table/thead/tr[1]/th[1]/span[1]/i");
		return this;
		}
		
		//select month  
		public Accomdation loungeMonth() 
		{
						     
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[4]/div/div/table/thead/tr[1]/th[3]/span[1]");
		return this;
		}	
		
		//select date textbox 
		public Accomdation LoungeDate() 
		{
								     
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[4]/div/div/table/tbody/tr[3]/td[4]/span");
		return this;
		}
		
		
		//click on Book button
		public Accomdation clickBook() 
		{
								     
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[12]/button[2]");
		return this;
		}
		  
		
		     
				//select checkInTime  
				public Accomdation checkInTime(String data) 
				{
										     
				selectVisibileTextByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[6]/select",data);
				return this;
				}
				
				//select checkOutTime  
				public Accomdation checkOutTime(String data) 
				{
										     
				selectVisibileTextByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[6]/select",data);
				return this;
				}
				//click on Guestuser login 
				public Accomdation clickGuestUserLogin() 
				{
										     
				clickByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/ul/li[2]/a");
				return this;
				}
				
				//enter on email
				public Accomdation email(String data) 
				{
										     
				enterByXpath("//*[@id=\"gulogin-form\"]/div/div[1]/input", data);
				return this;
				}
				
				//enter on mobileNo
				public Accomdation mobileNo(String data) 
				{
										     
				enterByXpath("//*[@id=\"gulogin-form\"]/div/div[2]/input", data);
				return this;
				}  
		
				//clicklogin
				public Accomdation clickGuestLogin() 
				{
										     
			    clickByXpath("//*[@id=\"login-form\"]/div[1]/div[3]/button");
				return this;
				}  
		
			
			
				
				//select gst
				public Accomdation gst(String data) 
				{					     

                selectVisibileTextByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[3]/div[2]/select", data);
				return this;
				}
				
				//Enter age
				public Accomdation age(String data) 
				{					     
                 
                enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[3]/input", data);
				return this;
				}
				
				//Enter gender
				public Accomdation gender(String data) 
				{					     
                 
                enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[4]/select", data);
				return this;
				}
				
				

				//click submit
				public Accomdation submit() 
				{					     
                 
                clickByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[6]/button[3]");
				return this;
				}
					

				//click checkbox
				public Accomdation checkBox() 
				{					     
                 
                clickByXpath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[6]/div/label");
				return this;
				}
					
				//click makePayment
				public Accomdation makePayment() 
				{					     
                 
                clickByXpath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[7]/button");
				return this;
				}
				
				

				// Click SideclickMenu
				public Accomdation SideclickMenuAccomdation()
				
				{
					clickByXpath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]/i");
					return this;
					
				}
				

				// Click on the charter
					public Accomdation clickCharter()
					
					{
						clickByXpath("//*[@id=\"slide-out\"]/ul/li/ul/li[10]/a");
						return this;
						
					}
					
					// Click on the enquiry form
					public Accomdation clickEnquiryForm()
					
					{
						clickByXpath("//*[@id=\"Enquiry-tab-just\"]");
						return this;
						
					}
					
					
					// Click on the enquiry form
					public Accomdation usernameSaloon(String data)
					
					{
						enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[3]/input", data);
						return this;
						
					}
				
					
					// Click on the organisation 
					public Accomdation organisation(String data)
					
					{
						enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[4]/input", data);
						return this;
						
					}
				
					// Click on the address 
					public Accomdation addressCharter(String data)
					
					{
						enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[5]/input", data);
						return this;
						
					}
				
					// Click on the mobileno 
					public Accomdation mobileNoSaloon(String data)
					
					{
						enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[6]/input", data);
						return this;
						
					}
				
				
					// Click on the email 
					public Accomdation emailSaloon(String data)
					
					{
						enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[7]/input", data);
						return this;
						
					}
				
					
					// Click on the sleep 
							public Accomdation sleep(String data)
							
							{
								sleep(data);
								return this;
								
							}
							
							
					    // select saloon charter 
					      public Accomdation selectSaloonDropDown(String data)
							
							{
								selectVisibileTextByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[8]/select", data);
						     return this;
								
							}
							
						    // enter  orignStation 
					      public Accomdation orignStation(String data)
							
							{
								enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[9]/input", data);
						     return this;
								
							}
					      
						    // enter  destnStation 
					      public Accomdation destnStation(String data)
							
							{
								enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[10]/input", data);
						     return this;
								
							}
					      
					    //select departure textbox
					  	public Accomdation clickDepartureTextBox()
					  	{
					  		
					  	   clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[11]/input");
					  		return this;
					  	}
					  	
					  	
					  	
					  	
					  	//select year 
					  	public Accomdation depYear()
					  	{
					  		
			                  clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[11]/div/div/table/thead/tr[1]/th[3]/span[2]/i");
					  		return this;
					  	}
					  	
					  	//select month 
					  	
					  		public Accomdation depMonth()
					  		{
					  			
				              clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[11]/div/div/table/thead/tr[1]/th[3]/span[1]");
					  			return this;
					  		}
					  		
					  		//select date 
					  		
					  		public Accomdation depDate()
					  		{
					  			
					  		   clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[11]/div/div/table/tbody/tr[1]/td[1]/span");
					  		   return this;
					  		}
					  		
					        
						    //select Arrival textbox
						  	public Accomdation clickArrivalTextBox()
						  	{
						  		
						  	   clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[12]/input");
						  		return this;
						  	}
						  	
						  	
					  		
					  		//select year 
						  	public Accomdation arrYear()
						  	{
						  		
				                  clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[12]/div/div/table/thead/tr[1]/th[3]/span[2]/i");
						  		return this;
						  	}
						  	
						  	//select month 
						  	
						  		public Accomdation arrMonth()
						  		{
						  			
					              clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[12]/div/div/table/thead/tr[1]/th[3]/span[1]");
						  			return this;
						  		}
						  		
						  		//select date 
						  		
						  		public Accomdation arrDate()
						  		{
						  			
						  		   clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[12]/div/div/table/tbody/tr[3]/td[4]/span");
						  		   return this;
						  		}
						  		
					  		
					  		
			               //select durationPeriod 
					  		
					  		public Accomdation durationPeriod(String data)
					  		{
					  			
					           enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[13]/input", data);
					  		   return this;
					  		}
					  		
					  		
			                //select noOfCoaches 
					  		
					  		public Accomdation noOfCoaches(String data)
					  		{
					  			
					  		   enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[14]/input", data);
					  		   return this;
					  		}
					  		
					  		
					  		
			                //select noPassengers 
					  		
					  		public Accomdation noPassengers(String data)
					  		{
					  			
					  		   enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[15]/input", data);
					  		   return this;
					  		}
					  		
					  		
					  		
			                //enter purposeOfCharter  
					  		
					  		public Accomdation purposeOfCharter(String data)
					  		{
					  			
					  		   enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[17]/textarea", data);
					  		   return this;
					  		}
					  		
					  		
			              //enter additionalServices 
					  		
					  		public Accomdation additionalServices(String data)
					  		{
					  			
					  		   enterByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[18]/textarea", data);
					  		   return this;
					  		}
					  		
					  		
					  		
			          //click on Submit
					  		
					  		public Accomdation clickOnsubmit()
					  		{
					  			
					  		  clickByXpath("//*[@id=\"Enquiry-just\"]/div/form/div/div[19]/button");
					  		  return this; 
					  		}
					  		
				
				
				
}
