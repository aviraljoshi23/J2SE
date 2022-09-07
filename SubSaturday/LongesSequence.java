package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class ProcessClass2
{
	public int getMaxSubSeq(int []arr)
	{
		Arrays.sort(arr);
		int count=0;
		for(int i = 1;i<arr.length+1;i++)
		{
			if(i==arr[count])
			{
				count++;
			}
			
		}
		if(count==0)
		{
			return -1;
		}
		else
		{
			return count;
		}
		
	}
	
}
public class LongesSequence {
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
        
        ProcessClass2 pc2 = new ProcessClass2();
        System.out.print(pc2.getMaxSubSeq(arr));
        sc.close();
	}
}
