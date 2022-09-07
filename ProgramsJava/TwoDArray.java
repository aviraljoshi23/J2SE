package ProgramsJava;
import java.util.Scanner;

public class TwoDArray {
     public static void main(String[] args) {
         /*
         Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
         int n = sc.nextInt();
         int a[][] = new int[m][n];
         for(int i=0;i<m;i++)
         {
             for(int j = 0;j<n;j++)
             {
                 a[i][j] = sc.nextInt();
             }
         }
         System.out.println("2 D ARRAY AFTER SWAP");
         for(int i = 0;i<m;i++)
         {
             for(int j = 0;j<n;j++)
             {
                 int temp = a[i][j];
                 a[i][j] = a[i][n-1];
                 a[i][n-1] = temp;
             }
         }
         for(int i=0;i<m;i++)
         {
             for(int j = 0;j<n;j++)
             {
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }*/

         // Question 6 
         /*
         int sum=0,k=0,index=0;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter the Elements");
        for(int i=0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("My two-D ARRAY");
        for(int i=0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i =0;i<m;i++)
        {
            sum=0;
            for(int j=0;j<n;j++)
            {
                sum  = sum+a[i][j];
            }
            if(sum > k)
            {
                index = i;
                k=sum;
            }
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[index][j]+" ");
        }*/
        // question 8 
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int max_even = -2147483648,min_odd=2147483647;
        System.out.println("2 D ARRAY AFTER SWAP");
        for(int i=0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(a[i][j]%2==0&&a[i][j]>max_even)
                {
                    max_even=a[i][j];
                }
                else if(a[i][j]%2!=0&&a[i][j]<min_odd)
                {
                    min_odd = a[i][j];
                }
            }
        }
        if(max_even==-2147483648)
        {
            System.out.print("NO even value "+min_odd);
        }
        else if(min_odd==2147483647)
        {
            System.out.println("NO odd in matrix "+max_even);
        }
        else
        {
            System.out.print(max_even+"  "+min_odd);
        }
        sc.close();
    }
}
