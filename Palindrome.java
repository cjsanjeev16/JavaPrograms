import java.util.*;
public class Palindrome
{
public static void main()
{
    int p,d,n,r=0;
    Scanner in = new Scanner(System.in);
System.out.println("Enter a number");
n = in.nextInt();
p=n;
do
{
    d=n%10;
    r=r*10+d;
    n=n/10;
}
while(n!=0);
if(r==p)
     System.out.println("It is a Palindrome number");
else
     System.out.println("It is not a Palindrome number");
}
}