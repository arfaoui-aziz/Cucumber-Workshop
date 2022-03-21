import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;

import java.util.HashMap;

public class StepDefinitions {

    private Person sean;
    private Person lucy;

    private HashMap<String,Person> people;

    private String message;

    @Before
    public void initPeople() {
        people = new HashMap<String,Person>();
    }

    @Given("a person named {person}")
    public void aPersonNamed(Person person) throws Throwable {
        people.put(person.name,person);
        System.out.println(people);
    }

    @Given("{person} is located/standing {int} meter(s) from Sean")
    public void lucy_is_located_meters_from_sean(Person person,Integer distance) {

        people.get("Lucy").moveTo(distance);

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
