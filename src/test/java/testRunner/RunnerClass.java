package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.DriverUtil;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html","pretty","html:target/cucumber",
        "json:target/cucumber-report.json"},
        features = {"./src/test/resources"},
        tags = {"@Test"},
        glue = {"steps"},
        monochrome = true)

public class RunnerClass{

    @BeforeClass
    public static  void startSession(){
        DriverUtil driverUtil = new DriverUtil();
        driverUtil.setDriver("firefox");
        // driverUtil.setDriver("chrome");
    }
    @AfterClass
    public static void endSession(){
        DriverUtil driverUtil = new DriverUtil();
        driverUtil.closeDriver();
    }
}
