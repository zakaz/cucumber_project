package ebayTesting;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebayTesting.pages.EbayMainPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by Zakir_Mustafin on 3/21/2017.
 */
public class TestEbayMainPage {

    private WebDriver driver;
    private Logger logger;

    @Before
    public void startBrowser(){
        new EbayMainPage(driver, logger).initSeleniumDriver();
    }

    @Given("^Getting driver and open the browser$")
    public void showLogs(){
        new EbayMainPage().openBrowser();
    }

    @When("^I open Ebay website$")
    public void typeAddress(){
        new EbayMainPage().goToEbay();
    }

    @Then("^Ebay logo should exits$")
    public void checkThePage(){
        new EbayMainPage().loginButton();
    }

}
