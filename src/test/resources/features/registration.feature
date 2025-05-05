Feature: Registration

  Scenario Outline: Succesful registration
    Given Pepito wants to sing up in the aplication
    When Pepito sends the requieres information to song up
      | <Name> | <LastName> | <Age> | <Email> | <Country> |
    Then Pepito should have a new account created
    Examples:
      | Name   | LastName     | Age | Email         | Country  |
      | Yeison | Parra        | 23  | t@gmail.com   | Colombia |
      | Andres | CordobaParra | 26  | twq@gmail.com | Colombia |
      | Yetyo  | Cordoba      | 30  | tsq@gmail.com | Colombia |

  Scenario: Missing requiered fields for registration
    Given Pepito wants to sing up in the aplication
    When Pepito does not send the requiere the information
    Then Pepito should be told all fields are requiered


