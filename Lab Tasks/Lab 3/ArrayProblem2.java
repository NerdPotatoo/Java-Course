import java.util.Scanner;
public class ArrayProblem2 {
    public int maximumEven(int[] a, int n)
    {
        int mx = -1;
        for(int i = 0; i<n; i++)
        {
            if(((a[i]&1) == 0) && (a[i]>mx))
            {
                mx = a[i];
            } 
        }
        return mx;
    }
    public int countEven(int[] a, int n)
    {
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            if(((a[i]&1) == 0))
            {
                count++;
            } 
        }
        return count;
    }
    public int sumOfEvenNumbers(int[] a, int n)
    {
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            if(((a[i]&1) == 0))
            {
                sum += a[i];
            } 
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter 10 Numbers: ");
        for(int i = 0; i<10; i++ )
        {
            nums[i] = src.nextInt();
        }
        System.out.print("Before swapping Array Elements: ");
        for(int i = 0; i<10; i++ )
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        // swapping 2nd and 4th element
        nums[1] = nums[1]+nums[3];
        nums[3] = nums[1]-nums[3];
        nums[1] = nums[1]-nums[3];
        // swapping 2nd and 4th element
        nums[5] = nums[5]+nums[7];
        nums[7] = nums[5]-nums[7];
        nums[5] = nums[5]-nums[7];
        System.out.print("After swapping Array Elements: ");
        for(int i = 0; i<10; i++ )
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        ArrayProblem2 obj = new ArrayProblem2();
        int maxEven = obj.maximumEven(nums,10); // calling method for searching maximum even
        int sumEvens = obj.sumOfEvenNumbers(nums,10); // calling method for sum of all even
        int totalEven = obj.countEven(nums,10); // calling method for count of all even


        System.out.println("Total Sum of All Even Numbers: " + sumEvens);
        if(maxEven != -1) 
            System.out.println("Maximum Even Number in the Array: " + maxEven);
        else 
            System.out.println("No even numbers in the array");

        if(sumEvens % totalEven == 0)
        {
            System.out.println("YES!"+'\n'+"The sum of all even numbers is divisible by the count of even numbers.");
        }
        else{
            System.out.println("NO!"+'\n'+"The sum of all even numbers is not divisible by the count of even numbers.");
        }
    }
}
