package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features" ,glue = "steps", strict = true,
        plugin = {"pretty", "html:target/cucumber-reports"})//, tags = "not @IN-PROGRESS")//tags = "@RUN-IT or @RUN-IT2")
public class RunTest {
}
