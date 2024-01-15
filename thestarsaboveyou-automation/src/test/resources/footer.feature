@allTestsForFooter
  Feature: Open the webpage and verifies that Footer area is functional
    As a customer,
  I want to open the webpage,
  So I can interact with the Footer area

    @positive @contacts
  Scenario: Click Contacts button
    Given the user is on Home page
    When he clicks on accept cookies
    And he clicks on Contacts button
    Then he verifies that the Contacts area is present

    @positive @delivery
  Scenario: Click Delivery button
    Given the user is on Home page
    When he clicks on accept cookies
    And he clicks on Delivery button
    Then he verifies that the Delivery area is present

    @positive @generalTerms
  Scenario: Click General terms button
      Given the user is on Home page
      When he clicks on accept cookies
      And he clicks on General terms button
      Then he verifies that the General terms area is present