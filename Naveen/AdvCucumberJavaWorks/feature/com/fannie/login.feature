@Sanity
Feature: Login Feature

# will be executed before scenario/s
Background: 
Given Launch FireFox 

@FirstDryRun
Scenario: check user for valid login 
When user successfully logs in 
|login				|password		|
|adith.naveen	|testing1		|
|lee					|hello			|
|shweta				|testing2		|
Then show inbox 


@BeforeRelease 
Scenario: check user for valid login 
When user successfully logs in 
|login				|password		|
|chitti	| hello@123		|
Then show inbox 

@AfterRelease
Scenario: check user for valid login 
When user successfully logs in 
|login				|password		|
|parag	|  hello@333		|
Then show inbox 

