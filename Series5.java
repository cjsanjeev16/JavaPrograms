/**
* Write a java program to display the
terms of the follwoing
* 1,11,111,1111,11111 n terms
*/
import java.util.Scanner;
public class Series5
    {
        public static void main()
        {
            Scanner in = new Scanner(System.in);
            int i,n,s=0;
            System.out.println("Enter last digit");
            n= in.nextInt();
            for(i = 1; i <= n; i++)
            {
                s = s * 10 + 1;
                System.out.print(s + " ");
            }
        }
    }