Feature: Test suit

  
   Scenario Outline: Test send email to spam
    Given I am on main application page1
   When I login as correct user with "<login>" and "<password>"
    And I send email to spam
    Then I see send message    
   Examples: 
      | login    | password     |
     | roma3784 | OUIYphyai44) |
  
  
   Scenario Outline: Test extract email from spam
     Given I am on main application page2
     When I login as correct user with "<login>" and "<password>" 1
     And I extract email from spam
     Then I see send message1    
     Examples: 
      | login    | password     |
      | roma3784 | OUIYphyai44) |
  
  Scenario Outline: Test send message
     Given I am on main application page3
     When I login as correct user with "<login>" and "<password>" 2
     And I write and send email
     Then I see send message2    
    Examples: 
      | login    | password     |
      | roma3784 | OUIYphyai44) |
  
  Scenario Outline: Test hotel rating
    Given I am on a page with url "<url>"
    When I enter "<city>" 
    Then I see hotels
    And I choose max rating hotel
    Then I see hotel rating is more than "<value>"
   Examples: 
      |url                   |city  |value |
      |http://www.booking.com|Moscow|9     |



   Scenario Outline: Test price hotel
     Given I am on a page with url 
     When I enter data
     And I find cheapest hotels
     Then I see cheapest hotels
     And I find max rating hotels 
    Then I see hotel price is less than "<value>"
    Examples: 
       |value |
       |20000 |





#  Scenario Outline: Test traffic jams
#    Given I am on a page with url "<url>"
#    When I click on button traffic jams
#    Then I see traffic is less than "<value>"
#    Examples: 
#      | url               | value|
#      | https://yandex.by | 3    |
#      | https://yandex.by | 5    |



   Scenario: Test VK Api
    Given I am on main application page4 
    When I login as correct user1
    Then I enter message
 
  