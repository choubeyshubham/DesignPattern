package BehavioralDesignPattern.Interpretor.Challange;

class Context {
    String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String data) {
        if(input.contains(data))
            return true;
        else
            return false;
    }
}
