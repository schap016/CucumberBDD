package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import utils.SetUp;

public class PHPTravelsHomePageTestsStepDefinitions  {
	
	WebDriver driver;
	HomePage homePage;
	
	WebDriverWait driverwait;
	SetUp setUp = new SetUp();
	//boolean a,b,c,e,f;
	
	
	  @Before
	  public void setUp() {
	  
	  driver = setUp.SetUp(driver); 
	  homePage = PageFactory.initElements(driver, HomePage.class); 
	  driverwait = new WebDriverWait(driver, 5);
	  
	 }
	 
	  @After	  
	  public void tearDown() {
		  driver.close();

	  }
	
	  @Given("^I opened \"(.*)\" page$") 
	  public void i_opened_home_page(String url) throws Throwable { 
		  
		 // homePage = PageFactory.initElements(driver, HomePage.class);
		  driver.get(url); 
	  }
	  
	
	
	 
	  @Then("^should be redirected to \"(.*)\" page$")
		public void should_be_redirected_to_page(String title) throws Throwable {
		  
		  try {
			  
			  boolean a = false;	 
				  
					String titleFromPage = homePage.getHomePageTitle();				
					
					if (titleFromPage.equalsIgnoreCase(title)) {					
						a = true;					
					}
					
					if(a == true) {
						Assert.assertTrue(a);					
					}
					else {
						Assert.assertTrue(a);
					}
				
			  
		  }catch(Exception e) {			  
			  
			 System.out.println(e);			  
			  
		  }

		 
		}
	  
	  
	  @When("^I entered \"([^\"]*)\" as \"([^\"]*)\"$")
	  public void entered_(String info, String path) throws Throwable {		 
		
		 driver.findElement(By.name(path)).sendKeys(info);		 

	  }
	  
	  @When("^I entered registration details$")
	  public void entered_(DataTable credentials) throws Throwable {
		 
		
		  List<List<String>> values = credentials.raw();
		  driver.findElement(By.name("firstname")).sendKeys(values.get(0).get(0));
		  driver.findElement(By.name("lastname")).sendKeys(values.get(0).get(1));
		  driver.findElement(By.name("phone")).sendKeys(values.get(0).get(2));
		  driver.findElement(By.name("email")).sendKeys(values.get(0).get(3));
		  driver.findElement(By.name("password")).sendKeys(values.get(0).get(4));
		  driver.findElement(By.name("confirmpassword")).sendKeys(values.get(0).get(4));
		  
		 
		  
		/*
		 * for (Map<String, String> data : credentials.asMaps(String.class,
		 * String.class)) {
		 * 
		 * driver.findElement(By.id("firstname")).sendKeys(data.get("firstname"));
		 * driver.findElement(By.id("lastname")).sendKeys(data.get("lastname"));
		 * driver.findElement(By.id("phone")).sendKeys(data.get("phone"));
		 * driver.findElement(By.id("email")).sendKeys(data.get("email"));
		 * driver.findElement(By.id("password")).sendKeys(data.get("password"));
		 * driver.findElement(By.id("confirmpassword")).sendKeys(data.get("password"));
		 * 
		 * }
		 */
	  }

	  @When("^clicked login$")
	  public void clicked_login() throws Throwable {
		  WebElement element =  driver.findElement(By.xpath("//button[contains(@class,'btn btn-action btn-lg btn-block loginbtn')]  [contains(text(),'Login')]"));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", element);  
		 		  
	  }
	  @Then("^I clicked signup$")
	  public void clicked_signup() throws Throwable {
		  WebElement element =  driver.findElement(By.xpath("//button[contains(@class,'signupbtn btn_full btn btn-action btn-block btn-lg')]"));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", element);  
		 		  
	  }
	  
	  
	    
	
	
	



}
