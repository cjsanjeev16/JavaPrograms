import java.util.*;
public class Triangle
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        int b,h;
        double a=0;
        System.out.println("Enter the base and height");
        b= in.nextInt();
        h= in.nextInt();
        a= (double) (1.0/2.0)*b*h;
        System.out.println("Area of triangle :"+a+" sq metre");
    }
}    