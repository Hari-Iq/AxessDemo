
Feature: To validate Login functionality of facebook application
Background: 
Given To launch the browser and valid url


Scenario: To vaildate login using Valid credentials

When To launch the vaild username
And To launch the Valid Password
Then To close the Browser

Scenario: To validate login using invalid credentials
When To launch the vaild username
And To launch invalid password
Then To close the Browser

