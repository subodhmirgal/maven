package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.BaseClass;
import pageObjects.Home_page;
import utility.Log;

public class Logout_module extends BaseClass {
	
	public Logout_module(WebDriver driver) {
		super(driver);
	
	}
	public static void Execute(int iTestCaseRow) throws Exception{
		
		Home_page.logout_optionexpand().click();
		Home_page.logout_btn().click();
		
		Log.info("Signed out successfully");
	}

}
