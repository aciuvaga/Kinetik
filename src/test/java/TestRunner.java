import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" },
        glue = { "stepDefinition" },
        //tags = {},
        plugin = {"pretty", "html:target/cucumber"}
        )
public class TestRunner {

}





