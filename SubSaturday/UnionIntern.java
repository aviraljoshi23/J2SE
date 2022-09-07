package SubSaturday;

import java.util.HashSet;

class PrintUnion
{
	public int getUnion(int[]arr,int[]arr2)
	{
        HashSet<Integer> set=new HashSet<>();
        for(int i = 0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int i = 0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }
        return set.size();
	}
}
public class UnionIntern {
	public static void main(String[] args)
	{
		PrintUnion p1 = new PrintUnion();
		int arr[]= {15,14,26,95,74,55};
		int arr2[]= {15,1,6,95,74,55};
		
		System.out.print(p1.getUnion(arr, arr2));
	}
}
