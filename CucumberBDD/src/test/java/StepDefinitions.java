import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class StepDefinitions {


    private HashMap<String,Person> people;

    private String message;

    @Before
    public void initPeople() {
        people = new HashMap<>();
    }


    @Given("a person named {person}")
    public void a_person_named(Person person) {
        people.put(person.name,person);
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

    @Given("the range is {int}")
    public void the_range_is(Integer range) {

    }

    @Given("people are located at")
    public void people_are_located_at(io.cucumber.datatable.DataTable dataTable) {
            System.out.println(dataTable);
            System.out.println("Titles" + dataTable.cell(0,0));
            System.out.println(dataTable.cell(2,0));

            for(Map<String,String> personData : dataTable.asMaps()){
                System.out.println(personData);
                System.out.println(personData.get("name"));

            }


    }

    @When("Sean Shouts")
    public void sean_shouts() {
    }

    @Given("Lucy is standing {int} meter from Sean")
    public void lucy_is_standing_meter_from_sean(Integer int1) {
    }

    @Then("Larry hears Sean's message")
    public void larry_hears_sean_s_message() {
    }






}
