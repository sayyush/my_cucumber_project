package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;
import utilities.Driver;
import utilities.MediaUtils;

import java.io.IOException;

public class CommonStepDefs {
    GooglePage googlePage = new GooglePage();

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        Driver.getDriver().get(string);
        try{
            googlePage.popUpAccept.click();//If there is a pop up on google clicking
        }catch (Exception e){

        }
    }

    @When("capture screenshot")
    public void captureScreenshot() throws IOException {

        MediaUtils.takeScreenshotOfTheEntirePage();

    }
}