package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given ("Load the application URL")
	public void loadApplication()
	{
		driver.get("http://leaftaps.com/opentaps/");
		
	}
	
	@Given ("Enter the username as {string}")
	public void enterUsername(String uname)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		
	}
	
	@Given ("Enter the password as {string}")
	public void enterPassword(String pWord)
	{
		driver.findElement(By.id("password")).sendKeys(pWord);
		
	}
	
	@When ("Click on Login button")
	public void clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then ("Homepage should be displayed")
	public void verifyHomePage()
	{
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed)
		{
			System.out.println("Homepage is displayed");
		}
		else
		{
			System.out.println("Homepage is not displayed");
		}
		//driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.close();
	}
	
	//@But ("Error message should be displayed")
	//public void verifyErrorMessage()
	//{
		
	//}
}