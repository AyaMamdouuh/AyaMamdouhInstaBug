Feature: Facebook Login
  Background:
    Given user open the browser
    And clear all cookies
    And user navigate to the url
  Scenario Outline:  user login on Facebook with valid credentials
    When user
