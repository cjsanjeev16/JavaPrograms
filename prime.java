/**
* write a program to accept a number and check
whether the number is prime or not.
A prime number is divisible only by 1 and number
itself */
import java.util.Scanner;
public class prime
{
public static void main()
{
Scanner in = new Scanner(System.in);
int a,n,c=0;
System.out.println("Enter a number");
n = in.nextInt();
for(a=1;a<=n;a++)
{
if(n % a==0)
c=c+1;
}
if(c==2)
System.out.println("It is a prime number");
else
System.out.println("It is a not prime number");
}
}