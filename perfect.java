/**
* Write a program to accept a number and check
whether
* the number is perfect or not A number is said to be
perfect
* if the of the factors (inluding 1 and excluding the
number itself)
* the same as the original number.
* Ex Input -6
* Sample output -It is a perfect number
*/
import java.util.Scanner;
public class perfect
{
public static void main()
{
Scanner in = new Scanner(System.in);
int a,n,s=0;
System.out.println("Enter a number");
n = in.nextInt();
for(a=1;a<n;a++)
{
if(n % a==0)
s=s+a;
}
if(s==n)
System.out.println( a+" is a perfect number");
else
System.out.println(a+" is not a perfect number");
}
}