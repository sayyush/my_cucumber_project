package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefs {
    //    Note we are not going to use @Test to create test cases anymore
//    Cucumber created test methods using gherkin and java
//    We use RUNNER class to create these step definitions
    GooglePage googlePage = new GooglePage();

    @Given("user search for iPhone")
    public void user_search_for_i_phone() {
        googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("verify the page title contains iPhone")
    public void verify_the_page_title_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }


    @Given("user search for porcelain_tea_pot")
    public void user_search_for_porcelain_tea_pot() {
        googlePage.searchBox.sendKeys("porcelain tea pot"+Keys.ENTER);
    }
    @Then("verify the page title contains porcelain_tea_pot")
    public void verify_the_page_title_contains_porcelain_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("porcelain tea pot"));
    }


    @Given("user search for {string}")
    public void user_search_for(String string) {
        googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }


    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

}