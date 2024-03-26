Feature:Test to search for jobs
  Scenario: User should be able to search automated test
    Given the user navigate to the homepage link
    When the user click on about us menu
    And the user click on careers
    And the user clicks on search all jobs
    Then search for "automation tester" in the search box
