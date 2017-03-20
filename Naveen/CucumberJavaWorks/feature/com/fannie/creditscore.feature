@Smoke
Feature: To sanction the loan for customers

  Scenario: To issue loan for full time working employee
    # for issuing loan
    Given Employee has a credit score
    And According to bank standard
    When cusomter has "full" time work
    And In "govt" office
    Then Sanction loan
    But should be repay in "five" years

  Scenario: To issue loan for full time working employee
    # for issuing loan
    Given Employee has a credit score
    And According to bank standard
    When cusomter has "part" time work
    And In "private" office
    Then Sanction loan
    But should be repay in "four" years
    