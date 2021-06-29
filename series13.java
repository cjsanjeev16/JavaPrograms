// Write java program to find the sum of series
// s= 1+ a2/1!+ a3/2!+a4/3!.....n
import java.util.Scanner;
public class series13
{
public static void main()
{
int i,j,f,n,a;
double s =1;
// s= 1+ a2/1!+ a3/2!+a4/3!.....n
Scanner in = new Scanner(System.in);
System.out.println("Enter the value of n");
n= in.nextInt();
System.out.println("Enter the value of a");
a= in.nextInt();
for(i=1;i<=n;i++)
{
f=1;
for(j=1;j<=i;j++)
f =f*j;
s= s + (double) Math.pow(a,i)/f;
}
System.out.println("sum of the series"+s);
}
}