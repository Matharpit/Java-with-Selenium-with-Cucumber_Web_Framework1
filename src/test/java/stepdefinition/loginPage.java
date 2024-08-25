package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class loginPage {

    @Given("User Navigate to shoe portal application")
    public void user_navigate_to_shoe_portal() throws IOException {
        HomePage.open_shoe_app_portal();
    }

    @When("User Navigate to login page")
    public void user_navigate_to_login() throws InterruptedException {
        HomePage.click_on_main_menu();
        HomePage.click_on_signin_menuoption();
    }

    @When("Provide the credentials")
    public void provide_credentials()
    {
        LoginPage.login_with_credentials();
    }

    @Then("User should successfully loggedIn")
    public void verify_user_loggedin()
    {
        LoginPage.verify_user_login();
    }
}
