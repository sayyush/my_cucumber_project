package testng_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class TitleTest_Edge {

    WebDriver driver;

    @Test
    public void titleTest() throws MalformedURLException, InterruptedException {

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());
        driver.get("https://www.bluerentalcars.com");
        String actualTitle = driver.getTitle();
        assertEquals("Blue Rental Cars | Cheap, Hygienic, VIP Car Hire", actualTitle);
        Thread.sleep(3000);
        driver.close();

    }

}