package generic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends UtilityMethod {
	// changed in pom.xml
	@BeforeSuite
	public void connectserver() {
		Reporter.log("connection to the server", true);
	}

	@BeforeTest
	public void connectDatabase() {
		Reporter.log("open the browser", true);
	}

	@BeforeClass
	public void open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterTest
	public void disconnectDatabase() {
		Reporter.log("disconnect data base", true);
	}

	@AfterSuite
	public void disconnectSerever() {
		Reporter.log("disconnection to server", true);
	}
}
