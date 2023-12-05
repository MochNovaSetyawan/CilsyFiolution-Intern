package TestRunner;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/BoardNegative.json",
                "html:target/cucumber-reports/BoardNegative.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/Features",
        glue ={"MyStepdefs"},
        monochrome = true,
        dryRun = false,
        tags = "@BoardNegative"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    ExtentReports extent = new ExtentReports();

    public void Teardown(){
        extent.flush();
    }
}
