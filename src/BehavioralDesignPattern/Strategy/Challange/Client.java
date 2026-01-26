package BehavioralDesignPattern.Strategy.Challange;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        int result = context.executeStrategy(new OperationAdd(), 10, 5);

        System.out.println("10 + 5 = " + result);

        result = context.executeStrategy(new OperationSubtract(), 10, 5);

        System.out.println("10 - 5 = " + result);

        result = context.executeStrategy(new OperationMultiply(), 10, 5);

        System.out.println("10 * 5 = " + result);
    }
}
