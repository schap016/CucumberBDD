package utils;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SetUp {
	
	WebDriver driver;
	//HomePage homePage;

	
	static JavascriptExecutor js;
	
	
	public WebDriver SetUp(WebDriver driver) {	
		
		this.driver = driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saman\\java_cucumber\\CucumberBDD\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		//driver.get("https://www.phptravels.net");
		driver.manage().window().maximize();
	
		
		return driver;
		
		
	}

}
