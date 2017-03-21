package ebayTesting;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Zakir_Mustafin on 3/20/2017.
 */

    @CucumberOptions(features = "src/test/resources/openEbayHomePage.feature", format = {"pretty"})

    public class EbayTest extends AbstractTestNGCucumberTests {

}

