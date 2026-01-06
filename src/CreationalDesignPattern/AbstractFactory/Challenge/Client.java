package CreationalDesignPattern.AbstractFactory.Challenge;

public class Client {

    public static void main(String[] args) {
        MovieFactoryInterface hollyWoodMovieFactory = FactoryProducer.getFactory("HollyWoodMovie");

        HollyWoodMovieInterface hAction = hollyWoodMovieFactory.GetHollyWoodMovie("action");
        HollyWoodMovieInterface hComedy = hollyWoodMovieFactory.GetHollyWoodMovie("comedy");

        System.out.println("\nHollyWood movies  are:");
        System.out.println(hAction.getMovieName());
        System.out.println(hComedy.getMovieName());

        MovieFactoryInterface bollyWoodMovieFactory = FactoryProducer.getFactory("BollyWoodMovie");

        BollyWoodMovieInterface bAction = bollyWoodMovieFactory.GetBollyWoodMovie("action");
        BollyWoodMovieInterface bComedy = bollyWoodMovieFactory.GetBollyWoodMovie("comedy");

        System.out.println("\nBollyWood movies  are:");
        System.out.println(bAction.getMovieName());
        System.out.println(bComedy.getMovieName());

    }
}