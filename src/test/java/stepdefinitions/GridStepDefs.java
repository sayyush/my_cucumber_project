package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.WaitUtils;

import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GridStepDefs {

    WebDriver driver;

    @Given("user is on the {string} with {string}")
    public void userIsOnTheWith(String url, String browser) throws Exception {

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());

        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions());

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());

        }else {
            throw new Exception("Enter an existing browser");
        }

        //Rest is selenium (same)
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }


    @Then("verify the title is {string}")
    public void verify_the_title_is(String title) {

        String actualTitle = driver.getTitle();
        assertEquals(title, actualTitle);

    }

    @Then("close the remote driver")
    public void close_the_remote_driver() {

        WaitUtils.waitFor(3);
        driver.quit();

    }


}