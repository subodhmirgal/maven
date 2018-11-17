package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.BaseClass;
import pageObjects.Launch_page;
import pageObjects.Login_page;
import pageObjects.SendEmail_page;
import utility.Constant;
import utility.ExcelUtils;

public class Forgot_password extends BaseClass {
	
	public Forgot_password(WebDriver driver) {
		super(driver);
	
	}

	public static void Execute(int iTestCaseRow) throws Exception{
		
		Launch_page.login_link().click();
		Login_page.forgot_password().click();
		
		String emailid=ExcelUtils.getCellData(iTestCaseRow, Constant.Last_emailId);
		SendEmail_page.enter_email().sendKeys(emailid);
		SendEmail_page.sendmemail_btn().click();
		
		String actual_result=SendEmail_page.sendemail_confirmation().getText();
		System.out.println(actual_result);
		String expected_result=ExcelUtils.getCellData(iTestCaseRow, Constant.expected_error_message);
		if (actual_result.equalsIgnoreCase(expected_result)) {
			ExcelUtils.setCellData("Passed", iTestCaseRow, Constant.Col_result);
		}
		else {
			ExcelUtils.setCellData("Failed", iTestCaseRow, Constant.Col_result);
			
		}
	}
		

}
