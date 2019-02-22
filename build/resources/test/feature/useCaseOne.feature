Feature: As an employee of ACME, I should be able to create and submit a new expense report

  # Use Case 1: Employee is Authenticated
  #Valid, Invalid, missing password, missing input, and null test
  Scenario Outline: Login Authentication
    Given I am on the application
    When <name> logs in with <password>
    Then the application shows the <status> login status

    Examples: 
      | name | password | status                      |
      | test | test     | success                     |
     # | test | test1    | fail                        |
     # | test | ..       | failPassword                |
     # | ..   | test     | failUsername                |
     # | ..   | ..       | failUsernameAndfailPassword |

  # Use Case 1: Employee is able to create a new expense report and associate it with its name.
  # valid, invalid, and null test
  Scenario Outline: Employee create new expense report with name
    Given I am on the application
    When <name> logs in with <password>
    And the employee creates a new expense report with <expenseName>
    Then expense report is made with <expenseName>

    Examples: 
      | name | password | expenseName |
      | test | test     | validName   |
      | test | test     | ..          |

  # Use Case 1: Employee is able to enter an unlimited number of line item details
  # for each expense item - type, description, date, cost and attach receipt
  # one line, multiple lines, one line with null variables
  @Ignore
  Scenario Outline: adding unlimited number of line items
    Given I am on the application
    When <name> logs in with <password>
    And the employee creates a new expense report with <expenseName>
    And the employee adds expense details for <type>, <description>, <date>, <cost>, and <receipt>
    Then the expense report will be updated with <status>

    Examples: 
      | name | password | expenseName | type   | description | date   | cost   | receipt | status |
      | test | test     | dummy1      | dummy1 | dummy1      | dummy1 | dummy1 | dummy1  | dummy1 |
      | test | test     | dummy1      | dummy1 | dummy1      | dummy1 | dummy1 | dummy1  | fail   |
      | test | test     | ..          | ..     | ..          | ..     | ..     | dummy1  | fail   |

  # Use Case 1: Employee should be able to submit the expense report and calculate
  # one line, multiple line, no line calculation
  Scenario Outline: Employee is able to search for another employee(s)
    Given I am on the application
    When <name> logs in with <password>
    And the employee creates a new expense report with <expenseName>
    And the employee adds expense details for <type>, <description>, <date>, <cost>, and <receipt>
    Then the expense report will be calculated with <status>

    Examples: 
      | name | password | expenseName | type | description | date | cost | receipt | status  |
      | test | test     |             |      |             |      |      |         | success |
      | test | test     |             |      |             |      |      |         | fail    |
      | test | test     | ..          |      | ..          | ..   | ..   |         | fail    |

  #Use Case 1: Employee should be able to submit the expense report for review and approval
  Scenario Outline: Employee is able to submit expense report
    Given I am on the application
    When <name> logs in with <password>
    And the employee creates a new expense report with <expenseName>
    And the  employee adds expense details for <type>, <description>, <date>, <cost>, and <receipt>
    And the employee submits the report
    Then the expense report will be submitted with <status>

    Examples: 
      | name | password | expenseName | type | description | date | cost | receipt | status  |
      | test | test     |             |      |             |      |      |         | success |
      | test | test     |             |      |             |      |      |         | fail    |
      | test | test     | ..          |      | ..          | ..   | ..   |         | fail    |

  #Use Case 1: Employee should be able to submit the expense report for review and approval
  Scenario Outline: Employee is able to submit expense report
    Given I am on the application
    When <name> logs in with <password>
    And the employee creates a new expense report with <expenseName>
    And the  employee adds expense details for <type>, <description>, <date>, <cost>, and <receipt>
    And the employee submits the report
    Then the expense report will be submitted with <status>

    Examples: 
      | name | password | expenseName | type | description | date | cost | receipt | status |
      | test | test     |             |      |             |      |      |         | fail   |
      | test | test     | ..          |      | ..          | ..   | ..   |         | fail   |

  #Use Case 1: Employee should be able to submit the expense report for review and approval
  Scenario Outline: Employee is able to submit expense report
    Given I am on the application
    When <name> logs in with <password>
    And the employee creates a new expense report with <expenseName>
    And the  employee adds expense details for <type>, <description>, <date>, <cost>, and <receipt>
    And the employee submits the report
    Then the expense report will be submitted with <status>

    Examples: 
      | name | password | expenseName | type | description | date | cost | receipt | status |
      | test | test     | ..          |      | ..          | ..   | ..   |         | fail   |
