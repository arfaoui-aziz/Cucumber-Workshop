import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    private Person sean;
    private Person lucy;
    private String message;

    @Given("{person} is located/standing {int} meter(s) from Sean")
    public void lucy_is_located_meters_from_sean(Person person,Integer distance) {
        sean = new Person("sean");
        lucy = new Person("lucy");
        lucy.moveTo(distance);

    }
    @When("Sean Shouts {string}")
    public void sean_shouts(String message) {
      this.message = message;
      sean.shout(message);
      lucy.setShoutedMessage(message);
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        Assert.assertEquals(message,lucy.getMessagesHeard());
    }

}
