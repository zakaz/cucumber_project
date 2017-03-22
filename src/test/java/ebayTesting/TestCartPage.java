package ebayTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebayTesting.pages.ItemPageToBuy;
import ebayTesting.pages.CartPage;

/**
 * Created by Zakir_Mustafin on 3/22/2017.
 */
public class TestCartPage {

    @Given("^I push add to card button$")
    public void iPushAddToCardButton(){
        new ItemPageToBuy().clickAddToCardBtn();
    }

    @When("^cart page opened$")
    public void cartPageOpened(){
        new CartPage().cartPageOpened();
    }

    @Then("^the quantity of items in cart should be \"([^\"]*)\"$")
    public void theQuantityOfItemsInCartShouldBe(String arg0) {
        new CartPage().checkQuantityOfElementsInCart(arg0);
    }
}
