package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporter {

	public ExtentReports extent;
	public ExtentTest test;
	public String testcaseName, testcaseDescription, testcaseAutor, testCaseCateogeory;
	
	public void startReport() 
	{
		ExtentReports extent = new ExtentReports("./reports/report.html", false);
	}
	
	public void startTest(String testName, String description)
	{
		test = extent.startTest(testName, description);
	}
	
	public void logStatus(String status, String desc)	{
		
		long number = takeSnap();
		if(status.equalsIgnoreCase("pass"))
		{
			test.log(LogStatus.PASS, desc+test.addScreenCapture("../screenshots/snap"+number+".jpg"));
		}else if(status.equalsIgnoreCase("fail"))
		{
			test.log(LogStatus.FAIL, desc+test.addScreenCapture("../screenshots/snap"+number+".jpg"));
		}
		
	}
	
	public abstract long takeSnap();
	
	
	public void endTest() 
	{
		extent.endTest(test);
	}
	
	public void endReport()
	{
		extent.flush();
	}
		
	
}
