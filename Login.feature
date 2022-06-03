Feature: LeafTaps login functionality

Scenario Outline: Login with positive credentials
#Given Open the chrome browser
#Given Load the application URL
Given Enter the username as <username>
Given Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples: 
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#Scenario: Login with negative credentials
#Given Open the chrome browser
#Given Load the application URL
#Given Enter the username as 'Demo'
#Given Enter the password as 'crmsfa'
#When Click on Login button
#But Error message should be displayed
