@Doc&FilesPositive
Feature: feature to test doc & files functionality
  Background: User open staging-Cicle app on Mobile

  @Positive01
  Scenario: User create add a new doc
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User click plus button in doc & files
    And User click add a new doc
    And User type title
    And User type story
    And User click publish button
    Then User successfully create add a new doc

  @Positive02
  Scenario: User create add a new folder
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User click plus button in doc & files
    And User click create a new folder
    And User type name folder
    And User click create button
    Then User successfully create new folder

  @Positive03
  Scenario: User upload files
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User click plus button in doc & files
    And User click upload files
    And User send files
    And User successfully upload files

  @Positive04
  Scenario: User create add new doc on the folder
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose folder
    And User click plus button in folder
    And User click add a new doc
    And User type title
    And User type story
    And User click publish button
    Then User successfully create add a new doc

  @Positive05
  Scenario: User create add new folder on the folder
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose folder
    And User click plus button in folder
    And User click create a new folder
    And User type name folder
    And User click create button
    Then User successfully create new folder

  @Positive051
  Scenario: User create add upload file on the folder
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose folder
    And User click plus button in folder
    And User click upload files
    And User send files
    And User successfully upload files

  @Positive06
  Scenario: User edit folder name
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose folder
    And User click dot three button in doc and files
    And User click change name
    And User type edit title
    And User click checklist button in doc and files
    Then User successfully edit folder name

  @Positive07
  Scenario: User edit doc
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose doc
    And User click three dot button in doc
    And User click edit in doc
    And User type title in doc
    And User type description in doc
    And User click publish changes button
    Then User successfully edit doc

  @Positive08
  Scenario: User edit folder name on folder
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose folder
    And User choose folder
    And User click three dot button in folder
    And User click change name
    And User type edit title
    And User click checklist button in doc and files
    Then User successfully edit folder name

  @Positive09
  Scenario: User edit doc on folder
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose folder
    And User choose doc
    And User click three dot button in doc
    And User click edit in doc
    And User type title in doc
    And User type description in doc
    And User click publish changes button
    Then User successfully edit doc

  @Positive10
  Scenario: User edit doc Private
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose doc
    And User click three dot button in doc
    And User click edit in doc
    And User click private doc
    And User click publish changes button
    Then User successfully edit doc

  @Positive11
  Scenario: User edit folder Private
    Given User open staging-cicle on mobile
    When User click on mobile team in Team menu
    And User click on doc & files menu
    And User choose folder
    And User click three dot button in folder
    And User click private folder
    Then User successfully private folder

