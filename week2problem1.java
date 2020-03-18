import java.io.*;
import java.util.*;
class A
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        parenthesis(n/2,n/2,"");
    }
    public static void parenthesis(int a,int b,String str)
    {
        if(a==0 && b==0)
        {
            System.out.println(str);
        }
        if(a>b)
        {
            return;
        }
        if(a>0)
        {
            parenthesis(a-1, b, str+"(");
        }
        if(b>0)
        {
            parenthesis(a, b-1, str+")");
        }
    }
}
