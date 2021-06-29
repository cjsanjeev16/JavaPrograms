/* Write java program to find the sum of series
1/13 +1/23+1/33+*/
import java.util.Scanner;
public class series14
    {
        public static void main()
        {
            int i;
            double sum=0;
            for(i=1;i<=15;i++)
            {
                if (i%2 ==0)
                sum = sum-(double)1/(Math.pow(i,3));
                else
                sum = sum-(double)1/(Math.pow(i,3));
            }
            System.out.println("Sum of the series"+sum);
        }
    }