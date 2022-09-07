package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class ProcessClass12
{
	public int[] getFposSneg(int []arr)
	{
		int []arr2 = new int[arr.length];
		arr2[0] = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(i%2==0&&arr[i]>=0)
			{
				arr2[i] = arr[i];
			}
			else if(i%2!=0&&arr[i]<0)
			{
				arr2[i] = arr[i];
			}
		}
		return arr2;
	}
}
public class MakeAlternatePosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the Size of Array:- ");
	        int size =  sc.nextInt();
	    
	        int arr[] = new int[size];
	        
	        for(int i = 0;i<size;i++)
	        {
	            System.out.print("Enter the Element"+i+":- ");
	            arr[i] = sc.nextInt();
	        }
	        ProcessClass12 pc12 = new ProcessClass12();
	        
	        int arr2[] = new int[arr.length];
	        arr2 = pc12.getFposSneg(arr);
	        System.out.print(Arrays.toString(arr2));
	        sc.close();
	}

}
