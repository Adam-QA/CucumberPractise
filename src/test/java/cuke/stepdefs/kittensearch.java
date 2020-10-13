package cuke.stepdefs;

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

public class kittensearch {
	static WebDriver driver;
	private WebElement element;

	@Before("@Test1")
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(chromeCfg());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}

	@Given("we can open google")
	public void we_can_open_google() {
		driver.get("https://www.google.co.uk/");
	}

	@When("we search for kittens")
	public void we_search_for_kittens() {
		element = driver.findElement(By.name("q"));
		element.sendKeys("kittens");
		element.submit();
	}

	@Then("google will return us images of kittens")
	public void google_will_return_us_images_of_kittens() {
		element = driver
				.findElement(By.xpath("/html/body/div[7]/div[2]/div[4]/div/div/div[1]/div/div/div[1]/div/div[2]/a"));
		element.click();
	}

	@After("@Test1")
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
