package appModule;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.BaseClass;
import pageObjects.Launch_page;
import pageObjects.Login_page;
import pageObjects.PersonalDetails_page;
import pageObjects.Register_page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class Register_account extends BaseClass {
	public Register_account(WebDriver driver) {
		super(driver);
	}

	public static void Execute(int iTestCaseRow) throws Exception{
		 
		   Launch_page.login_link().click();
		 	
		    Login_page.register().click();
		    int number=ThreadLocalRandom.current().nextInt(500);
		    String registration_emailId = number+ExcelUtils.getCellData(iTestCaseRow,Constant.Col_emailid);
		    Log.info(registration_emailId);
		    System.out.println(registration_emailId);
		    ExcelUtils.setCellData(registration_emailId, iTestCaseRow,Constant.Last_emailId);
		    
			String registration_pwd = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		    
		    Register_page.registration_email().sendKeys(registration_emailId);
		    Register_page.registration_password().sendKeys(registration_pwd);
		    Register_page.registration_checkbox();
		    Register_page.registration_button().click();
		    
		    System.out.println(driver.getTitle());
		   
		    if ("bonify".equalsIgnoreCase(driver.getTitle()))
		    
		   {
		    	BaseClass.bResult=true;
			   ExcelUtils.setCellData("Passed", iTestCaseRow,Constant.Col_result);
		   }
			   
		   else {
			   BaseClass.bResult=false;
			   ExcelUtils.setCellData("failed", iTestCaseRow,Constant.Col_result);
		   }
		    
		    
		    
		    String gender=ExcelUtils.getCellData(iTestCaseRow,Constant.gender);
		    
		    if (gender.equalsIgnoreCase("male"))
		    {
		    	 PersonalDetails_page.malegender_radiobtn().click();
		    }
		    else{
		    	 PersonalDetails_page.femalegender_radiobtn().click();
		    }
		    PersonalDetails_page.title_dropdown();
		    
		    
		    String firstname=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_firstname);
		    PersonalDetails_page.firstname().sendKeys(firstname);
		    
		    String lastname=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_sirname);
		    PersonalDetails_page.lastname().sendKeys(lastname);
		    
		    String DOB=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DOB);
		    PersonalDetails_page.DOB().sendKeys(DOB);
		    
		    String street=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_street);
		    PersonalDetails_page.street().sendKeys(street);
		    
		    String housenumber=ExcelUtils.getCellData_int(iTestCaseRow, Constant.Col_housenumber);
		    PersonalDetails_page.housenumber().sendKeys(housenumber);
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    String postcode=ExcelUtils.getCellData_int(iTestCaseRow, Constant.Col_postcode);
		    PersonalDetails_page.postcode().sendKeys(postcode);
		    
		    String city=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_city);
		    PersonalDetails_page.city().sendKeys(city);
		    
		    PersonalDetails_page.submit_btn().click();
		    
		    /*Bank.identycard(driver).click();
		    Bank.oldcard(driver).click();
		    Bank.ok_btn(driver).click();
		    */
	}
	
	public static void Execute1(int iTestCaseRow) throws Exception{
		 
		   Launch_page.login_link().click();
		 	
		    Login_page.register().click();
		    int number=ThreadLocalRandom.current().nextInt(500);
		    String registration_emailId = number+ExcelUtils.getCellData(iTestCaseRow,Constant.Col_emailid);
		    Log.info(registration_emailId);
		    System.out.println(registration_emailId);
		    ExcelUtils.setCellData(registration_emailId, iTestCaseRow,Constant.Last_emailId);
		    
			String registration_pwd = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		    
		    Register_page.registration_email().sendKeys(registration_emailId);
		    Register_page.registration_password().sendKeys(registration_pwd);
		    Register_page.registration_checkbox();
		    Register_page.registration_button().click();
		    String actual_message=Register_page.passworderror_message().getText();
		    System.out.println(actual_message);
		    String expected_message=ExcelUtils.getCellData(iTestCaseRow, Constant.expected_error_message);
		    if (actual_message.equalsIgnoreCase(expected_message)) {
		    	ExcelUtils.setCellData("Passed",iTestCaseRow,Constant.Col_result);
		    }
		    else {
		    	ExcelUtils.setCellData("Failed",iTestCaseRow,Constant.Col_result);
		    	
		    	
		    }
		    
		    

}
}
