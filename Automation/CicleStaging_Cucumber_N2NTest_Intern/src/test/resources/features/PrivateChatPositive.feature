@PrivateChatPositive
Feature: feature to test private chat functionality
  Background: User open staging-Cicle app on Mobile

  @PrivateChatPositive01
  Scenario: User send private chat
    Given User click Profile
    When User click Private chat
    And User click contact for send private chat
    And User type chat
    And User click send
    Then User successfully send private chat

  @PrivateChatPositive02
  Scenario: User delete chat
    Given User click Profile
    When User click Private chat
    And User click contact for send private chat
    And User click menu message
    And User click delete message
    And User click delete
    Then User successfully delete chat

  @PrivateChatPositive03
  Scenario: User caption private chat
    Given User click Profile
    When User click Private chat
    And User click contact for send private chat
    And User type caption chat
    And User choose contact caption
    And User click send
    Then User successfully send caption in private chat

  @PrivateChatPositive04
  Scenario: User send attachment in private chat
    Given User click Profile
    When User click Private chat
    And User click contact for send private chat
    And User click attachment button in private chat
    And User send Attachment in private chat
    And User successfully send attachment in private chat