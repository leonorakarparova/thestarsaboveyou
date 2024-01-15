@allTestsForOrderPage
  Feature: Open the webpage, fill the PDP fields and make an order
    As a customer,
  I want to open the webpage,
  So I can fill the PDP fields and make an order

    @positive @order
  Scenario: Make an order
    Given the user is on Home page
    When he clicks on Order button
    And he verifies that the Product title is present
    And selects the Type of product
    And enters the Date
    And enters the Time
    And enters the Location
    And enters the Text
    And selects the Design
    And selects the Font
    And he clicks on accept cookies
    And clicks on Add to basket button
    And verifies that the Add to basket message is present
    And clicks on Order completion button
    And verifies that the Order header is present
    And enters the First name
    And enters the Last name
    And enters the Address
    And enters the City
    And enters the Phone number
    And enters the Email
    And clicks on Delivery payment
    And clicks on accept terms
    And clicks on Place order button
    Then he verifies that the Complete order message is present

    @negative @order @notAcceptedTerms
  Scenario: Make an order without accepting Terms
      Given the user is on Home page
      When he clicks on Order button
      And he verifies that the Product title is present
      And selects the Type of product
      And enters the Date
      And enters the Time
      And enters the Location
      And enters the Text
      And selects the Design
      And selects the Font
      And he clicks on accept cookies
      And clicks on Add to basket button
      And verifies that the Add to basket message is present
      And clicks on Order completion button
      And verifies that the Order header is present
      And enters the First name
      And enters the Last name
      And enters the Address
      And enters the City
      And enters the Phone number
      And enters the Email
      And clicks on Delivery payment
      And clicks on Place order button with explicit wait
      Then he verifies that the Complete order message is present

    @negative @order @invalidEmail
    Scenario: Make an order with invalid email
      Given the user is on Home page
      When he clicks on Order button
      And he verifies that the Product title is present
      And selects the Type of product
      And enters the Date
      And enters the Time
      And enters the Location
      And enters the Text
      And selects the Design
      And selects the Font
      And he clicks on accept cookies
      And clicks on Add to basket button
      And verifies that the Add to basket message is present
      And clicks on Order completion button
      And verifies that the Order header is present
      And enters the First name
      And enters the Last name
      And enters the Address
      And enters the City
      And enters the Phone number
      And enters the invalid Email
      And clicks on Delivery payment
      And clicks on accept terms
      And clicks on Place order button
      Then he verifies that the Complete order message is present

      @negative @order @invalidPhoneNumber
      Scenario:
        Given the user is on Home page
        When he clicks on Order button
        And he verifies that the Product title is present
        And selects the Type of product
        And enters the Date
        And enters the Time
        And enters the Location
        And enters the Text
        And selects the Design
        And selects the Font
        And he clicks on accept cookies
        And clicks on Add to basket button
        And verifies that the Add to basket message is present
        And clicks on Order completion button
        And verifies that the Order header is present
        And enters the First name
        And enters the Last name
        And enters the Address
        And enters the City
        And enters an invalid Phone number
        And enters the Email
        And clicks on Delivery payment
        And clicks on accept terms
        And clicks on Place order button
        Then he verifies that the Complete order message is present
