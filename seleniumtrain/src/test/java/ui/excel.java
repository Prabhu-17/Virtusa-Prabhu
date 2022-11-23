package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excel {
	public static String browser="chrome"; //external configuration from Xls,cvv
	public static WebDriver ch;

	@SuppressWarnings("deprecation")
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
		ch.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ch.get("");
		
		
		

	}

}
