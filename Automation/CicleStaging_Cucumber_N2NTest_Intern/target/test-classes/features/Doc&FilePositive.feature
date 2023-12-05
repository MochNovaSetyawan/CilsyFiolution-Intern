@Doc&filePositive
Feature: User can use board properly

  @Doc&filePositive01
  Scenario: User create add a new doc
    Given User click nova team
    When User click doc & file box menu
    And User click add item here button
    And User click add a new doc
    And User type title
    And User type story
    And User click publish button
    Then User successfully create add a new doc

  @Doc&filePositive02
  Scenario: User create add a new folder
    Given User click nova team
    When User click doc & file box menu
    And User click add item here button
    And User click create a new folder
    And User type name folder
    And User click Save button
    Then User successfully create new folder

  @Doc&filePositive03
  Scenario: User upload files
    Given User click nova team
    When User click doc & file box menu
    And User click add item here button
    And User click upload files
    And User send files
    And User successfully upload files

  @Doc&filePositive04
  Scenario: User create add new doc on the folder
    Given User click nova team
    When User click doc & file box menu
    And User choose folder
    And User click add item here button
    And User click add a new doc
    And User type title
    And User type story
    And User click publish button
    Then User successfully create add a new doc

  @Doc&filePositive05
  Scenario: User create add new folder on the folder
    Given User click nova team
    When User click doc & file box menu
    And User choose folder
    And User click add item here button
    And User click create a new folder
    And User type name folder
    And User click Save button
    Then User successfully create new folder

  @Doc&filePositive06
  Scenario: User edit folder name
    Given User click nova team
    When User click doc & file box menu
    And User choose folder
    And User click edit this folder button
    And User click edit button
    And User type edit title
    And User click publish changes button
    Then User successfully edit folder name

  @Doc&filePositive07
  Scenario: User edit doc
    Given User click nova team
    When User click doc & file box menu
    And User choose folder
    And User choose doc
    And User click three dot button in doc
    And User click edit in doc
    And User type title in doc
    And User type description in doc
    And User click publish changes button
    Then User successfully edit doc

  @Doc&filePositive08
  Scenario: User edit folder name on folder
    Given User click nova team
    When User click doc & file box menu
    And User choose folder
    And User choose folder
    And User click edit this folder button
    And User click edit button
    And User type edit title
    And User click publish changes button
    Then User successfully edit folder name

  @Doc&filePositive09
  Scenario: User edit doc on folder
    Given User click nova team
    When User click doc & file box menu
    And User choose folder
    And User choose doc
    And User click three dot button in doc
    And User click edit in doc
    And User type title in doc
    And User type description in doc
    And User click publish changes button
    Then User successfully edit doc

  @Doc&filePositive10
  Scenario: User edit doc Private
    Given User click nova team
    When User click doc & file box menu
    And User choose doc
    And User click three dot button in doc
    And User click edit in doc
    And User click private doc
    And User click publish changes button
    Then User successfully edit doc

  @Doc&filePositive11
  Scenario: User edit folder Private
    Given User click nova team
    When User click doc & file box menu
    And User choose folder
    And User click edit this folder button
    And User click edit button
    And User click private doc
    And User click publish changes button
    Then User successfully edit folder name
