/**
*
* Climb Every Mountain (Lab02 in Unit1, fcps.karel)
*
* @author Shaurya Prakash
* @version 30/10/2014
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
            
            Display.openWorld("maps/mountain.map");
            Display.setSize(16, 16);
            Display.setSpeed(5);
            
            Climber edmund = new Climber();
            Climber tenzing = new Climber();
            
            edmund.turnRight();
            tenzing.turnRight();
            edmund.move();
            tenzing.move();
            edmund.turnLeft();
            tenzing.turnLeft();
            edmund.climbUpRight();
            tenzing.climbUpRight();
            edmund.climbUpRight();
            tenzing.climbUpRight();
            edmund.climbUpRight();
            tenzing.climbUpRight();
            edmund.turnAround();
            tenzing.turnAround();
            edmund.climbDownRight();
            tenzing.climbDownRight();
            edmund.climbDownRight();
            tenzing.climbDownRight();
            edmund.pickBeeper();
            edmund.turnAround();
            tenzing.turnAround();
            edmund.climbUpLeft();
            tenzing.climbUpLeft();
            edmund.climbUpLeft();
            tenzing.climbUpLeft();
            edmund.turnAround();
            tenzing.turnAround();
            edmund.climbDownLeft();
            tenzing.climbDownLeft();
            edmund.climbDownLeft();
            tenzing.climbDownLeft();
            edmund.climbDownLeft();
            tenzing.climbDownLeft();
            edmund.turnRight();
            tenzing.turnRight();
            edmund.move();
            tenzing.move();
            edmund.turnRight();
            tenzing.turnRight();
     }
}
