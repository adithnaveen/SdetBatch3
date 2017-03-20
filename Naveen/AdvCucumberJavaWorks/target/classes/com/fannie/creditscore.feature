@Smoke
Feature: To sanction the loan for customers

  Scenario Outline: To issue loan for full time working employee
    # for issuing loan
    Given Employee has a credit score
    And According to bank standard
    When cusomter has "<timed>" time work
    And In "<officetype>" office
    Then Sanction loan
    But should be repay in "<noofyears>" years
    

    
Examples: 
|timed		|		officetype		|	noofyears		|
|full			|		govt					|	5						|
|part			|		private				|	4						|
|full			|		private				|	4						|
