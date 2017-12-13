@ignore
Feature: Register

  Scenario: As a user I want to Register Successfully
    Given I am on the Home Page
    And I see a Logo Banner
    When I click SignIn Button
    And I type email address to create new user
    And I click create an account
    Then I see Your Personal Information
    And I select Mr
    And I enter first name in the first name input field
    And I enter last name in the last name input field
    And I see my email address
    And I type password in the password input field
    And I enter date of birth
    And I select option to sign up for our newsletter
    And I select option to receive special offers from our partners
    And I see Your Address
    And I type first name in the first name input field
    And I type last name in the last name input field
    And I enter company name in the company input field
    And I enter company address in the address input field
    And I enter the city
    And I enter the state
    And I enter the postal code in the postal code field
    And I select the country
    And I enter additional information
    And I enter mobile phone
    And I enter my address in the assign an address alaias for future reference
    And I click the Register Button
    Then I should be register successfully
    And I click on sign out to return to sign in page