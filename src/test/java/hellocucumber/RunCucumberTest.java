package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
                 snippets = SnippetType.CAMELCASE)
public class RunCucumberTest {
}
