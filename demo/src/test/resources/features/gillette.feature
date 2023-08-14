Feature: Order with different quantities

  Scenario Outline:Add Order with quantity
    Given User searches for HP Pen Drive
    When Add the first result on the page with quantity <qty>
    Then Cart should display <qty> pen drive

    Examples:
      | qty |
      | 10  |
      | 11  |
      | 12  |
