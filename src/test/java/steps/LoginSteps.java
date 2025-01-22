package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;


import static org.junit.Assert.assertEquals;

public class LoginSteps extends CommonMethods {

    WebDriver driver;
    LoginPage loginPage;

    @When("I attempt to log in with username {string} and password {string}")
    public void i_attempt_to_log_in_with_username_and_password(String username, String password) {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("http://hrmportal.com");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("I should see the error message {string}")
    public void i_should_see_the_error_message(String expectedErrorMessage) {
        assertEquals(expectedErrorMessage, loginPage.getErrorMessage());
        driver.quit();
    }
}
