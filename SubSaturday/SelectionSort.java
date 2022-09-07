package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class ProcessClass17 {

    public void SelectionSort(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            int min =arr[i];
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min = arr[j];
                    int index = j;
                    int temp = arr[i];
                    arr[i] = min;
                    arr[index] = temp;
                }
            }
        }
    }
}
class SelectionSort
{
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
        ProcessClass17 s1 = new ProcessClass17();
        s1.SelectionSort(arr);
        System.out.println("MY SORTED ARRAY"+Arrays.toString(arr));
        sc.close();
    }
}
