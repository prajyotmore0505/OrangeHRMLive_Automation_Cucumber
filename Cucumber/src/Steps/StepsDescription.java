package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class StepsDescription                 // defining Meaning of testcase
{
	WebDriver driver;
	@Given("^Launch OrangeHRM$")
	public void Launch_OrangeHRM() 
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	   
	}

	
	@When("^user enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_username_and_password(String username,String password) 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		   
		
	}

	@Then("^Login should be success$")
	public void Login_should_be_success() 
	{
	   
		if(driver.findElement(By.id("welcome")).isDisplayed())
				System.out.println("Login successfull");
		else
			System.out.println("Login un successfull");
	}


		
}
