package week7.day1.assignment.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
             
public class BaseClass extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Application launched sucessfully");
	}
	@AfterMethod
	public void close()
	{
		driver.close();
		System.out.println("Application closed sucessfully");
	}
	       
	@When("click on {string} button")
	public void clickLinkText(String linkText)
	{
		driver.findElement(By.linkText(linkText)).click();
	}
	
	@Given("Enter the username as {string}")
	public void enterUserName(String useName) {
		driver.findElement(By.id("username")).sendKeys(useName);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String passwd) {
		driver.findElement(By.id("password")).sendKeys(passwd);

	}

	@When("click on Login button as className {string}")
	public void clickLogin(String className) {
		driver.findElement(By.className(className)).click();
	}

	
	@Then("Home Page should be displayed")
	public void verifyHomePage() {
		
		boolean isDisplayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(isDisplayed) {
		System.out.println("Home Page is displayed");
		}
		else {
			System.out.println("Home Page is not displayed");
		}
	}

	@Then("{string} page should be displayed")
	public void verifyPageById(String idValue) {
		
		boolean isDisplayed = driver.findElement(By.id(idValue)).isDisplayed();
		if(isDisplayed) {
		System.out.println(idValue+" Page is displayed");
		}
		else {
			System.out.println(idValue+" Page is not displayed");
		}
	}
}
