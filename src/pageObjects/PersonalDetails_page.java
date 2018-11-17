package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class PersonalDetails_page extends BaseClass {

	private static WebElement element = null;
	
	public PersonalDetails_page(WebDriver driver){
    	super(driver);
	}
	 
	 public static WebElement malegender_radiobtn(){
	 try {
	    element = driver.findElement(By.id("gender-male"));
	    Log.info("male selected");
	    
	 
	    }
	 catch (Exception e){
    		Log.error("Male Gender radio button is not found on the registration Page");
    		throw(e);
	 }return element;
	 }
	 
	 public static WebElement femalegender_radiobtn(){
		 try {
		    element = driver.findElement(By.id("gender-female"));
		    Log.info("female selected");
		    
		 
		    } 
		 catch (Exception e){
	    		Log.error("female Gender radio button is not found on the registration Page");
	    		throw(e);
		 }
		 return element;
		 }
	 
	 public static WebElement title_dropdown() throws Exception{
		 	try{
		 		String titleinput=ExcelUtils.getCellData(1, Constant.Col_title);
		 	
		    element = driver.findElement(By.name("title"));
		    Select dropdown=new Select (element);
		    dropdown.selectByVisibleText(titleinput);
		    Log.info("title selected");
		 	}
		 	catch (Exception e){
	    		Log.error("title not found on the registration Page");
	    		throw(e);
		 }
		 return element;
		 }
		 
		    
	 public static WebElement firstname(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[3]/div/input"));
		   
		    } 
		 catch (Exception e){
	    		Log.error("firstname not found on the registration Page");
	    		throw(e);
		 }
		 return element;
		 }
	 
	 public static WebElement lastname(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[4]/div/input"));
		 
		    } 
	 catch (Exception e){
 		Log.error("lastname not found on the registration Page");
 		throw(e);
	 }
	 return element;
	 }
	 public static WebElement DOB(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[5]/div/input"));
		 
		    } 
		 catch (Exception e){
		 		Log.error("DOB not found on the registration Page");
		 		throw(e);
			 }
			 return element;
	 }
	 public static WebElement street(){
		 try {
		    element = driver.findElement(By.name("street"));
		    
		    } 
		 catch (Exception e){
		 		Log.error("street not found on the registration Page");
		 		throw(e);
			 }
			 return element;
	 }
	 public static WebElement housenumber(){
		try { 
		    element = driver.findElement(By.name("houseNumber"));
		   
		    }
	 catch (Exception e){
	 		Log.error("housenumber not found on the registration Page");
	 		throw(e);
		 }
		 return element;
	 }
	 public static WebElement postcode(){
		 try {
		    element = driver.findElement(By.name("zipCode"));
		 
		    }
		 catch (Exception e){
		 		Log.error("postcode not found on the registration Page");
		 		throw(e);
			 }
			 return element;
	 }
	 public static WebElement city(){
		 try {
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[9]/div/input"));
		   
		 
		    }
	 catch (Exception e){
	 		Log.error("city not found on the registration Page");
	 		throw(e);
		 }
		 return element;
}
	
	 
	 public static WebElement submit_btn(){
		try { 
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[10]/button[2]/div"));
		   
		 
		    }
	 catch (Exception e){
	 		Log.error("submit_btn not found on the registration Page");
	 		throw(e);
		 }
		 return element;
	 }
	 public static WebElement previous_btn(){
		try { 
		    element = driver.findElement(By.xpath("//*[@id=\"step-{{$index}}\"]/div/div/form/div[10]/button[1]/div"));
		 
		    }
		catch (Exception e){
	 		Log.error("previous_btn not found on the registration Page");
	 		throw(e);
		 }
		 return element;
	 }
		
}
