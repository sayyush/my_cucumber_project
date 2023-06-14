package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Bu sinif Test caseleri RUN etmek icin kullanilir.
// Ve konfigurasyonlar icin kullanilir.

@RunWith(Cucumber.class)  // it is used to class runable (like a main method)
@CucumberOptions(
        // ADDING CONFIGURATIONS
//        plugin = {
//                "pretty",
//                "html:target/default-cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml"
//        },
//        monochrome = true,
                                                    // "@CucumberOptions " :it is used to add new plugins,
                                                    // path of the step definition and path of feature file   1 defa kullaniliyor
        features = "src/test/resources/features",  // PATH OF "FEATURES" FOLDER
        glue = "stepdefinitions",                 // PATH OF "STEPDEFINITIONS" FOLDER. FOLDER'in ismini yazmak yeterli cunku java'nin altinda pages,
                                                 // runner folderlar var onlar sibling o yuzden isim yaziyoruz.
        dryRun = false,                         //dryRun = true : RUNS AND GENERATES ONLY MISSING STEP DEFS.
                                               // dryRun = false: RUN NORMAL. THIS IS DEFAULT VALUE
        tags = "@scenario_outline_1"        // tags koyarsan sadece porceleni calistiriyor.
)

public class Runner {


}
// "@porcelain_tea_pot"