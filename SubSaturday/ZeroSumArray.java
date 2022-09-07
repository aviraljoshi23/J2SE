package SubSaturday;

import java.util.HashMap;
import java.util.Scanner;

class ProcessClass5
{
	public int getmaxZeroSum(int[]arr)
	{
        int count=0;
        int sum=0;
        int maxcount=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum,0);
        for(int i=1;i<=arr.length;i++)
        {
        	sum = sum +arr[i-1];
            if(map.containsKey(sum))
            {
            	count=i-map.get(sum);
                if(count>maxcount)
                {
                	maxcount = count;
                }
            }
            map.putIfAbsent(sum,i);
         }
        return maxcount;
	}
}
public class ZeroSumArray {

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
        
        ProcessClass5 pc5 = new ProcessClass5();
        System.out.print(pc5.getmaxZeroSum(arr));
        sc.close();
	}

}
