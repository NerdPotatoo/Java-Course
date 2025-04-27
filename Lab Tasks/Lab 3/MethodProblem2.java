import java.util.Scanner;

class MethodProblem2{
    public static void main( String[] args)
    {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter 3-Digit number: ");

        int num = src.nextInt();
        int temp = num, sum = 0, digit;
        while(temp>0)
        {
            digit = temp%10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if(num == sum)
        {
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }   
}