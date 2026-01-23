package StructuralDesignPattern.Flyweight.Implementation;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobot = null;

        if (shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have a King Robot.  So we are creating a King Robot now");
                    myRobot = new Robot("King");
                    shapes.put("King", myRobot);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot. So we are creating a Queen Robot now .");
                    myRobot = new Robot("Queen");
                    shapes.put("Queen", myRobot);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only King and Queen Robots");
            }
        }

        return myRobot;

    }
}

