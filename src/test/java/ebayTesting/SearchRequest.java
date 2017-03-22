package ebayTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebayTesting.pages.EbayMainPage;
import ebayTesting.pages.SearchResultPage;

/**
 * Created by Zakir_Mustafin on 3/22/2017.
 */
public class SearchRequest {
    @Given("^I set search request \"([^\"]*)\"$")
    public void iSetSearchRequest(String arg0){
        new EbayMainPage().searchField(arg0);
    }

    @When("^I perform search$")
    public void iPerformSearch(){
        new SearchResultPage().performSearch();
    }

    @Then("^the term query \"([^\"]*)\" should be the first in the Search Result grid$")
    public void theTermQueryShouldBeTheFirstInTheSearchResultGrid(String arg0){
        new SearchResultPage().checkSearchResult(arg0);
    }
}
