package Principles;

public class Computer {

    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }
    public void display() {
        dm.display();
    }


    public static void main(String[] args) {
        Computer cm=new Computer();
        DisplayModule dm1=new Monitor();
        DisplayModule dm2=new Projector();

        cm.setDisplayModule(dm1);
        cm.display();
        cm.setDisplayModule(dm2);
        cm.display();
    }


}
