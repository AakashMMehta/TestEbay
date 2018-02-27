//Code for Page base class which will be going to extended by all other pages
package pageBase;

import org.openqa.selenium.WebDriver;

public class PageBase 
{
	//Selenium Driver Initilization
	
	public WebDriver driver;
	
	public PageBase(WebDriver driver)
	{
		
		this.driver = driver;
		
	}	
	

}
