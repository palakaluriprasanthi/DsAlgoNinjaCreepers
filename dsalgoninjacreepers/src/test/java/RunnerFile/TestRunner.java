package RunnerFile;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution
@CucumberOptions(
plugin = {"pretty","html:target/dsalgo123.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
//monochrome = true, //console output
dryRun = false,
tags = ("@tag,@tag1,@signin"), //tags from feature file
features = {"src/test/resources/features"}, //location of feature files
glue  = {"dsAlgoStepDefinitions","dsalgo_hooks"}) //location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests{
	  @Override
	  @DataProvider(parallel=false)
	  public Object[][] scenarios()
	  {
	   return super.scenarios();

	  }
	/*@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser)
	{
		ConfigReader.setBrowserType(browser);
	}*/

	

}
