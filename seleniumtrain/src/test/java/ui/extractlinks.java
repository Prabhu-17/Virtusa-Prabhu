package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extractlinks {
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
		
		ch.get("https://www.sugarcrm.com/au/request-demo/");
		ch.manage().window().maximize();
		List<WebElement> alllinks=ch.findElements(By.tagName("a"));
		System.out.println("total tags "+alllinks.size());
		
		for(int i=0;i<alllinks.size();i++) {
			System.out.println("links are "+alllinks.get(i).getAttribute("href"));
			System.out.println("link"+alllinks.get(i).getText());
		}
		ch.close();
		
		
	

	}

}
