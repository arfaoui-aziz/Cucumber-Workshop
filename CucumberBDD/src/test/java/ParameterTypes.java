import io.cucumber.java.ParameterType;
import org.junit.runners.Parameterized;

public class ParameterTypes {



    @ParameterType("Lucy|Sean")
    public Person person(String name){
        return new Person(name);
    }

}
