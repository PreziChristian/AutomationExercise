package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Exercise13 {
	
	WebDriver driver;
	@Given("I open the browser")
	public void i_open_the_browser() {
	  driver=new ChromeDriver();
	 
	  
	}

	@When("I enter the Automation Exercise URL")
	public void i_enter_the_automation_exercise_url() {
	    driver.get("https://automationexercise.com");
	    driver.manage().window().maximize();
	}

	@Then("I verify that the home page is displayed correctly")
	public void i_verify_that_the_home_page_is_displayed_correctly() {
	    Assert.assertEquals("https://automationexercise.com/", driver.getCurrentUrl());	}

	@When("I click on the {string} button of a product")
	public void i_click_on_the_button_of_a_product(String buttonName) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement viewProduct = wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("(//a[normalize-space(text())='" + buttonName + "'])[1]")));
		    viewProduct.click();
	    
	}


	@Then("I verify that the product detail page is opened")
	public void i_verify_that_the_product_detail_page_is_opened() {
		Assert.assertEquals("https://automationexercise.com/product_details/1", driver.getCurrentUrl());
	}

	@When("I increase the quantity to {int}")
	public void i_increase_the_quantity_to(Integer int1) {
		
	  WebElement quntity=  driver.findElement(By.xpath("//input[@id='quantity']"));
	  quntity.clear();
	  quntity.sendKeys(String.valueOf(int1));
	}

	@When("I click the {string} button")
	public void i_click_the_button(String string) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
	switch (string.toLowerCase()) {
	case "add to cart":
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		break;
	case "view cart":
		WebElement viewcart = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//u[normalize-space()='View Cart']")));
		viewcart.click();       break;

     case "checkout":
         driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
         break;
	default:
		throw new IllegalArgumentException("Button not recognized: ");
	}
	}

	@Then("I verify that the product is displayed in the cart page with the expected quantity")
	public void i_verify_that_the_product_is_displayed_in_the_cart_page_with_the_expected_quantity() {
	   WebElement quantity= driver.findElement(By.xpath("//tr[@id='product-1']//td[@class='cart_quantity']"));
	   String quntityValue= quantity.getText();
			   System.out.println(quntityValue);
	   Assert.assertEquals(quntityValue, "4");
	   
	}


	

}
