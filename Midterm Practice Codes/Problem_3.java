

/*
    Determine actions based on traffic light colors and the presence of pedestrians. -
    using Switch case
    The rules are:
    Green light: "Drive" if no pedestrian is waiting, "Slow down" if a pedestrian is
    waiting.
    Yellow light: "Prepare to stop", regardless of pedestrians.
    Red light: "Stop", regardless of pedestrians.
*/ 
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);

        String light = src.next();
        switch (light) {
            
            case "Green":
            int ok;
            // ok = 1 pedestrian 
            // ok = 0 no pedestrian
            System.out.println("Enter 1 if a pedestrian is waiting. else 0");
            ok = src.nextInt();
                if(ok == 1)
                {
                    
                    System.out.println("Slow Dwon");
                }
                else {
                    System.out.println("Drive");
                }
                break;
            case "Yellow":
                System.out.println("Prepare to stop");
                break;
        
            case "Red":
                System.out.println("Stop");                
                break;
        
            default:
                System.out.println("Invalid command");
                break;
        }
    }    
}

