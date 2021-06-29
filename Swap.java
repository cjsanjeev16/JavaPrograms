import java.util.*;
public class Swap
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter first number");
        a=in.nextInt();
        System.out.println("Enter second number");
        b=in.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("The value of a = "+a);
        System.out.println("The value of b = "+b);
    }
}    
 