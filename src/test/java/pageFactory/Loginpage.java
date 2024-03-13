package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	
@FindBy(xpath="//input[@id='Email']")
static WebElement Email;

@FindBy(xpath="//input[@id='Password']")
static WebElement user_demowebshop_Enter_Password;

@FindBy(xpath="//input[@value='Log in']")
static WebElement user_click_Login_closes_the_browser;


public void Emailsendkey(String em) {
	
	Email.sendKeys(em);
	
}
	
public void passwordsendkey(String ps) {
	
	user_demowebshop_Enter_Password.sendKeys(ps);
	
}	

public void ClickKey() {
	
	user_click_Login_closes_the_browser.click();
	
}	


}

