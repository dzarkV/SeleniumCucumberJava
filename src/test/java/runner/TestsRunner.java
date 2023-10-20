package runner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        plugin = "pretty",
//        features = "src/test/resources/features",
//        glue = {"stepDefinitions"},
//        snippets = CucumberOptions.SnippetType.CAMELCASE,
//        tags = "@Test1"
//)
@Suite
@SelectClasspathResource("features")
@IncludeTags("Test1")
public class TestsRunner {
}
