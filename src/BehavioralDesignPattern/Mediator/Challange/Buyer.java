package BehavioralDesignPattern.Mediator.Challange;

abstract class Buyer {
    // this class holds the buyer
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator med, String name)  {
        this.mediator = med;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelTheBid();
    public abstract void auctionHasEnded();
}

class AuctionBuyer extends Buyer {
    // implementation of the bidding process.  There is an option to bid and an option to  cancel the bidding
    public AuctionBuyer(Mediator mediator,  String name)   {
        super(mediator, name);
    }

    @Override
    public void bid(int price)  {
        this.price = price;
    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("Received message that the auction is over: " + name);
    }
}
