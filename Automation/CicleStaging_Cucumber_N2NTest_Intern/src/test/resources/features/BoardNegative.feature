@BoardNegative
Feature: User can use board properly

  @BoardNegative01
  Scenario: User create new board list without words
    Given User click nova team
    When User click board box menu
    And User click add new list
    And User type without words list Coloumn
    And User click create button
    Then User cant see the result of create new board without words

  @BoardNegative02
  Scenario: User create new board list only with space
    Given User click nova team
    When User click board box menu
    And User click add new list
    And User type only with space list Coloumn
    And User click create button
    Then User cant see the result of create new board only with space

  @Positive03
  Scenario: User create new card without words
    Given User click nova team
    When User click board box menu
    And User click add card
    And User type without words card name
    And User click add card button
    Then User cant see the result of create new card without words

  @Positive04
  Scenario: User create new card only with space
    Given User click nova team
    When User click board box menu
    And User click add card
    And User type only with space card name
    And User click add card button
    Then User cant see the result of create new card only with space

  @Positive05
  Scenario: User add comment in board without words
    Given User click nova team
    When User click board box menu
    And User choose card
    And User type without words comment
    And User click post button
    Then User unsuccessfully add comment in board without words

  @Positive06
  Scenario: User add comment in board only with space
    Given User click nova team
    When User click board box menu
    And User choose card
    And User type only with space comment
    And User click post button
    Then User unsuccessfully add comment in board only with space

  @Positive07
  Scenario: User create label without words
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click label button
    And User click add label button
    And User type without words name label coloumn
    And User choose color label
    And User click create button
    Then User cant add label in board without words

  @Positive08
  Scenario: User create label only with space
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click label button
    And User click add label button
    And User type only with space name label coloumn
    And User choose color label
    And User click create button
    Then User cant add label in board only with space