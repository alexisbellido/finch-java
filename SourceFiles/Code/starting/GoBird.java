package Code.starting;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class GoBird
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

      // Write some code here!

      int frequency = 500;
      int duration = 2500;
      double temperature;
      temperature = myFinch.getTemperature();
      String textTemp = String.valueOf(temperature);
      //myFinch.buzzBlocking(frequency, duration);
      //myFinch.saySomething("yesenia, yesenia, yesenia, you are a pretty woman very pretty");
      //myFinch.saySomething("yesenia, we have " +  textTemp + " degrees", duration);
      //myFinch.setWheelVelocities(255,255,1000);
      myFinch.setWheelVelocities(55,55,1000);

      System.out.println("Temperature: "  + textTemp);
      myFinch.setLED(0, 255, 0);
      myFinch.sleep(2000);


      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

