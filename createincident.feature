Feature: servicenow
Scenario Outline: create incident
When click all
And click incidents
And click new
And get the incident number
Given enter the short desc as <description>
And click submit
#And select the number option from dropdown
#And enter the get text incident number
#And print the created incident number 
 
Examples:
|description|
|'created via automation in cucumber using POM'|
|'created by dataprovider parallel in cucumber'|

