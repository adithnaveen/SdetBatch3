@Sanity
Feature: Login Feature

Scenario: check user for valid login 
When user successfully logs in 
|login				|password		|
|adith.naveen	|testing1		|
|lee					|hello			|
|shweta				|testing2		|

Then show inbox 

