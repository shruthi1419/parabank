Feature: Registration Functionality
Scenario: User should be able to register by providing only required details
Given User is on index page
When User clicks on register link
Then registration page will display
And User enters First Name
And User enters Last Name
And User enters Address
And User enters City
And User enters State
And User enters Zip Code
And User enters SSN
And User enters Username
And User enters Password
And User enters Password again for confirmation
Then User clicks on Register button
