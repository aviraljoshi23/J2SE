package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class Reverse
{
    public void ReverseMyArray(int arr[],int size)
    {
        int temp=0;
        for(int i=0;i<size/2;i++)
        {
            temp = arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));   
    }
}
public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int size =  sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++)
        {
            System.out.println("Enter the Element:- "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("USER INPUT ARRAY:-"+Arrays.toString(arr));
        Reverse s1 = new Reverse();
        s1.ReverseMyArray(arr,size);
        sc.close();
    }
}
