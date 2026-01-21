package StructuralDesignPattern.Facade.Challange;

interface Menus {
    void showMenu();
}

class NonVegMenu implements Menus {

    NonVegMenu()
    {
        System.out.println("Creating a non veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in non veg menu");
    }
}

class VegMenu implements Menus {

    VegMenu()
    {
        System.out.println("Creating a veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in veg menu");
    }
}

class Both implements Menus {

    Both()
    {
        System.out.println("Creating both a veg and non veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in both a veg and non veg menu");
    }
}

