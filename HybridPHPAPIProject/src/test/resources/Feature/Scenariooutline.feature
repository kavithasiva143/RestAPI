Feature: verifying change2TestAutomationAPI using datadriven concept
Scenario Outline: validating post method with multiple values
Given the user has post method details "<Title>" "<body>" "<author>"
When the user send post HTTP request
Then user gets message data inserted succesfully

Examples:
|Title|body|author|
|kavitha|anisha|trisha|
|kavitha1|anisha1|trisha1|

Scenario Outline: validating put method with multiple values
Given the user has put method details "<author>" "<id>"
When the user send put HTTP request
Then user gets message data updated succesfully

Examples:
|author|id|
|appu|937|

Scenario Outline: validating delete method with multiple values
Given the user has delete method details "<id>"
When the user send delete HTTP request
Then user gets message data deleted succesfully

Examples:
|id|
|48|
