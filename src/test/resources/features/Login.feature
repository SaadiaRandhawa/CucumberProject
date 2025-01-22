Feature: Login Validation
  Validate the login functionality for the HRMS application.

  Scenario: Attempt to log in with an empty username
    Given the user is on the login page
    When the user enters empty username and valid password
    Then the user clicks on the login button
    And the error message "Username cannot be empty." should be displayed

  Scenario: Attempt to log in with an empty password
    Given the user is on the login page
    When the user enters valid username and empty password
    Then the user clicks on the login button
    And the error message "Password is empty." should be displayed

  Scenario: Attempt to log in with incorrect credentials
    Given the user is on the login page
    When the user enters username as "wronguser" and password as "wrongpassword"
    Then the user clicks on the login button
    And the error message "Invalid credentials." should be displayed

  Scenario: Error message visibility near input fields
    Given the user is on the login page
    When the user enters invalid username and valid password
    And the user clicks on the login button
    Then the error message "Invalid credentials." should be displayed near the "username" field

  @retryLogin
  Scenario: Correcting input after an error message and logging in successfully
    Given the user is on the login page
    When the user enters invalid username and invalid  password
    And the user clicks on the login button
    Then the error message "Invalid credentials." should be displayed
    When the user enters username as "Admin" and password as "Hum@nhrm123"
    And the user clicks on the login button
    Then the user should be successfully logged in