package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class BackGroundDataTableSteps {

    @Given("Header(s) used in the request")
    public void headers_used_in_the_request(DataTable dataTable) {
        Map<String, String> headers = dataTable.asMap(String.class, String.class);
        headers.forEach((k,v)->System.out.println("header : " + k + ", value of the header : " + v));
    }

    @Given("authentication")
    public void authentication() {
        System.out.println("The user add the authentication header");
    }

    @When("The get request is apply with the {string}")
    public void the_get_request_is_apply_with_the(String user) {
        System.out.println("The request will be apply with " + user);
    }

    @Then("Validate that the {string} has the animal {string}")
    public void validate_that_the_has_the_animal(String user, String animal) {
        System.out.println("The request fullfill the requirements with "+ user + " user and the "+ animal +" animal");
    }

    @Then("The http code return {int}")
    public void the_http_code_return(Integer number) {
        Assert.assertTrue( "the http code return "+ number,number==200);
    }

    @Then("^Validate the next message: (\"([^\"]*)\"|)$")
    public void validate_that_the_message_is_the_next_one(String message) {
        System.out.println(message);
    }
}
