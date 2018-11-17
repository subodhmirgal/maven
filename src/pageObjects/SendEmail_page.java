package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SendEmail_page extends BaseClass {
	public SendEmail_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static WebElement element = null;
	
	
	 public static WebElement enter_email(){
	 try {
	    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/form/div[1]/div/input"));
	    Log.info("email id enetered");
	    
	    }
	 catch (Exception e){
    		Log.error("email id field not found");
    		throw(e);
	 }
	 return element;
	 
}
	 public static WebElement sendmemail_btn(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/form/div[2]/div/button/div"));
		    Log.info("email id sent button clicked");
		    
		    }
		 catch (Exception e){
	    		Log.error("email id send button not found");
	    		throw(e);
		 }
		 return element;
		 
	}
	 public static WebElement sendemail_confirmation(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/p"));
		    Log.info("email id sent");
		    
		    }
		 catch (Exception e){
	    		Log.error("email id send button not found");
	    		throw(e);
		 }
		 return element;
		 
	}
	 
	 
	 

}
