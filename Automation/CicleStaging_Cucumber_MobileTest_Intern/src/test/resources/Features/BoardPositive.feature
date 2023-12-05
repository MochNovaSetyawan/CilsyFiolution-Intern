@BoardPositive
Feature: feature to test Board functionality
  Background: User open staging-Cicle app on Mobile

  @BoardPositive01
  Scenario: User create new board list
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click add new list
    And User type list in board
    And User click submit button in board
    Then User successfully create new board list

  @BoardPositive02
  Scenario: User create new card
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click add card in board
    And User type card name in board
    And User click checklist button in board
    Then User can see the result of create new card

  @BoardPositive03
  Scenario: User edit board list name
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User double click list name
    And User type edit list
    And User click checklist button in list
    Then User successfully edit board list name

  @BoardPositive04
  Scenario: User edit card
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click edit card name button
    And User type edit card
    And User click checklist button in card
    Then User successfully edit card

  @BoardPositive05
  Scenario: User add description in card
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click edit description card  button
    And User type description in card
    And User click publish in card
    Then User successfully add description in card

  @BoardPositive06
  Scenario: User edit description in card
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click edit description card  button
    And User type edit description in card
    And User click publish in card
    Then User successfully edit description in card

  @BoardPositive07
  Scenario: User add comment in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click add new comment
    And User type comment
    And User click submit button in board
    Then User successfully add comment in board

  @BoardPositive08
  Scenario: User edit comment in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click three dot button in comment
    And User click edit comment button in board
    And User type edit comment
    And User click submit button in board
    Then User successfully edit comment in board

  @BoardPositive09
  Scenario: User cheers in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click cheers in board
    And User type cheers
    And User click checklist button cheers in board
    Then User successfully cheers in board

  @BoardPositive10
  Scenario: User cheers comment in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click cheers comment in board
    And User type cheers
    And User click checklist button cheers comment  in board
    Then User successfully cheers comment in board

  @BoardPositive11
  Scenario: User add subcriber in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click plus button in board
    And User click member
    And User click done button in card
    Then User can add sucriber in board

  @BoardPositive12
  Scenario: User create label
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click label button
    And User click create new label button
    And User type name label coloumn
    And User choose color label
    And User click submit button in board
    Then User can add label in board

  @BoardPositive13
  Scenario: User add label
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click label button
    And User choose label
    Then User successfully add label

  @BoardPositive14
  Scenario: User remove label
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click label button
    And User click delete button in board
    And User click delete
    Then User successfully delete label

  @BoardPositive15
  Scenario: User send attachment in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click attach file button
    And User send Attachment
    Then User successfully send attachment

  @BoardPositive16
  Scenario: User edit attachment in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click dot three button in attachment on card
    And User click edit title button
    And User type edit name attachment
    And User click update
    Then User successfully edit name attachment

  @BoardPositive17
  Scenario: User delete attachment in board
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click dot three button in attachment on card
    And User click remove in attachment
    And User click ok
    Then User successfully delete attachment

  @BoardPositive18
  Scenario: User makes the card private
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click dot three button in card
    And User set card to private
    Then User successfully makes the card private

  @BoardPositive19
  Scenario: User makes the card public
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click dot three button in card
    And User set card to public
    Then User successfully makes the card public

  @BoardPositive20
  Scenario: User set due date
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click set due date button
    And User set date in card
    And user click ok in card
    And User set time in card
    And user click ok in card
    Then User successfully set due date

  @BoardPositive21
  Scenario: User remove due date
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User choose card
    And User click x button
    Then User successfully remove due date

  @BoardPositive22
  Scenario: User set as a complete list
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click three dot button
    And User set as a complete list
    Then User successfully set as a complete list

  @BoardPositive23
  Scenario: User set as a uncomplete list
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click three dot button
    And User set as a uncomplete list
    Then User successfully set as a uncomplete list

  @BoardPositive24
  Scenario: User move card list
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And user create new list for move card
    And User click dot three button in card move
    And User click move button
    And User click move list
    And User choose move list
    And User click checklist button in move card
    Then User successfully move card
    And Card back to normaly

  @BoardPositive25
  Scenario: User archive list
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on Board menu
    And User click three dot button
    And User click archive
    Then User successfully archive list