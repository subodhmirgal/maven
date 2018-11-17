package MavenSample;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.Negative_module;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Negative_TC03 {
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
	  public void IncorrectPassword_Scenario() throws Exception {
		  Log.startTestCase(sTestCaseName);
		  Negative_module.Execute(iTestCaseRow);
		  Log.endTestCase(sTestCaseName);
		  if (BaseClass.bResult=false) {
			  Utils.takeScreenshot(driver, sTestCaseName);
		  }
	  }
	
	@AfterMethod
	public void afterMethod() {
		  
	      driver.close();

	      }
	  
	
	}



