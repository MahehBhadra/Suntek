import java.io.*;
import java.util.*;
class B
{
     public static void main(String x[])
        {
           Scanner sc=new Scanner(System.in);
           int b=flips(sc.nextInt(),sc.nextInt(),sc.nextInt());
           System.out.print(b);
        }
     static int flips(int a,int b,int c)
        {
            String str1=toBin(a,16);
            String str2=toBin(b,16);
            String str3=toBin(c,16);
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            char[] ch3 = str3.toCharArray();
            int i=0,j=0;
            while(i<16)
              {
                 
                 if(ch3[i]=='1' && ch1[i]=='0' && ch2[i]=='0')
                      {
                         j++;
                      }
                 else if(ch3[i]=='0'  && (ch1[i]=='1' || ch2[i]=='1'))
                     {
                         if(ch1[i]=='1')
                           {
                             j++;
                           }
                         if(ch2[i]=='1')
                           {
                             j++;
                           }
                     }
                i++;
              }    
            return j;
        }


    static int[] decToBin(int n)  //Used to convert Dec to Bin and returns Binary values.
    { 
        int[] bin= new int[32]; 
        int[] bina=new int[32];
        int i = 0; 
        while (n > 0)
          { 
            bin[i] = n % 2; 
            n = n / 2; 
            i++; 
          } 
        //In bin[] the values are stored in reverse order so reversing them and storing in bina[]
        for (int j = i - 1,k=0; j >= 0 && k<i; j--,k++)
            {
                bina[k]=bin[j];
            }
        return bina;
    }


     public static String toBin(int x, int len)
          {

		if (len > 0) 
                   {
		       return String.format("%" + len + "s",Integer.toBinaryString(x)).replaceAll(" ", "0");
		   }

		return null;
	 }

}














