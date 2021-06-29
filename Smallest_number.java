// to find the smallest number 
import java.util.*;
public class Smallest_number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c,d,p;
        System.out.println("Enter the smallest number");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=Math.min(a,b);
        p=Math.min(c,d);
        System.out.println("Smallest number="+p);
    }
}