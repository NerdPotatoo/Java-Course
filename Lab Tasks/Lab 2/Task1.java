/*
        *
       * *
      * * *
     * * * *
    * * * * *
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for(int i = 1; i<=n; i++)
        {
             for(int space = n-i; space>0; space--)
             {
                 System.out.print(" ");
             }
            for(int star = 1; star<=i; star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}