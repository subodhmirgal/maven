package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Register_page extends BaseClass {
	
	private static WebElement element = null;
	
	public Register_page(WebDriver driver){
    	super(driver);
	}
	 
	 public static WebElement registration_email(){
	 
	    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[1]/div/input"));
	    Log.info("emaild entered");
	    return element;
	 
	    }
	 
	 public static WebElement registration_password() {
		 
		 element=driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[2]/div/input"));
		 Log.info("password enetered");
		 return element;
	 }
	 
	 @SuppressWarnings("unused")
	public static WebElement registration_checkbox() {
		 
		 element=driver.findElement(By.name("newsletter"));
		 
		 boolean bValue = false;
		 bValue = element.isSelected();
		 
		 if (bValue=true) {
			 
			 element.click();
		 }
		 else {
			 
			 Log.info("checkbox opted");
			 element.click();
			 
		 }
		 
		 return element;
	 }
	 

	 public static WebElement registration_button() {
		 
		 element=driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[7]/button/div"));
		 Log.info("registration submitted");
		 return element;
	 }
	 
	 public static WebElement passworderror_message(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[2]/div/div[2]/span"));
		    Log.info("minimum 8 character password required message displayed");
		    
		    }
		 catch (Exception e){
	    		Log.error("minimum 8 character password required message not displayed");
	    		throw(e);
		 }
		 return element;
		 
	}


}
