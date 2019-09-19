package utils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.SetUp;

public class CommonOperations {
	
	
  WebDriver driver;
  //constructor for common operations class
  protected CommonOperations(WebDriver driver) {
		
		this.driver = driver;	
		
	}
	
	public String getPageTitle(){
	
	    return  driver.getTitle();
	
	 }

	
  public boolean webElementIsDisplayed(WebElement element) {
  
	 if(element.isDisplayed()) {
		 
		 return false;
		 
	 }
		 
		 return true; }
  
  public boolean webElementIsDisplayed(List<WebElement> elements) {
	  boolean a = false;
	  	for (WebElement element: elements) {
	  		
	  		if(element.isDisplayed()) {
	  			
	  			a =  true;
	  		}  	
	  	
	  	}
	  
	  
	  return a;
	  
  }
 
	public void sendText(WebElement element,String text) {
		
		element.sendKeys(text);		
		
	}
	
	public void elementClick(WebElement element) {
		
		element.click();
	}

	public boolean elementIsChecked(WebElement element) {
		
		if(element.isSelected()) {
			
			return true;
		}
		
		return false;
	}
}
