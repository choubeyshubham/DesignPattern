package CreationalDesignPattern.Singelton;

public class MakeACaptain {

    private MakeACaptain() {}

    // Bill Pugh solution

    private static class SingletonHelper {
        // nested class is referenced after getCaptain() is called
        private static final MakeACaptain _captain = new MakeACaptain();
    }

    public static MakeACaptain getCaptain()
    {
        return SingletonHelper._captain;
    }

    public static void main (String [] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");

        MakeACaptain c1 = MakeACaptain.getCaptain();

        System.out.println("Trying to make another captain for our team");
        MakeACaptain c2 = MakeACaptain.getCaptain();

        if (c1 == c2)
            System.out.println("c1 and c2 are the same instance");

    }





}
