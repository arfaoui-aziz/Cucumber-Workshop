public class Person {

    public String name;
    public String shoutedMessage;

    public Person(String name){
        this.name=name;
    }

    public void moveTo(Integer distance){

    }
    public void shout(String message){
        this.shoutedMessage = message;
    }

    public String getMessagesHeard() {
        return shoutedMessage;
    }

    public void setShoutedMessage(String shoutedMessage) {
        this.shoutedMessage = shoutedMessage;
    }
}
