@BoardNegative
Feature: feature to test Board functionality
  Background: User open staging-Cicle app on Mobile

  @BoardNegative01
  Scenario: User create new board list without words
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click add new list
    And User type wihout words list in board
    And User click submit button in board
    Then User unsuccessfully create new board list without word

  @BoardNegative02
  Scenario: User create new card without words
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click add card in board
    And User type without words card name in board
    And User click checklist button in board
    Then User cant see the result of create new card

  @BoardNegative03
  Scenario: User create new board list only with space
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click add new list
    And User type only with space list in board
    And User click submit button in board
    Then User unsuccessfully create new board list only with space

  @BoardNegative04
  Scenario: User create new card only with space
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click add card in board
    And User type only with space card name in board
    And User click checklist button in board
    Then User cant see the result of create new card only with space

  @BoardNegative05
  Scenario: User add comment in board without words
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click add new comment
    And User type without words comment
    And User click submit button in board
    Then User unsuccessfully add comment in board without words

  @BoardNegative06
  Scenario: User add comment in board only with space
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click add new comment
    And User type only with space comment
    And User click submit button in board
    Then User unsuccessfully add comment in board only with space

  @BoardNegative07
  Scenario: User create label without words
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click label button
    And User click create new label button
    And User type without words name label coloumn
    And User choose color label
    And User click submit button in board
    Then User cant add label in board without words

  @BoardNegative08
  Scenario: User create label only with space
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click label button
    And User click create new label button
    And User type only with space name label coloumn
    And User choose color label
    And User click submit button in board
    Then User cant add label in board only with space



