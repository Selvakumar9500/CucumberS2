package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Loginpage;

public class LoginStepDefs {

	

	WebDriver driver;
	Loginpage lp;

	SharedSteps s ;
	
	public LoginStepDefs (SharedSteps s) {
		this.s = s;
	}
	
	@Given("User is on Chrome browser and enters the URL")
	public void user_is_on_chrome_browser_and_enters_the_url() 
		
		{
		
		    driver = s.getDriver();
		    lp=PageFactory.initElements(driver, Loginpage.class);
			driver.get("https://demowebshop.tricentis.com/login");
			
		}

	@When("User is on demowebshop login and enter {string}")
	public void user_is_on_demowebshop_login_and_enter(String Email) 
	
	{
		lp.Emailsendkey(Email);
	}
	
	
	@Then("User demowebshop Enter {string}")
	public void user_demowebshop_enter(String password) throws InterruptedException {
		lp.passwordsendkey(password);
		
	}

	
	@Then("user click Login closes the browser")
	public void user_click_Login_closes_the_browser() throws InterruptedException {
		
		lp.ClickKey();
		
		 
	}
	
	
	
}
