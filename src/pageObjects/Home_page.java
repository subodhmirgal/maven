package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Home_page extends BaseClass {
	
	public Home_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static WebElement element = null;
	
	
	 public static WebElement home_message(){
	 try {
	    element = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[1]/div/div[2]/button/div"));
	    Log.info("logged in successfully :we are at home page");
	    
	    }
	 catch (Exception e){
    		Log.error("welcome message not found on the home Page");
    		throw(e);
	 }
	 return element;
	 
}
	 public static WebElement logout_optionexpand(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id='main-header']/div[1]/div/div[2]/button/div/i"));
		    Log.info("arrow clicked in successfully :we are at home page");
		    
		    }
		 catch (Exception e){
	    		Log.error("arrowe not found on the home Page");
	    		throw(e);
		 }
		 return element;
		 
	}
	 
	 public static WebElement logout_btn(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id='main-body']/ul[1]/li[4]/button"));
		    Log.info("sign out button clicked in successfully :we are at home page");
		    
		    }
		 catch (Exception e){
	    		Log.error("sign out button  not found on the home Page");
	    		throw(e);
		 }
		 return element;
		 
	}
	 
	 

}
	


