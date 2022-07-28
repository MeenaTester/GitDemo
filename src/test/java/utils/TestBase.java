package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public WebDriver CreateDriverManager() throws IOException
	{
		File f =  new File(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String browser=p.getProperty("browser");
		String maven_browser = System.getProperty("browser");
		if(maven_browser!=null)
		{
			browser = maven_browser;
		}
		
		if(this.driver ==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromiumdriver().setup();
				this.driver = new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				this.driver = new FirefoxDriver();
			}
		
		  this.driver.get(p.getProperty("URL"));
		}
		return this.driver;
	}

}
