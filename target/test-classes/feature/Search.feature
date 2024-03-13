Feature: Testing demowebshop search page

  Scenario Outline: User should open demowebshop Home page on ChromeBrowser and Search product
    Given User is on Chrome browser and enters the home URL
    When User is on demowebshop login and search enter '<search>'
    Then User demowebshop Search button click
    And user click product and closes the browser

    Examples: 
      | search |
      | laptop |
