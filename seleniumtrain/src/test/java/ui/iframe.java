package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {
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
		
		ch.get("https://www2.asx.com.au/");
		
		ch.findElement(By.className("pn-ProductNav_Link cmp-tabs__tab gtm-tab cmp-tabs__tab--active")).click();
		
		
	

	}

}
