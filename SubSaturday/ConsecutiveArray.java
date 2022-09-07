package SubSaturday;

import java.util.*;

class ConsecutiveArray
{
    public int getLongesCons(int arr[])
    {
        Arrays.sort(arr);
        int count=0;
        for(int i=1;i<arr.length;i++)
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
        else{
            return count;
        }
    }
}
class TestMain
{
    public static void main(String[] args) {
        		
		Scanner sc  = new Scanner(System.in);
		ConsecutiveArray c1 = new ConsecutiveArray();
		
        System.out.println("Enter the Size of Array:- ");
        int size =  sc.nextInt();
    
        int arr[] = new int[size];
        
        for(int i = 0;i<size;i++)
        {
            System.out.print("Enter the Element"+i+":- ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Longest Consecutive Array:- "+c1.getLongesCons(arr));
        sc.close();
    }
    
}