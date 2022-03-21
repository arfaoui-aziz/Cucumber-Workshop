Feature:
  Scenario: Listener is within range
    Given Lucy is located 15 meter from Sean
    When Sean Shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is within range
    Given Lucy is standing 15 meter from Sean
    When Sean Shouts "free coffe"
    Then Lucy hears Sean's message