package BehavioralDesignPattern.Strategy.Challange;

interface Strategy {
    public int performOperation(int num1, int num2);
}

class OperationAdd implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}


class OperationSubtract implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class OperationMultiply implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
