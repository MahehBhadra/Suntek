import java.util.*;
import java.io.*;
class A
{
     public static void main(String x[])
       {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt(); //taking the no of array elements
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
              {
                arr[i]=sc.nextInt(); // Taking the 'n' array elements
              }
          int q=sc.nextInt(); //Taking the no of queries;
          int output[]=new int[q];
          for(int i=0;i<q;i++)
              {
                output[i]=XOR(arr,sc.nextInt(),sc.nextInt()); //Calling the fun along with taking the queries .
              }
          for(int i=0;i<q;i++)
              {
               System.out.print(output[i]+" ");
              }
       }
       
    static int XOR(int a[],int b,int c)
       {
          int xor=0;     
          for(int i=b;i<=c;i++)
              {
                xor ^=a[i];
              }
          return xor;    
       }
} 