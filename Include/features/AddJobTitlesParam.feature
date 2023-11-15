Feature: Add Job Title
Scenario Outline: User Successfully Add Job Title

Given User go to login page
When User go to Add Job Title page
And Start masukkan job title details, such as <jobTitle>, <jobDescription> and <note>
Then User press save button

Examples: 
|jobTitle|jobDescription|note|
|JB1|description A|note b|