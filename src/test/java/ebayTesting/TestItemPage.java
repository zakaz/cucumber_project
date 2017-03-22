package ebayTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import ebayTesting.pages.ItemPageToBuy;
import ebayTesting.pages.SearchResultPage;

/**
 * Created by Zakir_Mustafin on 3/22/2017.
 */
public class TestItemPage {
    @And("^I click on the link of first item$")
    public void iClickOnTheLinkOfFirstItem(){
        new SearchResultPage().clickOnLinkOfFirstElement();
    }

    @Then("^Add To Card button should exist$")
    public void addToCardButtonShouldExist(){
        new ItemPageToBuy().checkAddToCardBtnExist();
    }
}
