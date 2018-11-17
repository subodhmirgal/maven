package MavenSample;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.Forgot_password;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class ForgotPassword_TC06 {
	public WebDriver driver;
	 
    private String sTestCaseName;
 
    private int iTestCaseRow;
	
	@BeforeMethod
	  public void beforeMethod() throws Exception {
		  
	      DOMConfigurator.configure("log4j.xml");

	      sTestCaseName = this.toString();

	      sTestCaseName = Utils.getTestCaseName(this.toString());

	     Log.startTestCase(sTestCaseName);

	     ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

	     iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
	     driver = Utils.openBrowser(iTestCaseRow);
	     driver.manage().window().maximize();
	     new BaseClass(driver); 
	     
	     }
	
	@Test(priority=1)
	
	  public void forgotpassword_Scenario() throws Exception {
		try {
		  Log.startTestCase(sTestCaseName);
		  Forgot_password.Execute(iTestCaseRow);
		  Log.endTestCase(sTestCaseName);
			 
		  }
		  catch(Exception e) {
			  Log.error(e.getMessage());
			  Utils.takeScreenshot(driver, sTestCaseName);
			  
		  }
	  }
	
	@AfterMethod
	public void afterMethod() {
		  
	      driver.quit();

	      }

	}



