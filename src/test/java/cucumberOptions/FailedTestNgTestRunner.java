package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//,tags="@CartTest"
@CucumberOptions(features="@target/failedScenarios.txt",glue="stepDefinitions",monochrome=true,
plugin={"html:target/reports/GreenCart.html","json:target/reports/GreenCart.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class FailedTestNgTestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
    }

}

