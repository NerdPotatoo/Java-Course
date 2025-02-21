// Problem Title: Find the Square and Cube of a Number
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number: ");
        num  = src.nextInt();
        int squareOfNum = (num * num);
        int cubeOfNum = (num * num * num);
        System.out.println( "Square of " + num + " is " + squareOfNum + "\nCube of " + num + " is " + cubeOfNum);
    }
}
