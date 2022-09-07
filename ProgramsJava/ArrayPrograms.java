package ProgramsJava;
import java.util.*;
class ArrayPrograms{
    public static void main(String arg[]){
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array:- ");
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i = 0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));*/
        
        Scanner sc = new Scanner(System.in);
        int a[] = {10,20,30,45,5,4,3,50};
        System.out.println("Enter value to check");
        int sum = sc.nextInt();
        for(int i = 0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]+a[j])==sum)
                {
                    System.out.print(i+" "+j);
                }
            }
        }
       // Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        int a[] = {10,20,5,4,3,50};
        int temp  = a[a.length-1];
        for(int i = a.length-1;i>0;i--)
        {
            a[i] = a[i-1];
        }
        a[0] = temp;
        System.out.print(Arrays.toString(a));*/

        /*int n = sc.nextInt();
        int a[] = {10,20,5,4,3,50};
        int temp  = a[n-1];
        for(int i = n-1;i>0;i--)
        {
            a[i] = a[i-1];
        }
        a[0] = temp;
        System.out.print(Arrays.toString(a));*/
        sc.close();
    }
}