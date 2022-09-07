package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class LetsSort{
    
    public int[] sortMyArray(int[]arr)
    {
        for(int  i = 0;i<arr.length;i++)
        {
            for(int j= 0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                }
            }
        }
        return arr;
    }
}
public class SortArray {
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
        LetsSort s1 = new LetsSort();
        int []arr2 = s1.sortMyArray(arr);
        System.out.println("MY SORTED ARRAY"+Arrays.toString(arr2));
        sc.close();
    }
}