package CreationalDesignPattern.Prototype.Challange;

import java.util.Random;

abstract class BasicCar implements Cloneable {
    protected String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int setPrice() {
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() {
        BasicCar clone = null;
        try {
            clone = (BasicCar)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Ford extends BasicCar implements Cloneable {

    public Ford (String m)
    {
        modelName = m;
    }

    @Override
    public Ford clone()
    {
        Ford clone = null;
        clone = (Ford) super.clone();
        return clone;
    }
}

class Nano extends BasicCar implements Cloneable {

    public Nano(String m)
    {
        modelName = m;
    }

    @Override
    public Nano clone()
    {
        Nano clone = null;
        clone = (Nano) super.clone();
        return clone;
    }
}




