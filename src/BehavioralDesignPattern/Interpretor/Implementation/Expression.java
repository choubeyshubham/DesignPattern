package BehavioralDesignPattern.Interpretor.Implementation;

public interface Expression {
    String interpret(InterpreterContext ic);
}

class IntToBinaryExpression implements Expression {
    private int i;

    public IntToBinaryExpression(int c)
    {
        i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(i);
    }
}

class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int c){
        this.i=c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
