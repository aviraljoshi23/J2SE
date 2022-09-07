package SubSaturday;

import java.util.Scanner;

class ProcessClass
{
	public int getSubArraySum(int arr[])
	{
		int currSum=0;
		int maxSum = 0;
		for(int i =0;i<arr.length;i++)
		{
			currSum = currSum+arr[i];
			if(currSum>maxSum)
			{
				maxSum = currSum;
			}
			else if(currSum<0)
			{
				currSum=0;
			}
		}
		return maxSum;
	}
}
public class MaxSubArraysum {

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
        
        ProcessClass pc1 = new ProcessClass();
        System.out.print(pc1.getSubArraySum(arr));
        sc.close();
	}

}
