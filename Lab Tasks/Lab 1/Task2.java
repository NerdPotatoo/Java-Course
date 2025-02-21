// Problem Title: Convert Seconds to Hours, Minutes
import java.util.Scanner;

public class Task2{
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        int seconds, hours, minutes;
        System.out.print("Enter Seconds: ");
        seconds  = src.nextInt();
        minutes = seconds / 60;
        hours = minutes / 60;
        System.out.println("Minutes :"+minutes+"\nHours : "+ hours);
    }
}
