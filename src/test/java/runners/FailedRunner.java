package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        This runner class will run only failed scenarios
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },

        monochrome = false,
        features = "@target/failedRerun.txt",//Declare features as @target/failedRerun.txt
        glue = {"stepdefinitions","hooks"},
        dryRun = false
        //There will be no tag
)
public class FailedRunner {
}