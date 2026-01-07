package CreationalDesignPattern.Builder.Implementation;

public class Client {

    public static void main(String [] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        // making a car
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        // making a motorcycle
        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }

}
