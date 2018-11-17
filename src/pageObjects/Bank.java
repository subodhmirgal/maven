package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bank {
	private static WebElement element = null;
	 
	 public static WebElement identycard(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//span[.='mit Personalausweis fortfahren']"));
	   
	    return element;
	 
	    }
	 
	 public static WebElement oldcard(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id=\"whichId-old\"]"));
		   
		    return element;
		 
		    }
	 public static WebElement newcard(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id=\"whichId-new\"]"));
		   
		    return element;
		 
		    }
	 public static WebElement ok_btn(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[3]/button[1]/div"));
		   
		    return element;
		 
		    }
	 
	
}
