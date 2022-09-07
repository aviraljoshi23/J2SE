package SubSaturday;

import java.util.ArrayList;
import java.util.Scanner;

class ProcessClass13
{
	public ArrayList<Integer> getSubArray(int arr[],int x)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int sum=0,index=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum==x)
			{
				list.add(index+1);
				list.add(i+1);
				return list;
			}
			else if(sum>x)
			{
				sum=0;
				i=index;
				index++;
			}
		}
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(-1);
		return list2;
		
	}
}
public class SubArraySum {

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
	        
	        ProcessClass13 pc13 = new ProcessClass13();
	        ArrayList<Integer> list =  new ArrayList<>(pc13.getSubArray(arr,15));
	        
			for(int i = 0; i < list.size(); i++) {   
			    System.out.print(list.get(i)+" ");
			}
	        sc.close();
	}

}
