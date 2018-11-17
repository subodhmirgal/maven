package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.BaseClass;
import pageObjects.Launch_page;
import pageObjects.Login_page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class Negative_module  extends BaseClass{
	
	public Negative_module(WebDriver driver) {
		super(driver);
	
	}

	public static void Execute(int iTestCaseRow) throws Exception{
		
		Launch_page.login_link().click();
		String userid=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_emailid);
		Login_page.login_email().sendKeys(userid);
		
		String password=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		Login_page.login_password().sendKeys(password);
		
		Login_page.login_btn().click();
		String actual_error_message=Login_page.incorrectUserID_Password_message().getText();
		System.out.println(actual_error_message);
		if (actual_error_message.equalsIgnoreCase(ExcelUtils.getCellData(iTestCaseRow, Constant.expected_error_message))) {
			
			ExcelUtils.setCellData("Passed", iTestCaseRow, Constant.Col_result);
			Log.info("IncorrectUserID & password scenario passed");
		}
		else {
			System.out.println("testcase failed");
			BaseClass.bResult=false;
			ExcelUtils.setCellData("Failed", iTestCaseRow, Constant.Col_result);
			Log.info("IncorrectUserID & password scenario failed");
		
		}
		

}
	
	public static void Execute1(int iTestCaseRow) throws Exception{
		Launch_page.login_link().click();
		String userid=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_emailid);
		Login_page.login_email().sendKeys(userid);
		
		String password=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		Login_page.login_password().sendKeys(password);
		
		Login_page.login_btn().click();
		String actual_error_message=Login_page.blank_Password_message().getText();
		System.out.println(actual_error_message);
		if (actual_error_message.equalsIgnoreCase(ExcelUtils.getCellData(iTestCaseRow, Constant.expected_error_message))) {
			
			ExcelUtils.setCellData("Passed", iTestCaseRow, Constant.Col_result);
			Log.info("blank password scenario passed");
		}
		else {
			BaseClass.bResult=false;
			ExcelUtils.setCellData("Failed", iTestCaseRow, Constant.Col_result);
			Log.info("blank password scenario failed");
		
		}
		
	}
	public static void Execute2(int iTestCaseRow) throws Exception{
		Launch_page.login_link().click();
		String userid=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_emailid);
		Login_page.login_email().sendKeys(userid);
		
		String password=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		Login_page.login_password().sendKeys(password);
		
		Login_page.login_btn().click();
		String actual_error_message=Login_page.blank_UserId_message().getText();
		System.out.println(actual_error_message);
		if (actual_error_message.equalsIgnoreCase(ExcelUtils.getCellData(iTestCaseRow, Constant.expected_error_message))) {
			 
			ExcelUtils.setCellData("Passed", iTestCaseRow, Constant.Col_result);
			Log.info("blank userId scenario passed");
		}
		else {
			BaseClass.bResult=false;
			ExcelUtils.setCellData("Failed", iTestCaseRow, Constant.Col_result);
			Log.info("blank userId scenario failed");
		
		}
		
	}


}
