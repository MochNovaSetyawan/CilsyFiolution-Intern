@PrivateChatPositive
Feature: feature to test private chat functionality
  Background: User open staging-Cicle app on Mobile

  @PrivateChatPositive01
  Scenario: User send private chat
    Given User open staging-cicle on mobile
    When User click menu in home page
    And User click inbox
    And User click contact for send private chat
    And User type chat
    And User click send
    Then User successfully send private chat

  @PrivateChatPositive02
  Scenario: User copy chat
    Given User open staging-cicle on mobile
    When User click menu in home page
    And User click inbox
    And User click contact for send private chat
    And User click message
    And User click copy
    Then User successfully copy chat

  @PrivateChatPositive03
  Scenario: User delete chat
    Given User open staging-cicle on mobile
    When User click menu in home page
    And User click inbox
    And User click contact for send private chat
    And User click message
    And User click delete
    And User click ok
    Then User successfully delete chat

  @PrivateChatPositive04
  Scenario: User caption private chat
    Given User open staging-cicle on mobile
    When User click menu in home page
    And User click inbox
    And User click contact for send private chat
    And User click caption button
    And User choose contact caption
    And User click send
    Then User successfully send caption in private chat

  @PrivateChatPositive05
  Scenario: User send attachment in private chat
    Given User open staging-cicle on mobile
    When User click menu in home page
    And User click inbox
    And User click contact for send private chat
    And User click attachment button
    And User click Document & Video
    And User send Attachment
    And User successfully send attachment in private chat







