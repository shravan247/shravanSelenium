package ExtentReport;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Program {
	@Test
	public void report() {
		
		ExtentSparkReporter esp=new ExtentSparkReporter("C:\\Users\\shrad\\eclipse-workspace\\MavenSelenium\\ExtentReport\\MyReport.html");
		ExtentReports er=new ExtentReports();
		er.attachReporter(esp);
		ExtentTest test= er.createTest("Program");
		test.log(Status.INFO, "TEst case attached with extent report");
        er.flush();
	}
}