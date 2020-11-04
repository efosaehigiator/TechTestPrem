Feature: Search For Cars in London

  @Test
  Scenario: I want to search for cars in London using google

    Given I open the web browser "https://www.google.com/"
    And I search for "cars in London"
    And the results are displayed.
    When I verify the numbers of "gumtree" links
    And I navigate to each Gumtree Link
    And I verify the title is displayed
    Then I verify the number of cars greater then 0