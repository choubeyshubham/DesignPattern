package CreationalDesignPattern.Singelton;

public class LazyEvaluationSingelton {
    // the private reference to the one and only instance
    private static LazyEvaluationSingelton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */

    private LazyEvaluationSingelton() {}

    public static LazyEvaluationSingelton getInstance()
    {
        if (uniqueInstance == null)
            uniqueInstance = new LazyEvaluationSingelton();

        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }



}
