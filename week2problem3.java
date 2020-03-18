import java.io.*;
import java.util.*;
class A
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int k=sc.nextInt(); //Element which we should find the frequency .
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
