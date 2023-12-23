package project1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class licTest {
	@Test
	public void lic( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://licindia.in/");
	}
}
