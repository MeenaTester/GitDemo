package utils;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import pageObject.CommonManager;

import org.openqa.selenium.WebDriver;


public class commonVariables {
	    public WebDriver driver;
	    public String ProductName;
	    public String landingPageProductName;
	    public String selectedProductName;
	    public String CartProductName;
	    public CommonManager CommonManager;
	    public TestBase testBase;
	    public GenericUtils GenericUt;
	    public commonVariables()
	    {
	    	
	    }
	    public void callCommonManager() throws IOException
	    {
	    	testBase = new TestBase();
	    	CommonManager = new CommonManager(testBase.CreateDriverManager());
	    	GenericUt = new GenericUtils(testBase.CreateDriverManager());
	    }
	    
	    public WebDriver callDriver() throws IOException
	    {
	    	return testBase.CreateDriverManager();
	    }
	   
}
