package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadExcel;
import pom_scripts.RegistrationPage;

public class RegisterTest extends BaseTest {

	@DataProvider(name = "data")
	public static Object[][] testData() throws Throwable {
		return ReadExcel.fetchExcel();

	}

	@Test(dataProvider = "data")
	public void testcase(String fn, String ln, String em, String ps, String cps) {
		driver.findElement(By.linkText("Register")).click();
		RegistrationPage r = new RegistrationPage(driver);
		r.getGender().click();
		r.getFirstname().sendKeys(fn);
		r.getLastname().sendKeys(ln);
		r.getEmail().sendKeys(em);
		r.getPassword().sendKeys(ps);
		r.getConfirmpassword().sendKeys(cps);
		r.getReegisterbutton().click();
	}
}
