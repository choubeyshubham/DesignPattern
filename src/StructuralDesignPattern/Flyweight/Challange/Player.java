package StructuralDesignPattern.Flyweight.Challange;

public interface Player {
    // extrinsic data
    public void assignWeapon(String weapon);

    public void mission();
}

class Terrorist implements Player {
    // instrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public Terrorist() {
        TASK = "Plant a bomb";
    }

    public void assignWeapon(String weapon){
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}

class CounterTerrorist implements Player {
    // instrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    public void assignWeapon(String weapon){
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
