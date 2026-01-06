package CreationalDesignPattern.Singelton;

public class DoubleLockingSingleton {
    private volatile static DoubleLockingSingleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */

    private DoubleLockingSingleton() {}

    public static DoubleLockingSingleton getInstance()
    {
        if (uniqueInstance == null) {
            synchronized (DoubleLockingSingleton.class) {  // we only synchronize the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }

}
