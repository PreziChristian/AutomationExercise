package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FirstStepFile {
	WebDriver driver;
	@Given("Open browser")
	public void open_browser() {
	    driver=new ChromeDriver();
	}

	@When("Enter url")
	public void enter_url() {
	    driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	}

	@Then("verify home page visible or not")
	public void verify_home_page_visible_or_not() {
		Assert.assertEquals("https://automationexercise.com/", driver.getCurrentUrl());
	}




}
