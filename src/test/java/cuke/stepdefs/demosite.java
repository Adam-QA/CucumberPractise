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

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demosite {
	static WebDriver driver;
	private static WebElement element;
	
	@Before("@Test4")
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(chromeCfg());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}
	@Given("^I navigate to demosite$")
	public void i_navigate_to_demosite() throws Throwable {
	    driver.get("http://thedemosite.co.uk/");
	}

	@Given("^I navigate to add a user$")
	public void i_navigate_to_add_a_user() throws Throwable {
		element = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		element.click();
	}

	@Given("^I create a username as \"([^\"]*)\" and password as \"([^\"]*)\" and click save$")
	public void i_create_a_username_as_admin_and_password_as_admin_and_click_save(String arg1, String arg2) throws Throwable {
		WebElement username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		username.sendKeys(arg1);
		WebElement password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		password.sendKeys(arg2);
		WebElement submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		submit.submit();
	}

	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
		WebElement loginbar = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		loginbar.click();
	}

	@When("^I input my username as \"([^\"]*)\" and password as \"([^\"]*)\" and click login$")
	public void i_input_my_username_as_admin_and_password_as_admin_and_click_login(String arg1, String arg2) throws Throwable {
		WebElement username1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		username1.sendKeys(arg1);
		WebElement password1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		password1.sendKeys(arg2);
		WebElement submit1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		submit1.click();
	}

	@Then("^I should see a successful login$")
	public void i_should_see_a_successful_login() throws Throwable {
		WebElement success = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("**Successful Login**", success.getText());
	}
	
	@After("@Test4")
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
