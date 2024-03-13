package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Serachpage;

public class SearchStepDefs {

	WebDriver driver;
	Serachpage sp;
	SharedSteps sl ;
	
	public  SearchStepDefs (SharedSteps s) {
		this.sl = s;
		
	}
	
	@Given("User is on Chrome browser and enters the home URL")
	public void user_is_on_chrome_browser_and_enters_the_home_url() 
		
		{
		
		    driver = sl.getDriver();
		    sp=PageFactory.initElements(driver, Serachpage.class);
			driver.get("https://demowebshop.tricentis.com/");
			
		}
	

	@When("User is on demowebshop login and search enter {string}")
	public void user_is_on_demowebshop_login_and_search_enter(String search) 
	{
	   sp.product(search); 
	}
	
	@Then("User demowebshop Search button click")
	public void user_demowebshop_search_button_click() {
	    sp.clicksearch();
	}

	@Then("user click product and closes the browser")
	public void user_click_product_and_closes_the_browser() {
	  sp.productlist();
	}
	
	
	
}
