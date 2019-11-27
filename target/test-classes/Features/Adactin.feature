Feature: Verifing the adactin web page

  Scenario Outline: Verify the login with valid credentials
    Given User is on adactin page
    When User enters "<username>"and"<password>"
    And User clicks login button
    Then User verify success message

    Examples: 
      | username         | password |
      | nitishselvakumar | s1740034 |

  Scenario Outline: Verify the Search Hotel page
    When User select "<Location>"and"<Hotels>"and"<Room Type>"and"<Number of Rooms>"and"<Adults per Room>"and"<Children per Room>"
    And User click search button

    Examples: 
      | Location | Hotels      | Room Type | Number of Rooms | Adults per Room | Children per Room |
      | Sydney   | Hotel Creek | Standard  | 1 - One         | 1 - One         | 1 - One           |

  Scenario: verify the Select Hotel page
    When User select the Hotel
    And User click the continue button

  Scenario Outline: verify the search hotel page
    When User enter "<First Name>"and"<Last Name>"and"<Billing Address>"and"<Credit Card No>"and"<Credit Card Type>"and"<Select month>"and"<Select year>"and"<CVV Number>"
    And User click BookNow button

    Examples: 
      | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | Select month | Select year | CVV Number |
      | nitish     | selva     | Chennai         | 1234567890123456 | VISA             | January      |        2022 |        826 |

  Scenario: verify the confirmation page
    When User click search hotel
    
