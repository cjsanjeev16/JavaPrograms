import java.util.*;
public class Sum_2
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a=1,n,s=0;
        while(a<=10)
        {
            System.out.println("Enter a number one by one");
            n= in.nextInt();
            if(n%2==0)
            s = s + n;
            a = a++;
        }
                    
        System.out.println("Sum of numbers ="+s);
    }
}