package CreationalDesignPattern.Factory;

public class Client {
    public static void main(String [] args) throws Exception
    {
        System.out.println("***Factory Pattern Demo***\n");
        AnimalFactoryInterface animalFactory = new ConcreteFactory();

        AnimalInterface duckType = animalFactory.GetAnimalType("Duck");
        duckType.Speak();

        AnimalInterface tigerType = animalFactory.GetAnimalType("Tiger");
        tigerType.Speak();

//        AnimalInterface lionType = animalFactory.GetAnimalType("Lion");
//        lionType.Speak();
    }
}
