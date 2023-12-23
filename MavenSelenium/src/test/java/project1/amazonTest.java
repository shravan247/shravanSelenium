package project1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonTest {
@Test
public void amazon( ) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
}
