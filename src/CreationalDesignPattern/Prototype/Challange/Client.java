package CreationalDesignPattern.Prototype.Challange;

public class Client {

    public static void main (String []args) {
        System.out.println("***Prototype Pattern Demo***\n");

        BasicCarCache.loadCache();

        BasicCar bc1 = (BasicCar ) BasicCarCache.getCar("Green Nano");

        //Price will be more than 100000 for sure
        bc1.price = bc1.price+BasicCar.setPrice();
        System.out.println("Car is: "+ bc1.getModelName()+" and it’s price is Rs."+bc1.price);

        bc1 = (BasicCar ) BasicCarCache.getCar("Ford Yellow");

        //Price will be more than 500000 for sure
        bc1.price = bc1.price+BasicCar.setPrice();
        System.out.println("Car is: "+ bc1.getModelName()+" and it’s price is Rs."+bc1.price);
    }
}
