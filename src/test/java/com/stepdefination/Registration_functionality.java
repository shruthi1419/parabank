package com.stepdefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_functionality {
	
	public static WebDriver driver;
	@Given("User is on index page")
	public void user_is_on_index_page() {
	    
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();
	}

	@When("User clicks on register link")
	public void user_clicks_on_register_link() {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	}

	@Then("registration page will display")
	public void registration_page_will_display() {
	   
	}

	@Then("User enters First Name")
	public void user_enters_first_name() {
		driver.findElement(By.id("First name")).sendKeys("shruthi");
		
	   
	}

	@Then("User enters Last Name")
	public void user_enters_last_name() {
		driver.findElement(By.id("Last name")).sendKeys("shru");
	}

	@Then("User enters Address")
	public void user_enters_address() {
		driver.findElement(By.id("Address")).sendKeys("Hyderabad");
	}

	@Then("User enters City")
	public void user_enters_city() {
		driver.findElement(By.id("City")).sendKeys("Secunderabad");
	}

	@Then("User enters State")
	public void user_enters_state() {
		driver.findElement(By.id("State")).sendKeys("TLNG");
	}

	@Then("User enters Zip Code")
	public void user_enters_zip_code() {
		driver.findElement(By.id("Zip code")).sendKeys("500009");
	}

	@Then("User enters SSN")
	public void user_enters_ssn() {
		driver.findElement(By.id("SSN")).sendKeys("123456");
	}

	@Then("User enters Username")
	public void user_enters_username() {
		driver.findElement(By.id("Username")).sendKeys("shruthishru");
	}

	@Then("User enters Password")
	public void user_enters_password() {
		driver.findElement(By.id("Password")).sendKeys("12345678@sh");
	}

	@Then("User enters Password again for confirmation")
	public void user_enters_password_again_for_confirmation() {
		driver.findElement(By.id("Confirm")).sendKeys("12345678@sh");
	}

	@Then("User clicks on Register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	}

String Exp_title=driver.getTitle();
String Act_title=("PARA BANK-experince the diff ");{

if(Exp_title.equals(Act_title))
{
		Assert.assertTrue(true);
System.out.println("test case is pass");
}
else
{
	System.out.println("test case is fail" );
     Assert.assertTrue(false);
	
	}
	}
}
