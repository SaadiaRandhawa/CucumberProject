package steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddEmployeePage;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {

    WebDriver driver;
    AddEmployeePage addEmployeePage;

    @When("I add an employee with first name {string}, middle name {string}, last name {string}, and employee ID {string}")
    public void i_add_an_employee(String firstName, String middleName, String lastName, String employeeId) {
        driver = new ChromeDriver();
        addEmployeePage = new AddEmployeePage();
        driver.get("http://hrmportal.com/addEmployee");
        addEmployeePage.enterFirstName(firstName);
        addEmployeePage.enterMiddleName(middleName);
        addEmployeePage.enterLastName(lastName);
        addEmployeePage.clickAdd();

    }
    @Then("I should see the employee added successfully")
    public void i_should_see_the_employee_added_successfully() {

        driver.quit();
    }

}