/**
* Write a java program to display the
terms of the follwoing
* 1,12,1234,12345,.n terms
*/
public class Series6
    {
        public static void main()
        {
            int i,j;
            for(i=1;i<=10;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.println(j);
                }
                System.out.println(",");
            }
        }
    }