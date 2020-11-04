package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleSearchPage;

public class GoogleSearchSteps {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("^I open the web browser \"([^\"]*)\"$")
    public void i_open_the_web_browser(String BaseUrl) throws Throwable {
        googleSearchPage.launchUrl(BaseUrl);

    }

    @And("^I search for \"([^\"]*)\"$")
    public void i_search_for(String CarsInLondon) throws Throwable {
        googleSearchPage.SearchForCarInLondon(CarsInLondon);

    }

    @And("^the results are displayed\\.$")
    public void the_results_are_displayed() throws Throwable {
        googleSearchPage.ValidateResultsPage();

    }

    @When("^I verify the numbers of \"([^\"]*)\" links$")
    public void i_verify_the_numbers_of_links(String arg1) throws Throwable {

    }

    @And("^I navigate to each Gumtree Link$")
    public void i_navigate_to_each_Gumtree_Link() throws Throwable {

    }

    @And("^I verify the title is displayed$")
    public void i_verify_the_title_is_displayed() throws Throwable {

    }

    @Then("^I verify the number of cars greater then (\\d+)$")
    public void i_verify_the_number_of_cars_grater_then(int arg1) throws Throwable {

    }


}
