package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

   WebDriver driver;

    @FindBy(id="firstName")
    public WebElement firstNameLocator;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    @FindBy(id="middleName")
    public WebElement middleNameLocator;

    @FindBy(id="lastName")
    public WebElement lastNameLocator;

    public AddEmployeePage(){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameLocator.sendKeys(firstName);
    }

    public void enterMiddleName(String middleName) {
        middleNameLocator.sendKeys(middleName);
    }

    public void enterLastName(String lastName) {
        lastNameLocator.sendKeys(lastName);
    }

    public void clickAdd() {
        saveButton.click();
    }

}