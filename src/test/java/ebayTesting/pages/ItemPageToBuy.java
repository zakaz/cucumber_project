package ebayTesting.pages;

import ebayTesting.EbayAbstractClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by Zakir_Mustafin on 3/22/2017.
 */
public class ItemPageToBuy extends EbayAbstractClass {

    @FindBy(xpath = "//*[@id='isCartBtn_btn']")
    WebElement addToCardButton;

    public ItemPageToBuy(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public ItemPageToBuy() {
    }

    public ItemPageToBuy checkAddToCardBtnExist(){
        Assert.assertTrue(addToCardButton.isEnabled(), "Its seems that we are on wrong page");
        return new ItemPageToBuy(driver, logger);
    }

    public CartPage clickAddToCardBtn(){
        addToCardButton.click();
        return new CartPage(driver, logger);
    }
}
