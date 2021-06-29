import java.util.Scanner;
public class Series15
{
public static void main()
{
Scanner in = new Scanner(System.in);
int a,b,n,f;
double s=0;
System.out.println("Enter last digit");
n= in.nextInt();
f=1;
for(a= 1; a <= n; a++)
{
f=1;
for(b=1;b<=a;b++)
f = f * a;
s= s+(double)1/f;
}
System.out.print("The sum of series="+ s);
}
}