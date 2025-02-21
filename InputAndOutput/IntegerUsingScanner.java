import java.util.Scanner;

public class IntegerUsingScanner {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        
        int d1 = input.nextInt();
        
        System.out.println("Using nextInt(): "+ d1);
        
        input.close();
    }
}
