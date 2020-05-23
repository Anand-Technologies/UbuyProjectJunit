Feature: To validate the Ubuy Home page funcionality

  Scenario Outline: To Check the Search funcionality
    Given User is on home page
    When User has enter the "<product>" name in search bar
    And User has click the Search button
    Then User is on particular product page

    Examples: 
      | product   |
      | iphone 11 |
