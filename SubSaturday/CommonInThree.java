package SubSaturday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class ProcessClass8
{
    public ArrayList<Integer> commonElements(int A[], int B[], int C[]) 
    {
        // code here 
    	HashSet<Integer> list =new HashSet<>();
        for(int i = 0;i<A.length;i++)
        {
        	for(int j = 0;j<B.length;j++)
        	{
        		for(int k =0;k<C.length;k++)
        		{
        			if(A[i]==B[j]&&B[j]==C[k]&&A[i]==C[k])
        			{
        				list.add(A[i]);
        			}
        		}
        	}
        }
        ArrayList<Integer> list2 = new ArrayList<>(list);
        Collections.sort(list2);
        return (list2);
    }
}
public class CommonInThree {
	public static void main(String args[])
	{
		// int arr1[] = {10,20,30,50,44,6,9};
		// int arr2[] = {78,20,55,20,62,12,35,44};
		// int arr3[] = {41,25,36,20,495,6,44,10};

		int arr1[] = {3,3,3,3,3};
		int arr2[] = {3,3,3,3,3};
		int arr3[] = {3,3,3,3,3};
		
		ProcessClass8 pc8 = new ProcessClass8();
		ArrayList<Integer>list2 = pc8.commonElements(arr1, arr2, arr3);
		
		for(int i = 0; i < list2.size(); i++) {   
		    System.out.print(list2.get(i)+" ");
		} 
	}
}
