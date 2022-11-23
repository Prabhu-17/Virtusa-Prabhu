package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;


public class searchsteps {
	WebDriver driver=null; 
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside step-browser is open");
	    System.setProperty("webdriver.chrome.driver", "C:/Users/prabh/eclipse-workspace/cucumberdemo/src/test/resources/driver/chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step-ser is on google search page");
		driver.navigate().to("https://www.google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside step-user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}

	@And("hit enter")
	public void hit_enter() {
		System.out.println("Inside step-hit enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step-user is navigated to search results");
		driver.getPageSource().contains("Downloads");
		driver.close();
		driver.quit();
	}

}
