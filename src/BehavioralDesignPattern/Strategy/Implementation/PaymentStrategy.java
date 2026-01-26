package BehavioralDesignPattern.Strategy.Implementation;

interface PaymentStrategy {
    public void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "$ paid with credit/debit card");
    }
}

class PaypalStrategy implements PaymentStrategy {
    private String email_id;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.email_id = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "$ paid using Paypal.");
    }
}
