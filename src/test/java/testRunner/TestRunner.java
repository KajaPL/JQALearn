package testRunner;
import PageObjectModels.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import java.util.Map;


@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"src/test/resources/featureFiles/SwagLabsLogin.feature"},
        glue = { "stepDefinition", "testRunner" },
        tags = {"@login"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class TestRunner extends Hooks {

}
