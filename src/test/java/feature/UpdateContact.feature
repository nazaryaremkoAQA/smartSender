Feature: Rest Update Feature

  Background:
    * url appURL

  Scenario: Update Contacts
    * def dataInput =
    """
{
  json: '#(jsonBody)'
      }
    """
    Given path contactUpdatePartUrl
    And header Access-Token = accessToken
    And request dataInput.json
    When method POST
    * def status = responseStatus
