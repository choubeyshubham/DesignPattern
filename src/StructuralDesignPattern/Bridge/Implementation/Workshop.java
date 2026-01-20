package StructuralDesignPattern.Bridge.Implementation;

abstract class Workshop {
    abstract public void work();
}

class Produce extends Workshop {
    @Override
    public void work() {
        System.out.print("Produced");
    }
}

class Assemble extends Workshop {
    @Override
    public void work() {
        System.out.print("And Assembled");
    }
}
