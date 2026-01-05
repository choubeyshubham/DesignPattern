package CreationalDesignPattern.Factory;

interface AnimalInterface {
    void Speak();
}

class Duck implements AnimalInterface
{
    @Override
    public void Speak(){
        System.out.println("Duck says Pack-pack");
    }
}

class Tiger implements AnimalInterface
{
    @Override
    public void Speak() {
        System.out.println("Tiger says Halum-Halum");
    }
}

