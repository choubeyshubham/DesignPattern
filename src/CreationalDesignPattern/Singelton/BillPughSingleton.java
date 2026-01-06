package CreationalDesignPattern.Singelton;

public class BillPughSingleton {

    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */

    private BillPughSingleton() {}

    private static class SingletonHelper {
        // Nested class is refernced after getInstance() is called
        private static final BillPughSingleton uniqueInstance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance()
    {
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }



}
