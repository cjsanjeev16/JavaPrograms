/* WAP to print the sum of the series
* s= 1+1/2+ 1/3+1/4+1/4+1/5+.....1/20
*/
// to find the sum of the series
public class Series10
{
public static void main()
{
//s= 1+1/2+ 1/3+1/4+1/4+1/5+.....1/20
int a=1,i;
double sum =0;
for(i=1;i<=20;i++)
{
sum =sum + a/i;
}
System.out.println("sum of the series"+sum);
}
}