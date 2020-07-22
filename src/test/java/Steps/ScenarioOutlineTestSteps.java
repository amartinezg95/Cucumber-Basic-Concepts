package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineTestSteps {

    @Given("The user go to the shop")
    public void the_user_go_to_the_shop() {
        System.out.println("The user go to the shopping center");
    }

    @When("The user buy an {string}")
    public void the_user_buy_an(String animal) {
        System.out.println("The user decided to buy a: "+ animal);
    }

    @Then("the user visualize the {string}")
    public void the_user_visualize_the(String animal) {
        System.out.println("The user have a: "+ animal);
    }
}
