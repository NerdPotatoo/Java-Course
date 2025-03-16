import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);

        String s = src.nextLine();
        String r = "";
        
        for(int i = 0; i<s.length(); i++)
        {    
            r = s.charAt(i) + r;
        }

        System.out.println(r);

    }    
}
