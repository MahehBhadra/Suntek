import java.io.*;
import java.util.*;
class F
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];//Taking the no of elements
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); //Taking the elements
        }
        int b=get(arr,n); //Calling the get function by passing the array and the length of array and it returns the single repeated element.
        System.out.println(b);
    }
    static int get(int arr[], int n) 
    { 
        int ones = 0, twos = 0; 
        int common_bit_mask; 
          
        for(int i=0; i<n; i++ ) 
        { 
            twos = twos | (ones & arr[i]); 
            ones = ones ^ arr[i]; 
            common_bit_mask = ~(ones & twos); 
            ones &= common_bit_mask; 
            twos &= common_bit_mask; 
        } 
        return ones; 
    } 
}
