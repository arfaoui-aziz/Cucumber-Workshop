import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;

public class StepDefinitions {


    private HashMap<String,Person> people;

    private String message;

    @Before
    public void initPeople() {
        people = new HashMap<>();
    }


    @Given("a person named {person}")
    public void a_person_named(Person person) {
        System.out.println(person);
        System.out.println(person.name);

        people.put(person.name,person);
        System.out.println(people);
    }


    @When("Sean Shouts {string}")
    public void sean_shouts(String message) {
      this.message = message;
        people.get("Sean").shout(message);
        people.get("Lucy").setShoutedMessage(message);
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        Assert.assertEquals(message,people.get("Lucy").getMessagesHeard());
    }





}
