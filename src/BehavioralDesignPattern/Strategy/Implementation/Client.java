package BehavioralDesignPattern.Strategy.Implementation;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();  // the context

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by paypal
        cart.pay(new PaypalStrategy("jason@email.com", "mypassword"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("jason fedin", "2222222222222", "444", "12/15"));
    }
}
