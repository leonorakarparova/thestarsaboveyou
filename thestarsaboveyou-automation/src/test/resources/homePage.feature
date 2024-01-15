@allTestsForHomePage
  Feature: Open the webpage and verifies that Click order button is functional
    As a customer,
  I want to open the webpage,
  So I can open the Product page

  @positive @homePage
    Scenario: Verify Header area
    When the user is on Home page
    Then he verifies that the Header area is present

  @positive @homePage @pdpPage
    Scenario: Click Order button
    Given the user is on Home page
    When he clicks on Order button
    Then he verifies that the Product title is present