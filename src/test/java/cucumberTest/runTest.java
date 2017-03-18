package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

/**
 * Created by Zakir_Mustafin on 3/16/2017.
 */
//@Test(groups = "cucumber")
@CucumberOptions(features = "src/test/resources/suites/cucumberTest.feature", format = {"pretty"})

public class runTest extends AbstractTestNGCucumberTests {}