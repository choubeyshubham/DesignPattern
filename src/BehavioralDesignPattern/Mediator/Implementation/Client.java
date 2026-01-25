package BehavioralDesignPattern.Mediator.Implementation;

public class Client {
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Jason");
        User user2 = new UserImpl(mediator, "Jennifer");
        User user3 = new UserImpl(mediator, "Lucy");
        User user4 = new UserImpl(mediator, "Ian");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");

    }
}
