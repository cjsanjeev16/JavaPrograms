import java.util.Scanner;
public class Buzz_GCD
{
    public static void main()
    {
            int ch;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter 1 to check a Buzz number");
            System.out.println("Enter 2 to find GCD of 2 numbers");
            System.out.println("Enter your choice");
            ch=in.nextInt();
            switch(ch)
           {
                    case 1:
                        int n;
                        System.out.println("Enter a number");
                        n=in.nextInt();
                        if (n%7==0||n%10==7)
                            System.out.println(n+" is a Buzz number");
                        else
                            System.out.println(n+" is not a Buzz number");
                    break;
             case 2:
                int a,b,i=0;
                System.out.println("Enter First number");
                a = in.nextInt();
                System.out.println("Enter Second number");
                b = in.nextInt();
              while(a%b!=0)
              {
                  i=a%b;
                  a=b;
                  b=i;
               }
              System.out.println("GCD of two numbers = "+b);
              break;
              default:
              System.out.println("Wrong Choice!!");
           }
        }
    }
