package pageObjects;


import org.openqa.selenium.WebDriver;
import utils.CommonOperations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchFights extends CommonOperations {
	WebDriver driver;
	
	
	//Search Flights Page locators	
	
	
	@FindBy(how = How.ID, using = "all_flights") 
	public WebElement searchFlightsResultsContainer;
	
	
	
	public SearchFights(WebDriver d) {
		super(d);
		driver = d;
		
	}

	
	
	

}
