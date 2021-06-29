/* Write a java program to display the terms of the follwoing
* (1+3)+(1+3+5)+(1+3+5+7).......
*/
import java.util.*;
public class Series16
{
public static void main()
{
Scanner in = new Scanner(System.in);
int n,i,tot=0,sum=0;
System.out.println("Enter last digit");
n= in.nextInt();
for(i=1;i<=n;i=i+2)
{
sum =sum +i;
tot =tot+sum;
}
System.out.println("The sum of series"+tot);
}
}