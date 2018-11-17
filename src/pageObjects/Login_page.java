package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Login_page extends BaseClass {
	private static WebElement element = null;
	
	public Login_page(WebDriver driver){
    	super(driver);
	}
	 
	 public static WebElement register(){
	 try {
	    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/div[4]/div[2]/a/button/div"));
	    Log.info("cliked on register button");
	    
	    }
	 catch (Exception e){
    		Log.error("register button is not found on the login Page");
    		throw(e);
    		}
		 
	 return element;
	 }
	 
	 public static WebElement login_email(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/div[1]/input"));
		    Log.info("login id entered");
		    
		    }
		 catch (Exception e){
	    		Log.error("login_email not found on the login Page");
	    		throw(e);
	    		}
			 
		 return element;
		 }
	 public static WebElement login_password(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/div[2]/input"));
		    Log.info("password entered");
		    
		    }
		 catch (Exception e){
	    		Log.error("login_password not found on the login Page");
	    		throw(e);
	    		}
			 
		 return element;
		 }
	 
	 public static WebElement login_btn(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/div[4]/div[1]/button/div"));
		    Log.info("clicked login button");
		    
		    }
		 catch (Exception e){
	    		Log.error("login_btn not found on the login Page");
	    		throw(e);
	    		}
			 
		 return element;
		 }
	 public static WebElement incorrectUserID_Password_message(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/p"));
		    Log.info("IncorrectUserId password message");
		    
		    }
		 catch (Exception e){
	    		Log.error("IncorrectUserId password message not found on the login Page");
	    		throw(e);
	    		}
			 
		 return element;
		 }
	 
	 public static WebElement blank_Password_message(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/div[2]/div[2]/span"));
		    Log.info("blank password message");
		    
		    }
		 catch (Exception e){
	    		Log.error("blank password message not found on the login Page");
	    		throw(e);
	    		}
			 
		 return element;
		 }
	 
	 public static WebElement blank_UserId_message(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/div[1]/div[2]/span"));
		    Log.info("blank userid message");
		    
		    }
		 catch (Exception e){
	    		Log.error("blank userid message not found on the login Page");
	    		throw(e);
	    		}
			 
		 return element;
		 }
	 
	 public static WebElement forgot_password(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/form/div[3]/a/span"));
		    Log.info("clicked on forgot password");
		    
		    }
		 catch (Exception e){
	    		Log.error("forgot password not found on the login Page");
	    		throw(e);
	    		}
			 
		 return element;
		 }
	 }
	 

