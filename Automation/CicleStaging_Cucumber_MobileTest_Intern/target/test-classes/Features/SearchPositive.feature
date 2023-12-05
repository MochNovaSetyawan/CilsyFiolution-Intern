@SearchPositive
Feature: feature to test search functionality
  Background: User open staging-Cicle app on Mobile

  @Positive01
  Scenario: User search jump to Search team (web team)
    Given User open staging-cicle on mobile
    When User click search menu
    And User type search
    And User choose team
    Then User successfully jump to search team

  @Positive02
  Scenario: User search jump to Search kanban (web team)
    Given User open staging-cicle on mobile
    When User click search menu
    And User type search
    And User choose kanban
    Then User successfully jump to search kanban

  @Positive03
  Scenario: User search jump to Search blast (web team)
    Given User open staging-cicle on mobile
    When User click search menu
    And User type search
    And User choose blast
    Then User successfully jump to search blast

  @Positive04
  Scenario: User search jump to Search schedules (web team)
    Given User open staging-cicle on mobile
    When User click search menu
    And User type search
    And User choose schedules
    Then User successfully jump to search schedules

  @Positive05
  Scenario: User search jump to Search checkin (web team)
    Given User open staging-cicle on mobile
    When User click search menu
    And User type search
    And User choose checkin
    Then User successfully jump to search checkin

  @Positive06
  Scenario: User search jump to Search groupchat web team)
    Given User open staging-cicle on mobile
    When User click search menu
    And User type search
    And User choose groupchat
    Then User successfully jump to search groupchat

  @Positive07
  Scenario: User search jump to Search doc and file
    Given User open staging-cicle on mobile
    When User click search menu
    And User type search
    And User choose doc and file
    Then User successfully jump to search doc and file