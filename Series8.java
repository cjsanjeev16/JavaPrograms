/**
* Write a program to print the sum of the series
* s = 2 - 4 + 6 - 8 + 10......n
*/
import java.util.Scanner;
public class Series8
{
public static void main()
{
Scanner in = new Scanner(System.in);
int n,i,j,sum=0;
System.out.println("Enter last digit");
n= in.nextInt();
//* s = 2 - 4 + 6 - 8 + 10......n
for(i= 2;i<=n;i=i+2)
{
if(i%4==0)
{
sum =sum -i;
}
else
{
sum= sum +i;
}
}
System.out.println("Sum" +sum);
}
}