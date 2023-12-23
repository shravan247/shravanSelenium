package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Basepage{

		//step2:constructor
				public RegistrationPage(WebDriver driver) {
				//supercall should be the 1st statement	
					super(driver);
					
				}
			
		@FindBy(id="gender-male")
		private WebElement gender;
		@FindBy(id="FirstName")
		private WebElement firstname;
		@FindBy(id="LastName")
		private WebElement lastname;
		@FindBy(id="Email")
		private WebElement email;
		@FindBy(id="Password")
		private WebElement password;
		@FindBy(id="ConfirmPassword")
		private WebElement confirmpassword;
		@FindBy(id="register-button")
		private WebElement reegisterbutton;
		public WebElement getGender() {
			return gender;
		}
		public WebElement getFirstname() {
			return firstname;
		}
		public WebElement getLastname() {
			return lastname;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getConfirmpassword() {
			return confirmpassword;
		}
		public WebElement getReegisterbutton() {
			return reegisterbutton;
		}
	
		}
