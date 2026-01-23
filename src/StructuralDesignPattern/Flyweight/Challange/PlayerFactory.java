package StructuralDesignPattern.Flyweight.Challange;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player p = null;

        if (hm.containsKey(type))
            p = hm.get(type);
        else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }

            hm.put(type, p);
        }
        return p;
    }
}
