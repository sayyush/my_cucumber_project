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
        glue = {"stepdefinitions","hooks"},//PATH OF STEPDEFINITIONS FOLDER
        dryRun = false,//dryRun = true : RUNS AND GENERATES ONLY MISSING STEP DEFS. dryRun = false: RUN NORMAL. THIS IS DEFAULT VALUE
        tags = "@data_tables"
)
public class Runner {
}


/*

// Bu sinif Test caseleri RUN etmek icin kullanilir.
// Ve konfigurasyonlar icin kullanilir.


                                                    // "@CucumberOptions " :it is used to add new plugins,
                                                    // path of the step definition and path of feature file   1 defa kullaniliyor
        features = "src/test/resources/features",  // PATH OF "FEATURES" FOLDER
        glue = "stepdefinitions",                 // PATH OF "STEPDEFINITIONS" FOLDER. FOLDER'in ismini yazmak yeterli cunku java'nin altinda pages,
                                                 // runner folderlar var onlar sibling o yuzden isim yaziyoruz.
        dryRun = false,                         //dryRun = true : RUNS AND GENERATES ONLY MISSING STEP DEFS.
                                               // dryRun = false: RUN NORMAL. THIS IS DEFAULT VALUE
        tags = "@data_tables "      // tags koyarsan sadece porceleni calistiriyor.
 */