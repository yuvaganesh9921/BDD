
Feature: Facebook Login function-Testcase Automation
  
Background:
		Given use Lanuch Browser
   	And User navigate Url 
@FB_1012
  Scenario: Fb Login With valid details
    Given user Launch Browser 
    And User naviagte Url "https://www.facebook.com/"
    When User Verify page 1 and on login page 
    And User Enter vaild Username
    And User Enter Vaild Password 
    Then Click LoginButton
    And User Verify Loged in Sucessfull


@Adactive-A9614
    Scenario: Hotel login details
   	Given use Lanuch Browser
   	And User navigate Url 
   	And user Enter Name "Validname"
   	And user Enter Password "Invalidpasseword"
   	And user logbutton
   	And Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
   	And user Enter Name "InValidname"
   	And user Enter Password "Validpassword"
   	And user logbutton
   	And Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
   	And user Enter Name "InValidname"
   	And user Enter Password "InValidpassword"
   	And user logbutton
   	And Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
@Adactive_A9921
	Scenario Outline: Adactive hotel
		
   	And user Enter Name <Username>
   	And user Enter Password <Password>
   	And user logbutton
   	And Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
	  Examples:
	  |Username|Password|
	  |"Validname"|"Invalidpasseword"|
	  |"InValidname"|"Validpassword"|
	  |"InValidname"|"InValidpassword"|
	  