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
public class CartPage extends EbayAbstractClass {

    @FindBy(xpath = "//*[@id='PageTitle']/h1")
    WebElement cartTitle;

    @FindBy(xpath = "//*[@id='ptcBtnRight']")
    WebElement quantityOfElements;


    public CartPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public CartPage() {
    }

    public CartPage cartPageOpened(){
        Assert.assertTrue(cartTitle.isDisplayed());
        return new CartPage(driver, logger);
    }

    public void checkQuantityOfElementsInCart(String expectedQuantity){
        String actualString = quantityOfElements.getText();
        Boolean comparedQuantity = actualString.toLowerCase().contains(expectedQuantity.toLowerCase());
        Assert.assertTrue(comparedQuantity);
        close();
    }
}
