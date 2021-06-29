import java.util.Scanner;
public class Palindrome_Perfect
{
public static void main()
{
    int ch;
    Scanner in = new Scanner(System.in);
System.out.println("Enter 1 for palindrome");
System.out.println("Enter 2 for perfect number");
System.out.println("Enter your choice");
ch = in.nextInt();
switch(ch)
{
    case 1:
    int p,d,n,r=0;
    System.out.println("Enter a number");
    n = in.nextInt();
    p=n;
    do
    {
        d=n%10;//Say n=494,494%10=4
        r=r*10+d;//r=0*10+4=4
        n=n/10;//n=494/10=49
    }
    while(n!=0);
    if(r==p)
     System.out.println("It is a Palindrome number");
     else
     System.out.println("It is not a Palindrome number");
     break;
     case 2:
     int a,s=0;
     System.out.println("Enter a number");
     n=in.nextInt();
     for(a=1;a<n;a++)
       {
        if(n % a==0)
        s=s+a;
       }
        if(s==n)
        System.out.println( a+" is a perfect number");
        else
        System.out.println(a+" is not a perfect number");
        break;
        default:
        System.out.println("Wrong choice!!");
}
    }
}