package CreationalDesignPattern.Singelton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton uniqueInstance = null;
    private int data = 0;

    private SynchronizedSingleton() {}

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method
    public static synchronized SynchronizedSingleton getInstance()
    {
        if (uniqueInstance == null)
            uniqueInstance = new SynchronizedSingleton();
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
