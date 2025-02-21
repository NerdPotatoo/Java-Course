// Problem Title: Write a Java program to calculate the simple interest.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        Double p,r,t; // p = principle, r = interest rate, t = time period
        System.out.print("Enter principle: ");
        p  = src.nextDouble();
        System.out.print("Enter Interest Rate: ");
        r  = src.nextDouble();
        System.out.print("Enter Time: ");
        t  = src.nextDouble();
        double interest = p * (r/100) * t;
        System.out.println( "simple Interest: " + interest);
    }
}
