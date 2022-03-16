package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReporter {
	
	@Test
	public void sampleReport() {
		
		//1 creating a report
		ExtentReports report = new ExtentReports("./reports/samplereport.html");
	
		
		// 2 creating a test 
		ExtentTest test = report.startTest("TC001", "Sample");
	
		
		//3 logging the status 
		test.log(LogStatus.PASS, "Sample Step passed");
		test.log(LogStatus.FAIL, "Sample Step failed");
		
		test.assignAuthor("Balaji");
		test.assignCategory("Initial Dry Run");
		
		// 4 ed test
		report.endTest(test);
		
		
		// 5 end report
		report.flush();
		
		
	}

}
