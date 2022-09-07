package ProgramsJava;
import java.util.Scanner;

class BitLogic {
    public static void main(String args[]) {
        // Java program to illustrate valueof() Method
        Scanner sc = new Scanner(System.in);
        sc.close();
        /*for(int i = 101;i<=999;i++)
        {
            temp=i;
            rev=0;r=0;
            while(temp>0)
            {
                r= temp%10;
                rev =rev*10+r;
                temp  = temp/10;
            }
            if(rev==i)
            {
                System.out.println(i+"Palindorne");
            }
        }*/
        /*int a = 6,b=0;
        for(int i=1;i<=6;i++)
        {
            if(i%2!=0)
            {
                for(int j = 1;j<=a;j++)
                {
                    System.out.print(j);
                    b = a-1;
                }
            }
            else{
                for(int k =b;k>=1;k--)
                {
                    System.out.print(k);
                    a = b-1;
                }
            }
            System.out.println();
        } */  

         
//       1
//      232
//     34543
//    4567654
//   567898765
        /*for(int i = 1;i<=5;i++)
        {
            int b=i;
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(b++);  
            }
            --b;
            for(int j=2;j<=i;j++)
            {
                System.out.print(--b);
            }
            System.out.println();
        }*/
    }
}




