package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BRHomePage;
import pages.BRLoginPage;
import utilities.WaitUtils;

import java.util.List;
import java.util.Map;

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

 @When("user enters username and password")
 public void user_enters_username_and_password(DataTable dataTable) {

  //1st Way: List<String>
//        List<String> usernameAndPassword = dataTable.row(1);//index stars with 0
//        System.out.println("usernameAndPassword = " + usernameAndPassword);//[sam.walker@bluerentalcars.com, c!fas_art]
//        WaitUtils.waitFor(1);
//        brLoginPage.userEmail.sendKeys(usernameAndPassword.get(0));//sam.walker@bluerentalcars.com
//        WaitUtils.waitFor(1);
//        brLoginPage.userPassword.sendKeys(usernameAndPassword.get(1));//c!fas_art

//        //2nd Way: List<Map<String,String>> --> With indexes
//        List<Map<String, String>> usernameAndPassword = dataTable.asMaps();
//        System.out.println("usernameAndPassword = " + usernameAndPassword);//[{username=sam.walker@bluerentalcars.com, password=c!fas_art}]
//        WaitUtils.waitFor(1);
//        brLoginPage.userEmail.sendKeys(usernameAndPassword.get(0).get("username"));
//        WaitUtils.waitFor(1);
//        brLoginPage.userPassword.sendKeys(usernameAndPassword.get(0).get("password"));

  //2nd Way:  List<Map<String,String>> --> With foreach loop
  List<Map<String, String>> usernameAndPassword = dataTable.asMaps();
  System.out.println("usernameAndPassword = " + usernameAndPassword);//[{username=sam.walker@bluerentalcars.com, password=c!fas_art}]

  for (Map<String, String> w : usernameAndPassword){

   brLoginPage.userEmail.sendKeys(w.get("username"));
   WaitUtils.waitFor(1);
   brLoginPage.userPassword.sendKeys(w.get("password"));
   WaitUtils.waitFor(1);

  }

 }

 @When("user enters username and password loop")
 public void user_enters_username_and_password_loop(DataTable dataTable) {
  List<Map<String, String>> usernameAndPassword = dataTable.asMaps();//
  System.out.println("usernameAndPassword = " + usernameAndPassword);//[{username=sam.walker@bluerentalcars.com, password=c!fas_art}, {username=kate.brown@bluerentalcars.com, password=tad1$Fas}, {username=raj.khan@bluerentalcars.com, password=v7Hg_va^}, {username=pam.raymond@bluerentalcars.com, password=Nga^g6!}]
  for (Map<String, String> w : usernameAndPassword){
   brHomePage.homeLoginLink.click();
   brLoginPage.userEmail.sendKeys(w.get("username"));
   WaitUtils.waitFor(1);
   brLoginPage.userPassword.sendKeys(w.get("password"));
   WaitUtils.waitFor(1);
   brLoginPage.loginSubmitButton.click();
   WaitUtils.waitFor(1);
   WaitUtils.waitFor(1);
   brHomePage.userID.click();
   WaitUtils.waitFor(1);
   brHomePage.logOut.click();
   WaitUtils.waitFor(1);
   brHomePage.OK.click();
  }

 }
 @And("test fails")
 public void testFails() {
  assertTrue(false);
 }
}