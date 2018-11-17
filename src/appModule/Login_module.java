package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.BaseClass;
import pageObjects.Home_page;
import pageObjects.Launch_page;
import pageObjects.Login_page;
import utility.Constant;
import utility.ExcelUtils;

public class Login_module extends BaseClass{
	
	public Login_module(WebDriver driver) {
		super(driver);
	
	}

	public static void Execute(int iTestCaseRow) throws Exception{
		
		Launch_page.login_link().click();
		String userid=ExcelUtils.getCellData(iTestCaseRow, Constant.Last_emailId);
		Login_page.login_email().sendKeys(userid);
		
		String password=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		Login_page.login_password().sendKeys(password);
		
		Login_page.login_btn().click();
		String expected_login_message=Home_page.home_message().getText();
		System.out.println(expected_login_message);
		String actual_result=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_firstname)+" "+ExcelUtils.getCellData(iTestCaseRow, Constant.Col_sirname);
		
		if (expected_login_message.equalsIgnoreCase(actual_result)) {
			BaseClass.bResult=true;
			ExcelUtils.setCellData("Logged in successfully", iTestCaseRow, Constant.loginstatus);
		}
		else {
			BaseClass.bResult=false;
			ExcelUtils.setCellData("login failed", iTestCaseRow, Constant.loginstatus);
		
		
		}
		
		
	}

}
