package testng_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class TitleTest_Chrome {

    WebDriver driver;

    @Test
    public void titleTest() throws MalformedURLException, InterruptedException {

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
        driver.get("https://www.bluerentalcars.com");
        String actualTitle = driver.getTitle();
        assertEquals("Blue Rental Cars | Cheap, Hygienic, VIP Car Hire", actualTitle);
        Thread.sleep(3000);
        driver.close();

    }

}