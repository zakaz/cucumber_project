package ebayTesting;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.picocontainer.*;

/**
 * Created by Zakir_Mustafin on 3/20/2017.
 */
public class EbayMainPage extends EbayAbstractClass {

    private WebDriver driver;
    private Logger logger;

    @FindBy(xpath = "*[@id='gh-l-h1']")
    private WebElement webPageLogo;

    public EbayMainPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

//    @Before
    public EbayMainPage initSeleniumDriver(){
        driver = EbayAbstractClass.getDriver();
        return new EbayMainPage(driver, logger);
    }

//    @Given("^Getting driver and open the browser$")
    public EbayMainPage openBrowser() {
        logger.info("Session using driver - " + driver);
        return new EbayMainPage(driver, logger);
    }

//    @When("^I open Ebay website$")
    public EbayMainPage goToEbay() {
        driver.get("www.ebay.com");
        logger.info("Page EBAY.COM OPENED");
        return new EbayMainPage(driver, logger);
    }

//    @Then("^Ebay logo should exits$")
    public void loginButton() {
        if(webPageLogo.isDisplayed()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        EbayAbstractClass.close();
    }
}
//*[@id="gh-l-h1"]