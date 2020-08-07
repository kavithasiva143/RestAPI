Feature: verify change2testautomation API
Scenario: validating post method
Given The user has Post method details 
When the user call Post API with post HTTP method
Then the user receive post status code success 

Scenario: validating put method
Given the user has put method details
When the user call put API with put HTTP method
Then the user receive put status code success

Scenario: validating get method
Given the user has get method details
When the user call get with get HTTP method
Then the user receive get status code success