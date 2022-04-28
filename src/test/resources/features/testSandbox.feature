Feature: Test Sandbox

  @start_scenario @smoke
  Scenario: verify menu options are displayed
    When user clicks hamburger button on home page
    And user clicks "TV, Appliances and Electronics" on hamburger menu page