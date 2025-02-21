// Problem Title: Convert Kilometers to Miles
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        double kilometers, miles;
        System.out.print("Enter Kilometers: ");
        kilometers  = src.nextDouble();
        miles = kilometers/1.6;
        System.out.println(kilometers + " kilometers in miles is "+ miles);
    }
}
