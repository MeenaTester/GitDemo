package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	 public void switchWindows() throws InterruptedException
	    {
	    	Set<String> s1 = driver.getWindowHandles();
	    	System.out.println("cartpage s1"+s1);
			Iterator<String> i1 = s1.iterator();
			String parentWindow = i1.next();
			String childWindow = i1.next();
			System.out.println(parentWindow + "Then executed "+childWindow);
			driver.switchTo().window(childWindow);
			Thread.sleep(2000);
	    }
}
