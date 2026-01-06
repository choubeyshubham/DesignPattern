package CreationalDesignPattern.Singelton;

public class EagerSingleton {
    // the private reference to the one and only instance
    private static EagerSingleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */

    private EagerSingleton() {}

    public static EagerSingleton getInstance()
    {
        if (uniqueInstance == null)
            uniqueInstance = new EagerSingleton();

        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }

}
