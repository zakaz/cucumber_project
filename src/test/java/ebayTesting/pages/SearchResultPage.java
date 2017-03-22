package ebayTesting.pages;

import ebayTesting.EbayAbstractClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.Assertion;


/**
 * Created by Zakir_Mustafin on 3/22/2017.
 */
public class SearchResultPage extends EbayAbstractClass {

    @FindBy(xpath = "//*[@id='gh-btn']")
    WebElement submitButton;

    @FindBy(xpath = ".//*[@id='ListViewInner']/li[1]")
    WebElement firstFoundElement;

    @FindBy(xpath = "//*[@id='ListViewInner']/li[1]/h3/a")
    WebElement linkOfFirstFoundElement;

    public SearchResultPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public SearchResultPage() {
    }

    public SearchResultPage performSearch(){
        submitButton.click();
        return new SearchResultPage(driver, logger);
    }

    public SearchResultPage checkSearchResult(String wordForCheck){
        String titleOfItem = firstFoundElement.getText();
        Boolean existing = titleOfItem.toLowerCase().contains(wordForCheck.toLowerCase());
        Assert.assertTrue(existing, "There is no word '"+ wordForCheck +"' in first Result");
        System.out.println("Test 2 Pass");
        return new SearchResultPage(driver, logger);
    }

    public ItemPageToBuy clickOnLinkOfFirstElement(){
        linkOfFirstFoundElement.click();
        return new ItemPageToBuy(driver, logger);
    }
}
