package cuke.stepdefs;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PractiseSelenium {
	static WebDriver driver;
	private static WebElement element;

	@Before("@Test3")
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(chromeCfg());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}

	@Given("the correct web address")
	public void we_can_open_website() {
		driver.get("http://www.practiceselenium.com/welcome.html");
	}

	@When("I navigate to the 'Menu' page")
	public void we_search_for_menu() {
		element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a"));
		element.click();
	}

	@Then("I can browse a list of the available products.")
	public void website_will_return_list_of_products() {
		element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[14]/div/p/span/span/strong"));
		assertEquals("Green Tea", element.getText());
	}
	
	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
	    element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[16]/div/a/span"));
	    element.click();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
	    element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[14]/div/pre/strong/span"));
	    assertEquals("Enter your billing information", element.getText());
	}

	@After("@Test3")
	public static void close() {
		driver.close();
		driver.quit();
		

	}

	public static ChromeOptions chromeCfg() {
		 Map<String, Object> prefs = new HashMap<String, Object>();
		 ChromeOptions cOptions = new ChromeOptions();
		  
		 // Settings
		 prefs.put("profile.default_content_setting_values.cookies", 2);
		 prefs.put("network.cookie.cookieBehavior", 2);
		 prefs.put("profile.block_third_party_cookies", true);

		 // Create ChromeOptions to disable Cookies pop-up
		 cOptions.setExperimentalOption("prefs", prefs);

		 return cOptions;
		 }

}