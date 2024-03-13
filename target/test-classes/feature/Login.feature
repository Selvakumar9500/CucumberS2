Feature: Testing demowebshop login page

  Scenario Outline: User should open demowebshop login page on ChromeBrowser
    Given User is on Chrome browser and enters the URL
    When User is on demowebshop login and enter '<Email>'
    Then User demowebshop Enter '<password>'
    And user click Login closes the browser

    Examples: 
      | Email                  | password   |
      | Selva18ee051@gmail.com | Selva@2021 |
