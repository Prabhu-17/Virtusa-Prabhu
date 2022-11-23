package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demologin2 {
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
		ch.manage().window().maximize();
		ch.findElement(By.id("user-name")).sendKeys("standard_user");
		ch.findElement(By.id("password")).sendKeys("secret_sauce");
		ch.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
		
	

	}

}
