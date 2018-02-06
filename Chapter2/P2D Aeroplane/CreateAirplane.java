
/**
 * Write a description of class CreateAirplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateAirplane
{  
 public int speed;
 private double altitude;
 private String stopString;
 private boolean stop;
 private String name;
 CreateAirplane( int initialSpeed, double initialAltitude, boolean initialStop, String initialName)
    {
    speed = initialSpeed;
    altitude = initialAltitude;
    stop = initialStop;
    if (initialStop)
        {
            stopString = "Yes";
        }
        else
        {
            stopString = "No";
        }
name = initialName;
    }
 public String toString()
    {
        String output = new String( name + "\n" 
                                    + altitude + " ft. \n" 
                                    + "Non-Stop flight: " + stop + "\n"
                                    + "Speed: ");
        return output;
    }
} 


