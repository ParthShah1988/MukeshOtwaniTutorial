package StepDefination;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmokeTestNew 
{
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32_new\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://noc.dtitsupport247.net/");
	}

	@When("^Enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void Enter_valid_username_and_valid_Password(String uname, String pass) throws Throwable 
	{
		driver.findElement(By.id("txtUser")).clear();
		driver.findElement(By.id("txtUser")).sendKeys(uname);
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
		driver.findElement(By.id("Submit")).click();
	}

	
	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable 
	{
		String homepagetitle=driver.getTitle();
		
		if(homepagetitle.contains("NOC@SAAZ,"))
		{
		//Assert.assertTrue(homepagetitle.contains("Nwr_SDM"));
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login unsuccessful");
		}
	}
	
	@After
	@Then("^Logout of the portal$")
	public void logout_of_the_portal() throws Throwable 
	{
		driver.quit(); 
	}
}
