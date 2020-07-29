package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

    @Before
    public void beforeEachScenario(){
        System.out.println("Before each scenario");
    }

    @After
    public void afterEachScenario(){
        System.out.println("Execute after each scenario");
    }
}
