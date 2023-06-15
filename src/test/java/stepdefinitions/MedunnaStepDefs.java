package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MedunnaPage;
import utilities.WaitUtils;

public class MedunnaStepDefs {
    MedunnaPage medunnaPage = new MedunnaPage();

    @Given("user clicks on icon")
    public void user_clicks_on_icon() {
        WaitUtils.waitFor(1);
        medunnaPage.userIcon.click();
    }

    @When("user clicks on sign in link")
    public void user_clicks_on_sign_in_link() {
        WaitUtils.waitFor(1);
        medunnaPage.signInLink.click();
    }

    @When("user enters username {string} and {string}")
    public void user_enters_username_and(String username, String password) {

        WaitUtils.waitFor(1);
        medunnaPage.username.sendKeys(username);
        WaitUtils.waitFor(1);
        medunnaPage.password.sendKeys(password);

    }

    @When("user clicks on sign in  submit button")
    public void user_clicks_on_sign_in_submit_button() {

        WaitUtils.waitFor(1);
        medunnaPage.submitButton.click();

    }
}