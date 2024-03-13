package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedSteps {

	WebDriver driver;
	@Before()
	public void Setup() {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\selva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

	@Before()
	public void Setupsearch() {


		System.setProperty("webdriver.gecko.driver","C:\\Users\\selva\\Downloads\\fire\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}


		public WebDriver getDriver() 
		{
			return driver;
		}
		
		
		public WebDriver firefoxgetDriver() 
		{
			return driver;
		}
		
	@After
	public void teardown()
	{
		driver.close();

	}
	
	
}
