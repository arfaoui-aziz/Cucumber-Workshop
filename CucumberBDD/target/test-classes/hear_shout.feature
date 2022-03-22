Feature: Shout
  Shouty App Description
  ToDo:
   - only shout to people within a certain range

  Background:
    Given  a person named Lucy
    And a person named Sean

 Rule: Shouts can be heard by other users
   Scenario: Listener hears a message
    When Sean Shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is within range
    Given the range is 100
    And people are located at
      | name | location |
      | Sean | 0        |
      | Lucy | 50       |
    When Sean Shouts
    Then Lucy hears Sean's message

  Scenario: Listener is out of range
    Given Lucy is standing 15 meter from Sean
    And people are located at
      | name | location |
      | Sean | 0        |
      | Lucy | 150      |
    When Sean Shouts
    Then Larry hears Sean's message