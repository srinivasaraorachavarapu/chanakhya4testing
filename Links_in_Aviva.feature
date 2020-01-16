#Author: Gk Krishna

Feature: Aviva search in Google to get count of links

Scenario: Validate number of links in Aviva Home-Page
    Given user will open Browser with "Chrome"
    When user will enter "Aviva" text into Google text box
    And user will wait untill Search results will display
    Then user will get Number of links in page and display count in console		
    And User will save reports		 	
   	And user will close site
   	
Scenario: Validate Aviva Search page 5th link text
    Given user will open Browser with "Chrome"
    When user will enter "Aviva" text into Google text box
    And user will wait untill Search results will display
  	When user will get "50" th link text and print it in console
  	 And User will save reports		 	
 		And user will close site
   
   # Positive or Negative just u can give text within that text place
Scenario: Validate Aviva URL by comparing with Other Text Searching in google
    Given user will open Browser with "Chrome"
    When user will enter "life Insurence" text into Google text box
    And user will wait untill Search results will display
  	And User will get Current page URL and compare with Aviva site URL  	
  	And User will save reports		 	
   	And user will close site
   