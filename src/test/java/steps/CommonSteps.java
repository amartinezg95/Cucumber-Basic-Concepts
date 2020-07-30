package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CommonSteps {


    @Before
    public void beforeEachScenario(){
        System.out.println("Before each scenario");
    }

    @After
    public void afterEachScenario(Scenario scenario){
        System.out.println("We have executed the scenario "+ scenario.getName() + " with the status "+ scenario.getStatus());
    }

    /*
    @BeforeStep
    public void beforeEachStep(){
        System.out.println("");
    }

    @AfterStep
    public void afterEachStep(){
        System.out.println("...");
    }*/


}
