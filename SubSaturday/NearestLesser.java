package SubSaturday;

import java.util.Scanner;

class ProcessClass9
{
	public void getNearMaxMin(int[]arr,int x)
	{
		int min = -2147483648,max = 2147483647;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>x&&arr[i]<max)
				max = arr[i];
			if(arr[i]<x&&min<arr[i])
				min = arr[i];
		}
		if(min!= -2147483648)
			System.out.print(min);
		else
			System.out.println("No Min Element");
		if(max!= 2147483647)
			System.out.print(max);
		else
			System.out.println("No Max Element");
	}
}
public class NearestLesser {

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
	        
	        ProcessClass9 pc9 = new ProcessClass9();
	        pc9.getNearMaxMin(arr,74);                
	        sc.close();


	}

}
