Feature: Check Shopping Functions


  Scenario: Buy a summer dress and verify the cart
    Given Automation practice application is opened
    When I click on Dresses menu option
    And I click on Summer Dresses sub menu option
    And I should see Summer Dresses page loaded
    And I select dress and colour
    And I add item to Cart
    And I navigate back to Summer Dresses Page
    And I verify contents of the cart has selected colour

