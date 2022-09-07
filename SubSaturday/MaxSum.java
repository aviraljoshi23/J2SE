package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class ProcessClass3
{
	public int getMaxSum(int[]arr)
	{
		Arrays.sort(arr);
		int sum=0;
		for(int  i =0;i<arr.length;i++) {
			sum = (sum+(arr[i]*i));
		}
		
		return sum;
	}
}
public class MaxSum {
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int size =  sc.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0;i<size;i++)
        {
            System.out.print("Enter the Element"+i+":- ");
            arr[i] = sc.nextInt();
        }
        
        ProcessClass3 pc3 = new ProcessClass3();
        System.out.print(pc3.getMaxSum(arr));
        sc.close();
		
	}

}
