package ebayTesting.pages;

import ebayTesting.EbayAbstractClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.Logger;

/**
 * Created by Zakir_Mustafin on 3/20/2017.
 */
public class EbayMainPage extends EbayAbstractClass {

//    private WebDriver driver;
//    private Logger logger;
//    private WebDriverWait wait;


    @FindBy(xpath = "//*[@id='gh-l-h1']")
    WebElement webPageLogo;

    @FindBy(xpath = "//*[@id='gh-ac']")
    WebElement searchingField;

    public EbayMainPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public EbayMainPage(){
        super();
    }

//    @Before
    public EbayMainPage initSeleniumDriver(){
        driver = getDriver();
        return new EbayMainPage(driver, logger);
    }

//    @Given("^Getting driver and open the browser$")
    public EbayMainPage openBrowser() {
        logger.info("Session using driver - " + driver);
        return new EbayMainPage(driver, logger);
    }

//    @When("^I open Ebay website$")
    public EbayMainPage goToEbay() {
        driver.get("http://www.ebay.com/");
        logger.info("Page EBAY.COM OPENED");
        return new EbayMainPage(driver, logger);
    }

//    @Then("^Ebay logo should exits$")
    public EbayMainPage loginButton() {
//        wait = new WebDriverWait(getDriver(), 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("*[@id='gh-l-h1']")));
        if(webPageLogo.isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
//        EbayAbstractClass.close();
        return new EbayMainPage(driver, logger);
    }

    public SearchResultPage searchField(String wordToFind){
        searchingField.sendKeys(wordToFind);
        return new SearchResultPage(driver, logger);
    }
}
