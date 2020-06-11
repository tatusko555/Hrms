#Author: GOAT Testers
Feature: Dashboard

  Background: 
    Given user is logged with valid admin credentials

  @dash
  Scenario: Dashboard menu view of admin
    Then user see dashboard menu is displayed
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |

  @HW
  Scenario: modify employee personal details
    And user navigates to AddEmployeePage
    When user enters employees first name and last name
    And user clicks save button
    And user clicks on edit button
    Then user modifies employee personal data
      | Drivers License Number | License Expiry Date | SSN Number | SIN Number | Gender | Marital Status | Nationality | Date of Birth | Nick Name | Military Service |
      |              345867576 | 2025-May-05         | 3335678989 |   09876433 | Male   | Single         | British     | 1907-Jan-07   | Bond007   | Yes              |
