Feature: Test hotel rating

      
       Scenario Outline: Test hotel rating
    Given I am on a page with url "<url>"
    When I enter "<city>" 
    Then I see hotels
    And I choose max rating hotel
    Then I see hotel rating is more than "<value>"
    Examples: 
      |url                   |city  |value |
      |http://www.booking.com|Москва|9     |
      
  