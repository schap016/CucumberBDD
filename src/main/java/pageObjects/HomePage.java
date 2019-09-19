package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.CommonOperations;


//Home page operations and actions
public class HomePage extends CommonOperations{

	WebDriver driver;
	
	//Home Page locators	
	@FindBy(how = How.LINK_TEXT, using = "HOTELS") 
		public WebElement hotelTab;	
	@FindBy(how = How.XPATH, using = "//*[@id='body-section']/section/div[2]/div/div/div[2]/ul/li[3]/a") 
		public WebElement flightsTab;	
	@FindBy(how = How.LINK_TEXT, using = "TOURS") 
		public WebElement toursTab;	
	@FindBy(how = How.LINK_TEXT, using = "CARS") 
		public WebElement carsTab;
	@FindBy(how = How.CLASS_NAME,using = "col-md-3")
		public List<WebElement> featuredTours;
	@FindBy(how = How.LINK_TEXT, using = "One Way")
		public WebElement oneWayButton;
	@FindBy(how = How.ID, using = "s2id_origin")
		public WebElement sourceCity;
	@FindBy(how = How.ID, using = "s2id_destination")
		public WebElement destinationCity;
	@FindBy(how = How.LINK_TEXT, using = "SEARCH")
		public WebElement searchButton;
	@FindBy(how = How.CLASS_NAME, using = "select2-input")
	public WebElement hotelSearchTextBox;


	// extended super class CommonOperations driver variable  = d
	public HomePage(WebDriver d){
		 super(d);
		// PageFactory.initElements(d, HomePage.class);
		driver = d;
		
		
		
	}
	
	public boolean homePagewebElementIsDisplayed(WebElement element) {
		  
		boolean a;
		a = webElementIsDisplayed(element);
			return a;	
	}
	
	public String getHomePageTitle() {
		String title;
		
		title = getPageTitle();
		
		return title;	
	}
	
}