package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageBase.TestBase;
import pages.EbayHomePage;

public class TestAddToCart extends TestBase
{
	//creating Base Page object
	EbayHomePage home;
	
	@BeforeTest
	public void init()
	{
		//calling base object
		home = new EbayHomePage(driver);
	}
	
	@Test
	public void loginEbay() throws IOException
	{
		//Calling all test functions
		home.onclickSignIN().oncompleteSignIn().SearchProduct().selectProduct().ProductAction();
	}		
	
	
	
}
