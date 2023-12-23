package project1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntraTest {
	@Test
	public void myntra( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
	}
}
