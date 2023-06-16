package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


public class Hooks {

    //Hooks: This class is used to run methods BEFORE and AFTER each scenario
    //NOTE: We need to declare hooks package inside Runner class at the glue step.

    @Before// This annotation must be imported from --> io.cucumber.java.Before;
    public void setUp() {
        //This method will work before each scenario
        System.out.println("This is @Before method from Hooks class");
    }

    @After
    public void tearDown(Scenario scenario) {
//If the scenario fails the screenshot will be attached into report
        final byte[] screenshot;
        if (scenario.isFailed()) {
            screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
            Driver.closeDriver();
        }
    }
}