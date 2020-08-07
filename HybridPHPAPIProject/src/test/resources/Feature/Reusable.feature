Feature: verifying  the change2TestAutomationAPI with reusable method concept
Scenario: validating the reusable method concept
Given the user has API method details
When the user use "postapi" and "postpayload" method
Then the "message" in the respose body is "Data Inserted Successfully"  