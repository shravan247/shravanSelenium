package ExtentReport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportWithSSCREENSHOT {

	@Test
	public void report() {
		
		//getscreenshot
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String screenshot=driver.getScreenshotAs(OutputType.BASE64);
		
		//from here Extent report code (steps in notes)
		ExtentSparkReporter esp=new ExtentSparkReporter("C:\\Users\\shrad\\eclipse-workspace\\MavenSelenium\\ExtentReport\\MyReport.html");
		ExtentReports er=new ExtentReports();
		er.attachReporter(esp);
		ExtentTest test= er.createTest("Program");
		test.log(Status.INFO, "TEst case attached with extent report");
		
		test.addScreenCaptureFromBase64String(screenshot);
        er.flush();
	}
}
