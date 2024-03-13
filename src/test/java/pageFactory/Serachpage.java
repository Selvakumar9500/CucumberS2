package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Serachpage {

	@FindBy(xpath="//input[@id='small-searchterms']")
	static WebElement search;
	
	@FindBy(xpath="//input[@value='Search']")
	static WebElement user_demowebshop_search_button_click;

	@FindBy(xpath="//a[normalize-space()='14.1-inch Laptop']")
	static WebElement list;
	
	
	public void product(String find) {
		
		search.sendKeys(find);
		
	}
		
	public void clicksearch () {
		
		user_demowebshop_search_button_click.click();
		
	}	

	public void productlist() {
		
		
		list.click();
		
	}	
	
	
	

}
