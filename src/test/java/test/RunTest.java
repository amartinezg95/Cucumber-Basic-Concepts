package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features" ,glue = "steps", strict = true,
        plugin = {"pretty", "html:target/cucumber"}, tags = "@RUN-IT")
public class RunTest {
}
