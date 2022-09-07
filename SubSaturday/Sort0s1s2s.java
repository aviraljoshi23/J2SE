package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class ThreeElementSort{
	
	public int[] getSort0s1s2s(int[]arr)
	{
		int counter[] = {0,0,0};
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			counter[arr[i]]++;
		}
		while(counter[0]-->0)
		{
			arr[index++] = 0;
		}
		while(counter[1]-->0)
		{
			arr[index++] = 1;
		}
		while(counter[2]-->0)
		{
			arr[index++] = 2;
		}
		return arr;
	}
	
}

public class Sort0s1s2s {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ThreeElementSort t1 = new ThreeElementSort();
		int []arr = {0,1,0,2,1,1,0};
		
		arr = t1.getSort0s1s2s(arr);
		System.out.print(Arrays.toString(arr));
		sc.close();
		
	}
}
