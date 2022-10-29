Feature: Rest Update Feature

  Background:
    * url 'https://api.smartsender.io/v3'

  Scenario: Update Contacts
    * def dataInput =
    """
{
  json: '#(jsonBody)',
  partUrl: '#(partUrl)',
  accessToken: '#(accessToken)'
    }
    """
    Given path  dataInput.partUrl
    And header Access-Token = dataInput.accessToken
    And request dataInput.json
    When method POST
    * def status = responseStatus
