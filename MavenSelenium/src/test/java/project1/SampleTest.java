package project1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void testcase() {
		Reporter.log("My first maven ", true);
	}
}
