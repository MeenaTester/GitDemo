package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.commonVariables;

public class Hooks {
	public commonVariables commonVariables;
	WebDriver driver;
	public Hooks(commonVariables commonVariablesRef) throws IOException {
		this.commonVariables = commonVariablesRef;
		driver = this.commonVariables.callDriver();
	}
	
	
	@After
	public void closeBrowser() throws IOException
	{
		System.out.println("quit");
		commonVariables.testBase.CreateDriverManager().quit();
	}
	
	@AfterStep
	public void TakeScreenShot(Scenario scenario) throws IOException {
		if(scenario.isFailed())
		{
			File SourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] dataSet = FileUtils.readFileToByteArray(SourcePath);
			scenario.attach(dataSet, "image/png", "failedImage");
		}
		
	}

}
