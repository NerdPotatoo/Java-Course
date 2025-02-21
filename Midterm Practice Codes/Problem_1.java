import java.util.Scanner;

// Java Program to Calculate the Area of a Circle and a Rectangle

public class Problem_1 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        // Calculating Circle Area
        double radius;
        System.out.print("Enter the radius of the Circle: ");
        radius = src.nextDouble();
        double circleArea = (radius * radius) * Math.PI;
        System.out.println("Area of the Circle is " + circleArea);

        // Calculating Rectangle Area
        int height,width;
        System.out.print("Enter Height ");
        height = src.nextInt();
        System.out.print("Enter Width ");
        width = src.nextInt();

        int recArea = height*width;
        System.out.println("Area of Rectangle: " + recArea);
    }
}
