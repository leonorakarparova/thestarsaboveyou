@allTestsForHeaderArea
Feature: Open the webpage and verifies that Header area is functional
  As a customer,
  I want to open the webpage,
  So I can interact with the Header area

  @positive @orderButton
  Scenario: Click Header area Order button
    Given the user is on Home page
    When he clicks on Header area Order button
    Then he verifies that the Product title is present

  @positive @aboutUsButton
  Scenario: Click About us button
    Given the user is on Home page
    When he clicks on About us button
    Then he verifies that About us content is present
