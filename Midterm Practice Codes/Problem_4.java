/*
Calculate the price of a movie ticket based on the customer's age and whether it's a weekend.
The pricing is as follows:
Children (under 13 years): Rs. 100 on weekdays, Rs. 120 on weekends.
Adults (13 to 64 years): Rs. 150 on weekdays, Rs. 180 on weekends.
Seniors (65 years and above): Rs. 130 on weekdays, Rs. 150 on weekends.
 */
import java.util.Scanner;
public class Problem_4 {
    public static void main (String[] args)
    {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = src.nextInt();
        System.out.print("Enter 1 if weekend else 0: ");
        int weekend = src.nextInt();

        if(age<13)
        {
            if(weekend == 1)
            {
                System.out.println("Rs. 120");
            }
            else{
                System.out.println("Rs. 100");
            }
        }
        else if(age >= 13 && age <= 64)
        {
            if(weekend == 1)
            {
                System.out.println("Rs. 180");
            }
            else{
                System.out.println("Rs. 150");
            }
        }
        else{
            if(weekend == 1)
            {
                System.out.println("Rs. 150");
            }
            else{
                System.out.println("Rs. 130");
            }
        }
    }
}
