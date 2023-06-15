package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BRHomePage;
import pages.BRLoginPage;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.verifyElementDisplayed;

public class BlueRentalStepDefs {

 BRHomePage brHomePage = new BRHomePage();
 BRLoginPage brLoginPage = new BRLoginPage();

 @When("user clicks on login button")
 public void user_clicks_on_login_button() {

  brHomePage.homeLoginLink.click();

 }

 @And("user enters {string} and {string}")
 public void userEntersAnd(String email, String password) {

  brLoginPage.userEmail.sendKeys(email);
  brLoginPage.userPassword.sendKeys(password);
  WaitUtils.waitFor(2);

 }


 @When("user clicks on login submit button")
 public void user_clicks_on_login_submit_button() {

  brLoginPage.loginSubmitButton.click();
  //assertTrue(false);//Failed on purpose

 }
 @Then("verify the login is successful")
 public void verify_the_login_is_successful() {

  //assertTrue(brHomePage.userID.isDisplayed());
  verifyElementDisplayed(brHomePage.homeLoginLink);

 }
 @Then("user logs out the application")
 public void user_logs_out_the_application() {
  WaitUtils.waitFor(1);
  brHomePage.userID.click();
  WaitUtils.waitFor(1);
  brHomePage.logOut.click();
  WaitUtils.waitFor(1);
  brHomePage.OK.click();

 }


}