Feature: Rest Update Feature

  Background:
    * url appURL

  Scenario: Update Contacts
    Given path contactUpdatePartUrl
    And header Access-Token = accessToken
    And request jsonBody
    When method POST
    * def status = responseStatus
