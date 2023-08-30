package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest {

	public void m1Test()
	{
		WebDriver driver;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
	//String USERNAME = System.getProperty("username");
	
if(BROWSER.equalsIgnoreCase("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.get(URL);
	}
}
