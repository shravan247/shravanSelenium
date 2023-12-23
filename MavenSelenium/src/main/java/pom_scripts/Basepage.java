package pom_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage extends generic.UtilityMethod {

	Basepage(WebDriver driver)
	{
	      PageFactory.initElements(driver, this);
	}
}
