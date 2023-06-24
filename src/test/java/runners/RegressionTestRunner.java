package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
//        ADDING CONFIGURATIONS
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome = false,
        features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = {"stepdefinitions"},//PATH OF STEPDEFINITIONS FOLDER
        dryRun = false,//dryRun = true : RUNS AND GENERATES ONLY MISSING STEP DEFS. dryRun = false: RUN NORMAL. THIS IS DEFAULT VALUE
        tags = "regression_test_runner"
)
public class RegressionTestRunner {
}

/*
 first_feture_file  file'in icine    regression_test_runner koyduk
 */