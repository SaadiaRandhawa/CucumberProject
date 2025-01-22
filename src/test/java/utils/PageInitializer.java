package utils;

import pages.AddEmployeePage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static AddEmployeePage addEmployeePage;

    //Initializes all Page Object classes.
    //Ensures initialization for usage

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        addEmployeePage = new AddEmployeePage();

    }
}
