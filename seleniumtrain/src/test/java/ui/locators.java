package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
	public static String browser="chrome"; //external configuration from Xls,cvv
	public static WebDriver ch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 ch=new FirefoxDriver();
		}
		else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 ch=new ChromeDriver();
		}
		
		ch.get("http://www.saucedemo.com");
	    By passwordlocator= RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
	    
	

	}

}
