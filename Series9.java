/** WAP to print the sum of the series
* s= a2/1+ a2/2+a2/3+a2/4+a2/5+.....a2/10 assume a=2
*/
// to find the sum of the series
public class Series9
{
public static void main()
{
//* s= a2/1 + a2/2+a2/3+a2/4+a2/5+.....a2/10
int a=2,i;
double sum = 0;
for(i=1;i<=10;i++)
{
sum = sum + Math.pow(a,2)/i;
}
System.out.println("sum of the series"+sum);
}
}