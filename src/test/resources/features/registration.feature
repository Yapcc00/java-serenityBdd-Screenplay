Feature: Registration

  Scenario: Succesful registration
    Given Pepito wants to sing up in the aplication
    When Pepito sends the requieres information to song up
    Then Pepito should have a new account created

  Scenario: Missing requiered fields for registration
    Given Pepito wants to sing up in the aplication
    When Pepito does not send the requiere the information
    Then Pepito should be told all fields are requiered


