package SubSaturday;

import java.util.Scanner;

class ProcessClass11
{
	public int getFirstNonReapeating(int []arr)
	{
		int count=0;
		int s=0;
		for(int i = 0;i<arr.length;i++)
		{
			count=0;
			for(int j =0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&i!=j)
				{
					count++;
				}
			}
			if(count==0)
			{
				s=i;
				break;
			}
		}
		return s;
	}
	
}
public class FirstNonReapeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		ProcessClass11 pc10 = new ProcessClass11();
		
        System.out.println("Enter the Size of Array:- ");
        int size =  sc.nextInt();
    
        int arr[] = new int[size];
        
        for(int i = 0;i<size;i++)
        {
            System.out.print("Enter the Element"+i+":- ");
            arr[i] = sc.nextInt();
        }
        System.out.print("First Non Reapeating:- "+pc10.getFirstNonReapeating(arr));
        sc.close();
	}

}
