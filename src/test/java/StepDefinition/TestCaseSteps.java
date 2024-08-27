package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseSteps {
	WebDriver driver;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) throws Exception {
	 driver.findElement(By.id("Email")).clear();
	 driver.findElement(By.name("Password")).clear();
	 driver.findElement(By.id("Email")).sendKeys(email);
	 driver.findElement(By.name("Password")).sendKeys(password);
	 Thread.sleep(5000);
	}

	@When("Click on Login")
	public void click_on_login() throws Exception {
	 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	 Thread.sleep(5000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		String string1 = driver.getTitle();
		System.out.println("Title of WebPage is... : " + string1);
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws Exception {
	 
	}

	@Then("close browser")
	public void close_browser() {
	     driver.quit();
	}

}
