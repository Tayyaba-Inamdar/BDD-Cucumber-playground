#Author Tayyaba
Feature: Download Reports

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Enter state and rto
    And User select <Y_Axis> and <X_Axis> and Click Refresh
    And User select Month and Year
    And User select Vehicle Category and Click Refresh
    Then Message displayed Maker Wise Fuel Data of RTO, State (Month,Year)

    Examples:
      | Y_Axis | X_Axis |
      | Assam(36) | BARPETA - AS15( 29-DEC-2016 ) |

