package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"stepdefinations"},
        //tags = "@amazonarama",
        tags="@webtables",
        dryRun = false

)



public class Runner {

}
