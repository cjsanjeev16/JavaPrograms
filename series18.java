// Write java program to find the sum of series
// s= x+ x2/2!+ x3/3!+x4/4!.....n
import java.util.Scanner;
public class series18
{
public static void main()
{
int i,f=1,n,x;
double s=0,b;
Scanner in = new Scanner(System.in);
System.out.println("Enter the value of x");
x= in.nextInt();
System.out.println("Enter the value of n");
n= in.nextInt();
for(i=2;i<=n;i++)
{
b = Math.pow(x,i);
f =f*i;
s= s + b/f;
}
System.out.println("sum of the series"+s);
}
}