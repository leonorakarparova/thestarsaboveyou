@allTestsForPDPPage
  Feature: Open the webpage and fill the PDP fields
    As a customer,
  I want to open the webpage,
  So I can fill the PDP fields

    @positive @pdpPage
    Scenario Outline: Fill the PDP fields
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
      Then verifies that the Order header is present
      Examples:
        | online-home      | 12.05.2001 | 12:45 | Varna   | Stars above us    | 2 | 1 |
        | 20x30            | 10.03.2016 | 13:10 | Sofia   | Always remember   | 0 | 0 |
        | 20x30-with-frame | 16.08.2004 | 15:50 | Ruse    | Sky               | 1 | 1 |
        | 30x40            | 30.03.2018 | 16:50 | Plovdiv | Forever           | 1 | 1 |
        | 30x40-with-frame | 14.04.2008 | 15:00 | Burgas  | Happy birthday    | 0 | 0 |
        | 50x70            | 19.07.2020 | 20:00 | Plovdiv | Happy anniversary | 2 | 0 |

      @negative @pdpPage @emptyLocation
    Scenario: Add to basket with empty Location field
        Given the user is on Home page
        When he clicks on Order button
        And he verifies that the Product title is present
        And selects the Type of product
        And enters the Date
        And enters the Time
        And leaves the Location fields empty
        And enters the Text
        And selects the Design
        And selects the Font
        And he clicks on accept cookies
        And clicks on Add to basket button
        Then verifies that the Empty location error message is present

       @negative @pdpPage @notSelectedType
    Scenario: Add to basket without selecting the Type
         Given the user is on Home page
         When he clicks on Order button
         And he verifies that the Product title is present
         And enters the Date
         And enters the Time
         And enters the Location
         And enters the Text
         And selects the Design
         And selects the Font
         And he clicks on accept cookies
         And clicks on Add to basket button
         Then verifies that the Alert box is present