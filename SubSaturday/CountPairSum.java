package SubSaturday;

import java.util.Scanner;

class ProcessClass7
{
	public int getPairCount(int[]arr,int x)
	{
		int count=0;
		 for(int i = 0;i<arr.length;i++)
		 {
			 for(int j =i;j<arr.length;j++)
			 {
				 if((arr[i]+arr[j])==x)
				 {
					 count++;
				 }
			 }
		 }
		 if(count>0)
		 {
			 return count;
		 }
		 else
		 {
			 return -1;
		 }
	}
}
public class CountPairSum {

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
	        
	        ProcessClass7 pc7 = new ProcessClass7();
	        
	        System.out.print("Total Pair Count:- "+pc7.getPairCount(arr,8));
	            
	        sc.close();

	}

}
