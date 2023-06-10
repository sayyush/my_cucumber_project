package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // it is used to class runable
@CucumberOptions(
        // ADDING CONFIGURATIONS
        // "@CucumberOptions " :it is used to add new plugins, path of the step definition and path of feature file   1 defa kullaniliyor
        features = "src/test/resources/features",  // PATH OF "FEATURES" FOLDER
        glue = "stepdefinitions"                  // PATH OF "STEPDEFINITIONS" FOLDER. FOLDER'in ismini yazmka yeterli cunku java'nin altinda pages,
                                                 // runner folderlar var onlar sibling o yuzden isim yaziyoruz.
)

public class Runner {


}
