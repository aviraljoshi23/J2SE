package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class ShowMinMax
{
    private int MIN= 2147483647;
    private int MAX = -2147483647;
    private int arr[];
    public ShowMinMax(int[]arr)
    {
        this.arr = arr;
    }
    public int getMin()
    {
        getMinMax();
        return this.MIN;
    }
    public int getMax()
    {
        getMinMax();
        return this.MAX;
    }

    public void getMinMax()
    {
        for(int  i = 0;i<this.arr.length;i++)
        {
            if(MAX<this.arr[i])
            {
                MAX = this.arr[i];
            }
            else if(MIN>this.arr[i])
            {
                MIN = this.arr[i];
            }
        }
    }

}
public class MinMaxElement {
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
        ShowMinMax s1 = new ShowMinMax(arr);
        System.out.println("MAX ELEMENT IN ARRAY IS "+s1.getMax());
        System.out.println("MIN ELEMENT IN ARRAY IS "+s1.getMin());
        sc.close();
    }
    
}
