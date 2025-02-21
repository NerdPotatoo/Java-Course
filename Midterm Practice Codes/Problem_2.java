import java.util.Scanner;

/*
    Design a Java program to convert minutes into years and days.
    For simplicity, assume each year consists of 365 days.
    Input:
    Given the number of minutes: 3456789
    Output:
    3456789 minutes is approximately 6 years and 210 days
*/ 

public class Problem_2 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        System.out.print("Given the number of minutes: ");
        int mins = src.nextInt();
        int yrs = mins / (365*24*60);
        int days = (mins % (365*24*60))/(24*60);
        System.out.println(mins+ " minutes is approximately "+yrs+" years ans "+days+" days");
    }
}
