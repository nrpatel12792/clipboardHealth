Feature: Test Sandbox

  @start_scenario @smoke
  Scenario: verify menu options are displayed
    When user clicks hamburger button on nav page
    And user clicks "TV, Appliances, Electronics" on hamburger menu page
    And user clicks "Televisions" on hamburger menu page
    And user selects option "Samsung" on refinement page
    And user selects option "Price: High to Low" in filter dropdown on nav page
    And user clicks product number "2" on main area page
    Then validate correct item About description for product "Samsung2" on main area page