package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

public class Launch_page extends BaseClass{
	
	
	public Launch_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static WebElement element = null;
	
	
	 public static WebElement login_link(){
	 try {
	    element = driver.findElement(By.xpath("//a[@href='https://my.bonify.de/login/']"));
	    Log.info("cliked on register button");
	    
	    }
	 catch (Exception e){
    		Log.error("login_link is not found on the home Page");
    		throw(e);
	 }
	 return element;
	 
}}
	