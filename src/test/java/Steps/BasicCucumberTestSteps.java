package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicCucumberTestSteps {

    @Given("The user visualize the given step")
    public void the_user_visualize_the_given_step() {
        System.out.println("some initial context (the givens)");
    }

    @When("The user visualize the when step")
    public void the_user_visualize_the_when_step() {
        System.out.println("an event occurs (the whens)");
    }

    @Then("the user visualize the then step")
    public void the_user_visualize_the_then_step() {
        System.out.println("ensure some outcomes (the thens)");
    }
}
