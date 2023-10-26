@Test
  Feature: Test different actions on a sandbox page

    Scenario: As a test engineer, I try out different actions on a sandbox page
      Given I navigate to the sandbox page
      And select a option from the dropdown
      Then the option is selected