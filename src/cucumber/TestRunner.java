package cucumber;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
		,monochrome = true
		,plugin = {
						"pretty",
						"html:target/cucumber",
						"json:results/cucumber.json",
						"junit:results/cucumber.xml"
						}
		)
 
public class TestRunner{
 
}

