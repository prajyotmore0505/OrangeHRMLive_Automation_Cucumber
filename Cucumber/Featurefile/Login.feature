Feature: Test  OrangeHRM application

Scenario Outline: Test Login Scenario

Given Launch OrangeHRM

When user enter valid "<username>" and "<password>"

Then Login should be success

Examples:
|username|password|
|admin|admin123|
|admin1|admin1|
|admin2|admin2|