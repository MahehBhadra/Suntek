import java.io.*;
import java.util.*;
class E 
{

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            int b=0;
            b=setBits(i);
            System.out.print(b+" ");
        }
    }
    static int setBits(int n)
    {
        int count = 0; 
        while (n > 0) { 
            count += n & 1; 
            n >>= 1; 
        } 
        return count; 
    } 
    
}
