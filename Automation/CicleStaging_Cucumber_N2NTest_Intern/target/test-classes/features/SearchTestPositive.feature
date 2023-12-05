@SearchPositive
Feature: User can use search properly

  @Positive01
  Scenario: User search jump to Search team
    Given User click search colloumn
    When User type search
    And User choose team
    Then User successfully jump to search team

  @Positive02
  Scenario: User search jump to Search kanban
    Given User click search colloumn
    When User type search
    And User choose kanban
    Then User successfully jump to search kanban

  @Positive03
  Scenario: User search jump to Search blast
    Given User click search colloumn
    When User type search
    And User choose blast
    Then User successfully jump to search blast

  @Positive04
  Scenario: User search jump to Search schedules
    Given User click search colloumn
    When User type search
    And User choose schedules
    Then User successfully jump to search schedules

  @Positive05
  Scenario: User search jump to Search checkin
    Given User click search colloumn
    When User type search
    And User choose checkin
    Then User successfully jump to search checkin

  @Positive06
  Scenario: User search jump to Search groupchat
    Given User click search colloumn
    When User type search
    And User choose groupchat
    Then User successfully jump to search groupchat

  @Positive07
  Scenario: User search jump to Search doc and file
    Given User click search colloumn
    When User type search
    And User choose doc and file
    Then User successfully jump to search doc and file